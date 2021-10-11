package com.eme22.deswebbluered.interfaces;

import com.eme22.deswebbluered.model.Sede;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SedeInterface {

    ArrayList<Sede> mostraTodas() throws SQLException;
    ArrayList<Sede> buscar(String busqueda, int tipo) throws SQLException;
    boolean insertar(Sede dts) throws SQLException;
    boolean editar(Sede dts) throws SQLException;
    boolean eliminar(Sede dts) throws SQLException;
    boolean eliminar(int dts) throws SQLException;

}
