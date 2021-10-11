package com.eme22.deswebbluered.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {


    private static Conexion instance;
    private Connection connection;
    private String url = "jdbc:mariadb://localhost/dbbuses2";
    private String username = "root";
    private String password = "";

    private Conexion() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public static Conexion getInstancia() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new Conexion();
        } else if (instance.getConnection().isClosed()) {
            instance = new Conexion();
        }

        return instance;
    }


    // STATIC UTLIES

    //EJECUTAR UN STATEMENT
    public static boolean execStatement(PreparedStatement pst, PreparedStatement pst2, Connection cn) throws SQLException {
        int n = pst.executeUpdate();

        if (n != 0) {
            int n2 = pst2.executeUpdate();

            if (n2 != 0) {
                cn.close();
                return true;
            }

        }
        cn.close();
        return false;
    }

    //EJECUTAR UN STATEMENT
    public static boolean execStatement(PreparedStatement pst, Connection cn) throws SQLException {
        int n = pst.executeUpdate();

        if (n != 0) {
                cn.close();
                return true;
        }
        cn.close();
        return false;
    }

}
