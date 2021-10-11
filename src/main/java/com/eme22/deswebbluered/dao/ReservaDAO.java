package com.eme22.deswebbluered.dao;

import com.eme22.deswebbluered.interfaces.ReservaInterface;
import com.eme22.deswebbluered.model.Reserva;
import com.eme22.deswebbluered.util.Conexion;

import java.sql.*;
import java.util.ArrayList;

import static com.eme22.deswebbluered.util.Conexion.execStatement;

public class ReservaDAO implements ReservaInterface {

    private Connection cnn = null;
    private ResultSet rs = null;
    private static Connection cn;
    private String sSQL = "";
    private String sSQL2 = "";

    private static ReservaDAO instancia;

    public ReservaDAO() throws ClassNotFoundException {
        try {
            cn = Conexion.getInstancia().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Reserva> getReserva(ArrayList<Reserva> data) throws SQLException {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        if (rs.next()) {
            Reserva registro = new Reserva();
            registro.setReservaID(rs.getInt("ReservaID"));
            registro.setReservaBusID(rs.getInt("BusID"));
            registro.setReservaClienteID(rs.getInt("ReservaClienteID"));
            registro.setReservaViajeID(rs.getInt("ReservaViajeID"));
            registro.setReservaFecha(new java.util.Date(rs.getDate("ReservaFechaReserva").getTime()));

            data.add(registro);

        }
        cn.close();
        return data;
    }


    @Override
    public ArrayList<Reserva> mostraTodas() throws SQLException {
        ArrayList<Reserva> data = new ArrayList<>();

        sSQL = "SELECT ReservaID,  BusID, ReservaClienteID, ReservaViajeID, ReservaFechaReserva " +
                "from reserva order by ReservaID desc";

        return getReserva(data);
    }

    @Override
    public ArrayList<Reserva> mostraTodas(int clienteID) throws SQLException {
        ArrayList<Reserva> data = new ArrayList<>();

        sSQL = "SELECT ReservaID,  BusID, ReservaClienteID, ReservaViajeID, ReservaFechaReserva " +
                "from reserva where ReservaClienteID like '%"  + clienteID + "%' order by ReservaID desc";

        return getReserva(data);
    }

    @Override
    public ArrayList<Reserva> buscar(String busqueda, int tipo) throws SQLException {
        ArrayList<Reserva> data = new ArrayList<>();

        String tipo2;
        switch (tipo){
            default: tipo2 = "ReservaID"; break;
            case 1: tipo2 = "ReservaClienteID"; break;
            case 2: tipo2 = "ReservaViajeID"; break;
            case 3: tipo2 = "BusID"; break;
            case 4: tipo2 = "ReservaFechaReserva"; break;
        }

        sSQL = "SELECT ReservaID,  BusID, ReservaClienteID, ReservaViajeID, ReservaFechaReserva " +
                "from reserva where "  + tipo2 + " like '%"  + busqueda + "%' order by ReservaID desc";

        return getReserva(data);
    }

    @Override
    public boolean insertar(Reserva dts) throws SQLException {
        sSQL = "insert into reserva " +
                "(ReservaID, ReservaBusID,ReservaClienteID, ReservaViajeID,ReservaFechaReserva) " +
                "values (0,?,?,?,?)";

        PreparedStatement pst = cn.prepareStatement(sSQL);
        PreparedStatement pst2 = cn.prepareStatement(sSQL2);

        pst.setInt(1, dts.getReservaBusID());
        pst.setInt(2, dts.getReservaClienteID());
        pst.setInt(3, dts.getReservaViajeID());
        pst.setDate(4, new Date(dts.getReservaFecha().getTime()));

        return execStatement(pst, pst2, cn);
    }

    @Override
    public boolean editar(Reserva dts) throws SQLException {
        sSQL = "update reserva set ReservaBusID=?, ReservaViajeID=?,ReservaClienteID=?,ReservaFechaReserva=? where ReservaID=?";

        //System.out.println(sSQL);
        //System.out.println(sSQL2);

        PreparedStatement pst = cn.prepareStatement(sSQL);

        pst.setInt(1, dts.getReservaBusID());
        pst.setInt(2, dts.getReservaViajeID());
        pst.setInt(3, dts.getReservaClienteID());
        pst.setDate(4, new Date(dts.getReservaFecha().getTime()));
        pst.setInt(5, dts.getReservaID());

        return execStatement(pst, cn);
    }

    @Override
    public boolean eliminar(Reserva dts) throws SQLException {
        sSQL = "delete from reserva where ReservaID=?";

        PreparedStatement pst = cn.prepareStatement(sSQL);

        pst.setInt(1, dts.getReservaID());

        return execStatement(pst, cn);
    }

    @Override
    public boolean eliminar(int dts) throws SQLException {
        sSQL = "delete from reserva where ReservaID=?";

        PreparedStatement pst = cn.prepareStatement(sSQL);

        pst.setInt(1, dts);

        return execStatement(pst, cn);
    }
}
