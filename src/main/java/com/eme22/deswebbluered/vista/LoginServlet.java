package com.eme22.deswebbluered.vista;

import com.eme22.deswebbluered.dao.ClienteDAO;
import com.eme22.deswebbluered.dao.TrabajadorDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    // 1: Contraseña Incorrecta
    // 2: Correo Vacio
    // 3: Error De Clase
    // 4: Error Con La Base De Datos


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("correo");
        String password = request.getParameter("contrasenia");

        if (email.isEmpty()){
            request.setAttribute("error", 2);
            request.getRequestDispatcher("./Login.jsp").forward(request,response);
            return;
        }

        try {
            int respuesta1 = autenticarTrabajador(email, password);
            int respuesta2 = autenticarUsuario(email, password);

            if (respuesta1 == -1 && respuesta2 == -1) {
                request.setAttribute("defCorreo", email);
                request.setAttribute("error", 1);
                request.getRequestDispatcher("./Login.jsp").forward(request,response);
            }
            else if (respuesta1 != -1 && respuesta2 != -1) {
                request.setAttribute("idusuario", respuesta1);
                request.setAttribute("trabajador", true);
                request.getRequestDispatcher("./PanelAdmin.jsp").forward(request,response);
            }
            else {
                boolean trabajador = respuesta1 != -1;
                if (trabajador){
                    request.setAttribute("idusuario", respuesta1);
                    request.getRequestDispatcher("./PanelAdmin.jsp").forward(request,response);
                }
                else {
                    request.setAttribute("idusuario", respuesta2);
                    request.getRequestDispatcher("./Panel.jsp").forward(request,response);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", 4);
            request.getRequestDispatcher("./Login.jsp").forward(request,response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("error", 3);
            request.getRequestDispatcher("./Login.jsp").forward(request,response);
        }
    }

    private int autenticarTrabajador(String correo, String password) throws SQLException, ClassNotFoundException {
        return new TrabajadorDAO().login(correo, password);
    }

    private int autenticarUsuario(String correo, String password) throws SQLException, ClassNotFoundException {

        return new ClienteDAO().login(correo, password);

    }
}
