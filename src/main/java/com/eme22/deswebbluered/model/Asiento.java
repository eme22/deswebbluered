package com.eme22.deswebbluered.model;

public class Asiento {

    private int asientoID;
    private int asientoBusID;
    private int asientoNumero;
    private int asientoPiso;

    public Asiento(int asientoID, int asientoBusID, int asientoNumero, int asientoPiso) {
        this.asientoID = asientoID;
        this.asientoBusID = asientoBusID;
        this.asientoNumero = asientoNumero;
        this.asientoPiso = asientoPiso;
    }

    public int getAsientoID() {
        return asientoID;
    }

    public void setAsientoID(int asientoID) {
        this.asientoID = asientoID;
    }

    public int getAsientoBusID() {
        return asientoBusID;
    }

    public void setAsientoBusID(int asientoBusID) {
        this.asientoBusID = asientoBusID;
    }

    public int getAsientoNumero() {
        return asientoNumero;
    }

    public void setAsientoNumero(int asientoNumero) {
        this.asientoNumero = asientoNumero;
    }

    public int getAsientoPiso() {
        return asientoPiso;
    }

    public void setAsientoPiso(int asientoPiso) {
        this.asientoPiso = asientoPiso;
    }
}
