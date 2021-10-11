package com.eme22.deswebbluered.interfaces;

import com.eme22.deswebbluered.model.Trabajador;

import java.sql.SQLException;
import java.util.ArrayList;

public interface TrabajadorInterface {

    ArrayList<Trabajador> mostraTodos() throws SQLException;
    ArrayList<Trabajador> buscar(String busqueda, int tipo) throws SQLException;
    boolean insertar(Trabajador dts) throws SQLException;
    boolean editar(Trabajador dts) throws SQLException;
    boolean eliminar(Trabajador dts) throws SQLException;
    boolean eliminar(int dts) throws SQLException;
    int login(String correo, String contrasenia) throws SQLException;


}
