package com.eme22.deswebbluered.model;

import java.util.Date;

public class Viaje {

    private int viajeID;
    private int viajeBusID;
    private int viajeSedeDesinoID;
    private int viajeSedeOrigenID;
    private Date viajeFechaSalida;
    private Date viajeFechaLlegada;
    private int viajePrecioAsiento;
    private int viajePrecioSiEsMenor;

    public Viaje(int viajeID, int viajeBusID, int viajeSedeDesinoID, int viajeSedeOrigenID, Date viajeFechaSalida, Date viajeFechaLlegada, int viajePrecioAsiento, int viajePrecioSiEsMenor) {
        this.viajeID = viajeID;
        this.viajeBusID = viajeBusID;
        this.viajeSedeDesinoID = viajeSedeDesinoID;
        this.viajeSedeOrigenID = viajeSedeOrigenID;
        this.viajeFechaSalida = viajeFechaSalida;
        this.viajeFechaLlegada = viajeFechaLlegada;
        this.viajePrecioAsiento = viajePrecioAsiento;
        this.viajePrecioSiEsMenor = viajePrecioSiEsMenor;
    }

    public int getViajeID() {
        return viajeID;
    }

    public void setViajeID(int viajeID) {
        this.viajeID = viajeID;
    }

    public int getViajeBusID() {
        return viajeBusID;
    }

    public void setViajeBusID(int viajeBusID) {
        this.viajeBusID = viajeBusID;
    }

    public int getViajeSedeDesinoID() {
        return viajeSedeDesinoID;
    }

    public void setViajeSedeDesinoID(int viajeSedeDesinoID) {
        this.viajeSedeDesinoID = viajeSedeDesinoID;
    }

    public int getViajeSedeOrigenID() {
        return viajeSedeOrigenID;
    }

    public void setViajeSedeOrigenID(int viajeSedeOrigenID) {
        this.viajeSedeOrigenID = viajeSedeOrigenID;
    }

    public Date getViajeFechaSalida() {
        return viajeFechaSalida;
    }

    public void setViajeFechaSalida(Date viajeFechaSalida) {
        this.viajeFechaSalida = viajeFechaSalida;
    }

    public Date getViajeFechaLlegada() {
        return viajeFechaLlegada;
    }

    public void setViajeFechaLlegada(Date viajeFechaLlegada) {
        this.viajeFechaLlegada = viajeFechaLlegada;
    }

    public int getViajePrecioAsiento() {
        return viajePrecioAsiento;
    }

    public void setViajePrecioAsiento(int viajePrecioAsiento) {
        this.viajePrecioAsiento = viajePrecioAsiento;
    }

    public int getViajePrecioSiEsMenor() {
        return viajePrecioSiEsMenor;
    }

    public void setViajePrecioSiEsMenor(int viajePrecioSiEsMenor) {
        this.viajePrecioSiEsMenor = viajePrecioSiEsMenor;
    }
}
