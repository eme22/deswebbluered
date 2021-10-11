package com.eme22.deswebbluered.model;

public class Trabajador extends Persona{

    private int trabajadorID;
    private String trabajadorEstado;

    public Trabajador(int personaID, int personaDNI, String personaApellido1, String personaApellido2, String personaNombre, int personaEdad, boolean personaSexo, String personaDireccion, int personaTelefono, String personaCorreo, String personaPassword, int trabajadorID, String trabajadorEstado) {
        super(personaID, personaDNI, personaApellido1, personaApellido2, personaNombre, personaEdad, personaSexo, personaDireccion, personaTelefono, personaCorreo, personaPassword);
        this.trabajadorID = trabajadorID;
        this.trabajadorEstado = trabajadorEstado;
    }

    public Trabajador() {
        super();
    }

    public int getTrabajadorID() {
        return trabajadorID;
    }

    public void setTrabajadorID(int trabajadorID) {
        this.trabajadorID = trabajadorID;
    }

    public String getTrabajadorEstado() {
        return trabajadorEstado;
    }

    public void setTrabajadorEstado(String trabajadorEstado) {
        this.trabajadorEstado = trabajadorEstado;
    }
}
