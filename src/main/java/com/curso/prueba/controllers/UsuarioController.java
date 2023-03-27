package com.curso.prueba.controllers;

import com.curso.prueba.dao.UsuarioDAO;
import com.curso.prueba.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController  {
    @Autowired
    private UsuarioDAO usuarioDAO;


    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario() {
        /*List<Usuario> users=new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setID(34L);
        usuario.setNombre("nelson");
        usuario.setApellido("eustaquio");
        usuario.setTelefono("3223235");
        usuario.setPassword("dcw2");
        users.add(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setID(25L);
        usuario2.setNombre("kris");
        usuario2.setApellido("escobar");
        usuario2.setTelefono("335");
        usuario2.setPassword("fdcw2");
        users.add(usuario2);

        return users;*/
        return usuarioDAO.getUsuario();
    }

}