package com.eme22.deswebbluered.interfaces;

import com.eme22.deswebbluered.model.Persona;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PersonaInterface {

    ArrayList<Persona> mostraTodos() throws SQLException;

}
