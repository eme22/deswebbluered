package com.eme22.deswebbluered.dao;

import com.eme22.deswebbluered.interfaces.AsientoInterface;
import com.eme22.deswebbluered.model.Asiento;

import java.sql.SQLException;
import java.util.ArrayList;

public class AsientoDAO implements AsientoInterface {

    @Override
    public ArrayList<Asiento> mostraTodos() throws SQLException {
        return null;
    }

    @Override
    public ArrayList<Asiento> buscar(String busqueda, int tipo) throws SQLException {
        return null;
    }

    @Override
    public boolean insertar(Asiento dts) throws SQLException {
        return false;
    }

    @Override
    public boolean editar(Asiento dts) throws SQLException {
        return false;
    }

    @Override
    public boolean eliminar(Asiento dts) throws SQLException {
        return false;
    }

    @Override
    public boolean eliminar(int dts) throws SQLException {
        return false;
    }
}
