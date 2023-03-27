package com.curso.prueba.dao;

import com.curso.prueba.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class UsuarioDAOimp implements UsuarioDAO{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public List<Usuario> getUsuario() {

        String query="FROM usuarios";
        List<Usuario> array=entityManager.createQuery(query).getResultList();
        System.out.println("tamanio ->"+array.size()) ;
        return array;
    }
}
