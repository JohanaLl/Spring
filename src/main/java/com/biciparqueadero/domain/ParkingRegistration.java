package com.biciparqueadero.domain;

import com.biciparqueadero.persistence.entity.RegistroParqueaderoPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;

import java.time.LocalDateTime;

public class ParkingRegistration {
    private int parkingRegistrationid;
    private LocalDateTime dateTimeInput;
    private LocalDateTime dateTimeOutput;

    public int getParkingRegistrationid() {
        return parkingRegistrationid;
    }

    public void setParkingRegistrationid(int parkingRegistrationid) {
        this.parkingRegistrationid = parkingRegistrationid;
    }

    public LocalDateTime getDateTimeInput() {
        return dateTimeInput;
    }

    public void setDateTimeInput(LocalDateTime dateTimeInput) {
        this.dateTimeInput = dateTimeInput;
    }

    public LocalDateTime getDateTimeOutput() {
        return dateTimeOutput;
    }

    public void setDateTimeOutput(LocalDateTime dateTimeOutput) {
        this.dateTimeOutput = dateTimeOutput;
    }
}
