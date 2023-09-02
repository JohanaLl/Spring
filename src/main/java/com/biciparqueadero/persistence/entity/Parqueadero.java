package com.biciparqueadero.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "parqueadero")
public class Parqueadero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_parqueadero")
    private Integer idParqueadero;
    @Column(name = "capacidad_total")
    private String capacidadTotal;
    @Column(name = "capacidad_disponible")
    private String capacidadDisponible;
    @ManyToOne
    @JoinColumn(name = "id_centro", insertable = false, updatable = false)
    private CentroComercial centroComercial;
    @OneToMany(mappedBy = "parqueadero")
    private List<RegistroParqueadero> registrosList;

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public String getCapacidadDisponible() {
        return capacidadDisponible;
    }

    public void setCapacidadDisponible(String capacidadDisponible) {
        this.capacidadDisponible = capacidadDisponible;
    }

    public CentroComercial getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(CentroComercial centroComercial) {
        this.centroComercial = centroComercial;
    }

    public List<RegistroParqueadero> getRegistrosList() {
        return registrosList;
    }

    public void setRegistrosList(List<RegistroParqueadero> registrosList) {
        this.registrosList = registrosList;
    }
}
