package com.eme22.deswebbluered.model;

import java.util.Date;

public class Reserva {

    private int reservaID;
    private int reservaClienteID;
    private int reservaBusID;
    private int reservaViajeID;
    private Date reservaFecha;

    public Reserva(int reservaID, int reservaClienteID, int reservaBusID, int reservaViajeID, Date reservaFecha) {
        this.reservaID = reservaID;
        this.reservaClienteID = reservaClienteID;
        this.reservaBusID = reservaBusID;
        this.reservaViajeID = reservaViajeID;
        this.reservaFecha = reservaFecha;
    }

    public Reserva() {

    }

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }

    public int getReservaClienteID() {
        return reservaClienteID;
    }

    public void setReservaClienteID(int reservaClienteID) {
        this.reservaClienteID = reservaClienteID;
    }

    public int getReservaBusID() {
        return reservaBusID;
    }

    public void setReservaBusID(int reservaBusID) {
        this.reservaBusID = reservaBusID;
    }

    public int getReservaViajeID() {
        return reservaViajeID;
    }

    public void setReservaViajeID(int reservaViajeID) {
        this.reservaViajeID = reservaViajeID;
    }

    public Date getReservaFecha() {
        return reservaFecha;
    }

    public void setReservaFecha(Date reservaFecha) {
        this.reservaFecha = reservaFecha;
    }
}
