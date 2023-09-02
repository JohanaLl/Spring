package com.biciparqueadero.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RegistroParqueaderoPK implements Serializable {
    @Column(name = "id_bicicleta")
    private Integer idBicicleta;
    @Column(name = "id_parqueadero")
    private Integer idParqueadero;

    public Integer getIdBicicleta() {
        return idBicicleta;
    }

    public void setIdBicicleta(Integer idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }
}
