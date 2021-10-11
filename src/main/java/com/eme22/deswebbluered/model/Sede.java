package com.eme22.deswebbluered.model;

public class Sede {

    private int sedeID;
    private String sedeNombre;
    private String sedeDireccion;
    private String sedeDescripcion;
    private int sedeTelefono;

    public Sede(int sedeID, String sedeNombre, String sedeDireccion, String sedeDescripcion, int sedeTelefono) {
        this.sedeID = sedeID;
        this.sedeNombre = sedeNombre;
        this.sedeDireccion = sedeDireccion;
        this.sedeDescripcion = sedeDescripcion;
        this.sedeTelefono = sedeTelefono;
    }

    public int getSedeID() {
        return sedeID;
    }

    public void setSedeID(int sedeID) {
        this.sedeID = sedeID;
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public String getSedeDireccion() {
        return sedeDireccion;
    }

    public void setSedeDireccion(String sedeDireccion) {
        this.sedeDireccion = sedeDireccion;
    }

    public String getSedeDescripcion() {
        return sedeDescripcion;
    }

    public void setSedeDescripcion(String sedeDescripcion) {
        this.sedeDescripcion = sedeDescripcion;
    }

    public int getSedeTelefono() {
        return sedeTelefono;
    }

    public void setSedeTelefono(int sedeTelefono) {
        this.sedeTelefono = sedeTelefono;
    }
}
