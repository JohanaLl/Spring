package com.biciparqueadero.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "registro_parqueadero")
public class RegistroParqueadero {

    @EmbeddedId
    private RegistroParqueaderoPK id;
    @Column(name = "fecha_hora_entrada")
    private LocalDateTime fechaHoraEntrada;
    @Column(name = "fecha_hora_salida")
    private LocalDateTime fechaHoraSalida;
    @ManyToOne
    @MapsId("idParqueadero")
    @JoinColumn(name = "id_parqueadero", insertable = false, updatable = false)
    private Parqueadero parqueadero;
    @OneToOne
    @MapsId("idBicicleta")
    private Bicicleta bicicleta;

    public RegistroParqueaderoPK getId() {
        return id;
    }

    public void setId(RegistroParqueaderoPK id) {
        this.id = id;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(LocalDateTime fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
}
