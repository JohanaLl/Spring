package com.biciparqueadero.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bicicleta")
public class Bicicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bicicleta")
    private Integer idBicicleta;
    private String modelo;
    private String color;
    private String foto;
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Usuario usuario;
    @OneToOne
    private RegistroParqueadero registro;

    public Integer getIdBicicleta() {
        return idBicicleta;
    }

    public void setIdBicicleta(Integer idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public RegistroParqueadero getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroParqueadero registro) {
        this.registro = registro;
    }
}
