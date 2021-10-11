package com.eme22.deswebbluered.model;

public class Bus {

    private int busID;
    private int busPlaca;
    private int busPisos;
    private int busAsientos;

    public Bus(int busID, int busPlaca, int busPisos, int busAsientos) {
        this.busID = busID;
        this.busPlaca = busPlaca;
        this.busPisos = busPisos;
        this.busAsientos = busAsientos;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public int getBusPlaca() {
        return busPlaca;
    }

    public void setBusPlaca(int busPlaca) {
        this.busPlaca = busPlaca;
    }

    public int getBusPisos() {
        return busPisos;
    }

    public void setBusPisos(int busPisos) {
        this.busPisos = busPisos;
    }

    public int getBusAsientos() {
        return busAsientos;
    }

    public void setBusAsientos(int busAsientos) {
        this.busAsientos = busAsientos;
    }
}
