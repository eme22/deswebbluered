package com.eme22.deswebbluered.dao;

import com.eme22.deswebbluered.interfaces.TrabajadorInterface;
import com.eme22.deswebbluered.model.Trabajador;
import com.eme22.deswebbluered.util.Conexion;

import java.sql.*;
import java.util.ArrayList;

import static com.eme22.deswebbluered.util.Conexion.execStatement;

public class TrabajadorDAO implements TrabajadorInterface {

    private ResultSet rs = null;
    private static Connection cn;
    private String sSQL = "";
    private String sSQL2 = "";

    public TrabajadorDAO() throws ClassNotFoundException {
        try {
            cn = Conexion.getInstancia().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Trabajador> mostraTodos() throws SQLException {

        ArrayList<Trabajador> data = new ArrayList<>();

        sSQL = "SELECT p.PersonaID, p.PersonaDNI, t.TrabajadorID, t.TrabajadorEstado, p.PersonaApellidoM, " +
                "p.PersonaApellidoP, p.PersonaNombre, p.PersonaContrasenia, p.PersonaCorreo, " +
                "p.PersonaDireccion, p.PersonaEdad, p.PersonaSexo, p.PersonaTelefono " +
                "from persona p inner join trabajador t on p.PersonaID=t.PersonaID order by PersonaID desc";

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        if (rs.next()) {
            Trabajador registro = new Trabajador();
            registro.setPersonaID(Integer.parseInt(rs.getString("PersonaID")));
            registro.setPersonaDNI(Integer.parseInt(rs.getString("PersonaDNI")));
            registro.setTrabajadorID(Integer.parseInt(rs.getString("TrabajadorID")));
            registro.setTrabajadorEstado(rs.getString("TrabajadorEstado"));
            registro.setPersonaApellido1(rs.getString("PersonaApellidoP"));
            registro.setPersonaApellido2(rs.getString("PersonaApellidoM"));
            registro.setPersonaNombre(rs.getString("PersonaNombre"));
            registro.setPersonaCorreo(rs.getString("PersonaCorreo"));
            registro.setPersonaPassword(rs.getString("PersonaContrasenia"));
            registro.setPersonaDireccion(rs.getString("PersonaDireccion"));
            registro.setPersonaEdad(Integer.parseInt(rs.getString("PersonaEdad")));
            registro.setPersonaSexo(rs.getBoolean("PersonaSexo"));
            registro.setPersonaTelefono(Integer.parseInt(rs.getString("PersonaTelefono")));

            data.add(registro);

        }
        cn.close();

        return data;

    }
    @Override
    public ArrayList<Trabajador> buscar(String busqueda, int tipo) throws SQLException {

        ArrayList<Trabajador> data = new ArrayList<>();

        String tipo2;
        switch (tipo){
            default: tipo2 = "t.TrabajadorID"; break;
            case 1: tipo2 = "p.PersonaID"; break;
            case 2: tipo2 = "t.TrabajadorEstado"; break;
            case 3: tipo2 = "p.PersonaApellidoP"; break;
            case 4: tipo2 = "p.PersonaNombre"; break;
            case 5: tipo2 = "p.PersonaTelefono"; break;

        }

        sSQL = "SELECT p.PersonaID, p.PersonaDNI, t.TrabajadorID, t.TrabajadorEstado, p.PersonaApellidoM, " +
                "p.PersonaApellidoP, p.PersonaNombre, p.PersonaContrasenia, p.PersonaCorreo, " +
                "p.PersonaDireccion, p.PersonaEdad, p.PersonaSexo, p.PersonaTelefono " +
                "from persona p inner join trabajador t on p.PersonaID=t.PersonaID where "+ tipo2 +" like '%" +
                busqueda + "%' order by PersonaID desc";

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        if (rs.next()) {
            Trabajador registro = new Trabajador();
            registro.setPersonaID(Integer.parseInt(rs.getString("PersonaID")));
            registro.setPersonaDNI(Integer.parseInt(rs.getString("PersonaDNI")));
            registro.setTrabajadorID(Integer.parseInt(rs.getString("TrabajadorID")));
            registro.setTrabajadorEstado(rs.getString("TrabajadorEstado"));
            registro.setPersonaApellido1(rs.getString("PersonaApellidoP"));
            registro.setPersonaApellido2(rs.getString("PersonaApellidoM"));
            registro.setPersonaNombre(rs.getString("PersonaNombre"));
            registro.setPersonaCorreo(rs.getString("PersonaCorreo"));
            registro.setPersonaPassword(rs.getString("PersonaContrasenia"));
            registro.setPersonaDireccion(rs.getString("PersonaDireccion"));
            registro.setPersonaEdad(Integer.parseInt(rs.getString("PersonaEdad")));
            registro.setPersonaSexo(rs.getBoolean("PersonaSexo"));
            registro.setPersonaTelefono(Integer.parseInt(rs.getString("PersonaTelefono")));

            data.add(registro);

        }
        cn.close();

        return data;

    }

    @Override
    public int login(String correo, String contrasenia) throws SQLException {
        sSQL = "SELECT t.TrabajadorID, p.PersonaContrasenia " +
                "from persona p inner join trabajador t on p.PersonaID=t.PersonaID " +
                "where p.PersonaCorreo like '%" + correo + "%' order by p.PersonaID desc";

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        if (rs.next()) {
            String contraseniaPrueba = rs.getString("PersonaContrasenia");
            if (contrasenia.equals(contraseniaPrueba))
                return Integer.parseInt(rs.getString("TrabajadorID"));
        }
        return -1;
    }
    @Override
    public boolean insertar(Trabajador dts) throws SQLException {

        sSQL = "insert into persona " +
                "(PersonaID, PersonaDNI, PersonaApellidoP, PersonaApellidoM,PersonaNombre,PersonaEdad,PersonaSexo, PersonaDireccion,PersonaTelefono,PersonaCorreo, PersonaContrasenia) " +
                "values (0,?,?,?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into trabajador (PersonaID,TrabajadorEstado) values ((select PersonaID from persona order by PersonaID desc limit 1),?)";

        PreparedStatement pst = cn.prepareStatement(sSQL);
        PreparedStatement pst2 = cn.prepareStatement(sSQL2);

        pst.setInt(1, dts.getPersonaDNI());
        pst.setString(2, dts.getPersonaApellido1());
        pst.setString(3, dts.getPersonaApellido2());
        pst.setString(4, dts.getPersonaNombre());
        pst.setInt(5, dts.getPersonaEdad());
        pst.setInt(6, dts.isPersonaSexo() ? 1 : 0);
        pst.setString(7, dts.getPersonaDireccion());
        pst.setInt(8, dts.getPersonaTelefono());
        pst.setString(9, dts.getPersonaCorreo());
        pst.setString(10, dts.getPersonaPassword());

        pst2.setString(1, dts.getTrabajadorEstado());

        return execStatement(pst, pst2, cn);
    }
    @Override
    public boolean eliminar(Trabajador dts) throws SQLException {
        sSQL = "delete from trabajador where PersonaID=?";
        sSQL2 = "delete from persona where PersonaID=?";

        PreparedStatement pst = cn.prepareStatement(sSQL);
        PreparedStatement pst2 = cn.prepareStatement(sSQL2);

        pst.setInt(1, dts.getPersonaID());

        pst2.setInt(1, dts.getPersonaID());

        return execStatement(pst, pst2, cn);


    }
    @Override
    public boolean eliminar(int dts) throws SQLException {
        sSQL = "delete from trabajador where PersonaID=?";
        sSQL2 = "delete from persona where PersonaID=?";

        PreparedStatement pst = cn.prepareStatement(sSQL);
        PreparedStatement pst2 = cn.prepareStatement(sSQL2);

        pst.setInt(1, dts);

        pst2.setInt(1, dts);

        return execStatement(pst, pst2, cn);


    }
    @Override
    public boolean editar(Trabajador dts) throws SQLException {

        sSQL = "update persona set PersonaApellidoP=?, PersonaApellidoM=?,PersonaNombre=?,PersonaEdad=?,PersonaSexo=?,PersonaDNI=?," +
                "PersonaDireccion=?,PersonaTelefono=?,PersonaCorreo=?, PersonaContrasenia=? where PersonaID=?";

        sSQL2 = "update trabajador set TrabajadorEstado=? where PersonaID=?";

        //System.out.println(sSQL);
        //System.out.println(sSQL2);


        PreparedStatement pst = cn.prepareStatement(sSQL);
        PreparedStatement pst2 = cn.prepareStatement(sSQL2);

        pst.setString(1, dts.getPersonaApellido1());
        pst.setString(2, dts.getPersonaApellido2());
        pst.setString(3, dts.getPersonaNombre());
        pst.setInt(4, dts.getPersonaEdad());
        pst.setInt(5, dts.isPersonaSexo() ? 1 : 0);
        pst.setInt(6, dts.getPersonaDNI());
        pst.setString(7, dts.getPersonaDireccion());
        pst.setInt(8, dts.getPersonaTelefono());
        pst.setString(9, dts.getPersonaCorreo());
        pst.setString(10, dts.getPersonaPassword());
        pst.setInt(11, dts.getPersonaID());

        pst2.setString(1, dts.getTrabajadorEstado());
        pst2.setInt(2, dts.getPersonaID());

        return execStatement(pst, pst2, cn);


    }





}
