package com.eme22.deswebbluered.interfaces;

import com.eme22.deswebbluered.model.Bus;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BusInterface {

    ArrayList<Bus> mostraTodos() throws SQLException;
    ArrayList<Bus> buscar(String busqueda, int tipo) throws SQLException;
    boolean insertar(Bus dts) throws SQLException;
    boolean editar(Bus dts) throws SQLException;
    boolean eliminar(Bus dts) throws SQLException;
    boolean eliminar(int dts) throws SQLException;

}
