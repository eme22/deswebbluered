package com.eme22.deswebbluered.interfaces;

import com.eme22.deswebbluered.model.Cliente;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ClienteInterface {

    ArrayList<Cliente> mostraTodos() throws SQLException;
    ArrayList<Cliente> buscar(String busqueda, int tipo) throws SQLException;
    boolean insertar(Cliente dts) throws SQLException;
    boolean editar(Cliente dts) throws SQLException;
    boolean eliminar(Cliente dts) throws SQLException;
    boolean eliminar(int dts) throws SQLException;
    int login(String correo, String contrasenia) throws SQLException;

}
