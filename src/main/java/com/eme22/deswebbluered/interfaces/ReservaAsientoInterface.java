package com.eme22.deswebbluered.interfaces;

import com.eme22.deswebbluered.model.ReservaAsiento;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservaAsientoInterface {

    ArrayList<ReservaAsiento> mostraTodos() throws SQLException;

}
