// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#tabusuarios').DataTable();
});
async function cargarUsuarios(){
//https://stackoverflow.com/questions/29775797/fetch-post-json-data
//(async () => {
  const RequestUsers = await fetch('usuarios', {
    method: 'GET',//'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    //body: JSON.stringify({a: 1, b: 'Textual content'})
  });
  const usuarios = await RequestUsers.json();

  console.log(usuarios);
  let listado='';
    for (let user1 of usuarios ){
        let userhtml='<tr><td>'+user1.id+'</td> <td>'+user1.nombre +'</td><td>'+user1.apellido+'</td><td>'+ user1.telefono+'</td><td>'+user1.password+'</td><td><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a></td></tr>';
        listado+=userhtml;
    }
  document.querySelector('#tabusuarios tbody').outerHTML=listado;

//})();

}