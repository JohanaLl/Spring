package com.biciparqueadero.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    private Integer id;
    private String nombre;
    private String apellidos;
    @Column(name = "correo_electronico")
    private String correoEclectronico;
    @OneToMany(mappedBy = "usuario")
    private List<Bicicleta> bicicletaList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoEclectronico() {
        return correoEclectronico;
    }

    public void setCorreoEclectronico(String correoEclectronico) {
        this.correoEclectronico = correoEclectronico;
    }

    public List<Bicicleta> getBicicletaList() {
        return bicicletaList;
    }

    public void setBicicletaList(List<Bicicleta> bicicletaList) {
        this.bicicletaList = bicicletaList;
    }
}
