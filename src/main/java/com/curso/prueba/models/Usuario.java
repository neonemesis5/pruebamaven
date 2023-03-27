package com.curso.prueba.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "usuarios")
public class Usuario{

    @Id
    @Getter @Setter @Column(name="ID")
    private Long ID;
    @Getter @Setter @Column(name="NOMBRE")
    private String Nombre;
    @Getter @Setter  @Column(name="APELLIDO")
    private String Apellido;
    @Getter @Setter @Column(name="TELEFONO")
    private String Telefono;
    @Getter @Setter @Column(name="PASSWORD")
    private String password;


}
