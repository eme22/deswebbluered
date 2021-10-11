package com.eme22.deswebbluered.vista;

import com.eme22.deswebbluered.dao.TrabajadorDAO;
import com.eme22.deswebbluered.model.Trabajador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/TrabajadoresServlet")
public class TrabajadoresServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            try {
                String action = req.getParameter("action");
                ArrayList<Trabajador> trabajadores =  new TrabajadorDAO().mostraTodos();

                System.out.println("TRABAJADORES: " + trabajadores.size());

                for (int i = 0; i < trabajadores.size() ; i++) {
                    Trabajador thisT = trabajadores.get(i);
                    System.out.println("Trabajador "+ i + ": "+ thisT.getPersonaApellido1()+" "+ thisT.getPersonaNombre());
                }

                req.setAttribute("lisTrabajadores", trabajadores);
                if (action != null){
                    if (action.equals("add")){

                    }
                    else if (action.equals("modify")){

                    }
                    else if (action.equals("delete")){

                    }
                }


                RequestDispatcher rd=req.getRequestDispatcher("./Trabajadores.jsp");
                rd.forward(req, resp);

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
