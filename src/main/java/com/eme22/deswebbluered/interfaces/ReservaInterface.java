package com.eme22.deswebbluered.interfaces;

import com.eme22.deswebbluered.model.Reserva;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservaInterface {

    ArrayList<Reserva> mostraTodas() throws SQLException;
    ArrayList<Reserva> mostraTodas(int dts) throws SQLException;
    ArrayList<Reserva> buscar(String busqueda, int tipo) throws SQLException;
    boolean insertar(Reserva dts) throws SQLException;
    boolean editar(Reserva dts) throws SQLException;
    boolean eliminar(Reserva dts) throws SQLException;
    boolean eliminar(int dts) throws SQLException;

}
