package com.eme22.deswebbluered.model;

public class Persona {

    private int personaID;
    private int personaDNI;
    private String personaApellido1;
    private String personaApellido2;
    private String personaNombre;
    private int personaEdad;
    private boolean personaSexo;
    private String personaDireccion;
    private int personaTelefono;
    private String personaCorreo;
    private String personaPassword;

    public Persona() {
    }

    public Persona(int personaID, int personaDNI, String personaApellido1, String personaApellido2, String personaNombre, int personaEdad, boolean personaSexo, String personaDireccion, int personaTelefono, String personaCorreo, String personaPassword) {
        this.personaID = personaID;
        this.personaDNI = personaDNI;
        this.personaApellido1 = personaApellido1;
        this.personaApellido2 = personaApellido2;
        this.personaNombre = personaNombre;
        this.personaEdad = personaEdad;
        this.personaSexo = personaSexo;
        this.personaDireccion = personaDireccion;
        this.personaTelefono = personaTelefono;
        this.personaCorreo = personaCorreo;
        this.personaPassword = personaPassword;
    }

    public int getPersonaID() {
        return personaID;
    }

    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }

    public int getPersonaDNI() {
        return personaDNI;
    }

    public void setPersonaDNI(int personaDNI) {
        this.personaDNI = personaDNI;
    }

    public String getPersonaApellido1() {
        return personaApellido1;
    }

    public void setPersonaApellido1(String personaApellido1) {
        this.personaApellido1 = personaApellido1;
    }

    public String getPersonaApellido2() {
        return personaApellido2;
    }

    public void setPersonaApellido2(String personaApellido2) {
        this.personaApellido2 = personaApellido2;
    }

    public String getPersonaNombre() {
        return personaNombre;
    }

    public void setPersonaNombre(String personaNombre) {
        this.personaNombre = personaNombre;
    }

    public int getPersonaEdad() {
        return personaEdad;
    }

    public void setPersonaEdad(int personaEdad) {
        this.personaEdad = personaEdad;
    }

    public boolean isPersonaSexo() {
        return personaSexo;
    }

    public void setPersonaSexo(boolean personaSexo) {
        this.personaSexo = personaSexo;
    }

    public String getPersonaDireccion() {
        return personaDireccion;
    }

    public void setPersonaDireccion(String personaDireccion) {
        this.personaDireccion = personaDireccion;
    }

    public int getPersonaTelefono() {
        return personaTelefono;
    }

    public void setPersonaTelefono(int personaTelefono) {
        this.personaTelefono = personaTelefono;
    }

    public String getPersonaCorreo() {
        return personaCorreo;
    }

    public void setPersonaCorreo(String personaCorreo) {
        this.personaCorreo = personaCorreo;
    }

    public String getPersonaPassword() {
        return personaPassword;
    }

    public void setPersonaPassword(String personaPassword) {
        this.personaPassword = personaPassword;
    }
}
