package com.eme22.deswebbluered.model;

public class Cliente extends Persona {

    private int clienteID;
    private int clienteReservasActivas;

    public Cliente(int personaID, int personaDNI, String personaApellido1, String personaApellido2, String personaNombre, int personaEdad, boolean personaSexo, String personaDireccion, int personaTelefono, String personaCorreo, String personaPassword, int clienteCodigo, int clienteReservasActivas) {
        super(personaID, personaDNI, personaApellido1, personaApellido2, personaNombre, personaEdad, personaSexo, personaDireccion, personaTelefono, personaCorreo, personaPassword);
        this.clienteID = clienteCodigo;
        this.clienteReservasActivas = clienteReservasActivas;
    }

    public Cliente() {

    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getClienteReservasActivas() {
        return clienteReservasActivas;
    }

    public void setClienteReservasActivas(int clienteReservasActivas) {
        this.clienteReservasActivas = clienteReservasActivas;
    }
}
