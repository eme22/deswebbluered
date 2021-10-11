package com.eme22.deswebbluered.vista;


import com.eme22.deswebbluered.dao.ClienteDAO;
import com.eme22.deswebbluered.model.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            String email = request.getParameter("correo");
            String password = request.getParameter("contrasenia");
            String passwordConfirm = request.getParameter("contrasenia1");
            int dni = Integer.parseInt(request.getParameter("dni"));
            String[] apellidos = request.getParameter("apellidos").split(" ");
            String nombres = request.getParameter("nombres");
            int edad = getEdad(format.parse(request.getParameter("nacimiento")));
            String direccion = request.getParameter("direccion");
            int telefono = Integer.parseInt(request.getParameter("telefono"));
            boolean sexo = getSexo(request.getParameter("mas"));

            if (!password.equals(passwordConfirm)) {
                request.setAttribute("defCorreo", email);
                request.setAttribute("defPass", password);
                request.setAttribute("defDNI", dni);
                request.setAttribute("defApellidos", Arrays.toString(apellidos));
                request.setAttribute("defNombres", nombres);
                request.setAttribute("defEdad", edad);
                request.setAttribute("defDir", direccion);
                request.setAttribute("defTelf", telefono);
                request.setAttribute("defSexo", sexo);

                request.setAttribute("error", 2);
                request.getRequestDispatcher("./Register.jsp").forward(request,response);
                return;
            }


            Cliente cliente = new Cliente(0,dni, getApellido1(apellidos), getApellido2(apellidos), nombres, edad, sexo, direccion, telefono, email, password, 0, 0);


            boolean insertado = new ClienteDAO().insertar (cliente);

            if (insertado) {
                request.setAttribute("cliente",  cliente);
                request.getRequestDispatcher("./Panel.jsp").forward(request,response);
            }
            else {
                request.setAttribute("defCorreo", email);
                request.setAttribute("defPass", password);
                request.setAttribute("defDNI", dni);
                request.setAttribute("defApellidos", String.join(" ", apellidos));
                request.setAttribute("defNombres", nombres);
                request.setAttribute("defEdad", edad);
                request.setAttribute("defDir", direccion);
                request.setAttribute("defTelf", telefono);
                request.setAttribute("defSexo", sexo);
                request.setAttribute("error", 3);
                request.getRequestDispatcher("./Register.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            if (e instanceof SQLIntegrityConstraintViolationException){
                String constrain = getConstrain(e.getMessage());
                request.setAttribute("error", 5);
                request.setAttribute("errorCause", constrain);
                request.getRequestDispatcher("./Register.jsp").forward(request,response);
            }
            else {
                request.setAttribute("error", 6);
                request.getRequestDispatcher("./Register.jsp").forward(request,response);
            }


        } catch (ParseException e) {
            request.setAttribute("error", 7);
            request.getRequestDispatcher("./Register.jsp").forward(request,response);

        } catch (ClassNotFoundException e) {
            request.setAttribute("error", 8);
            request.getRequestDispatcher("./Register.jsp").forward(request,response);
        }
    }

    private String getConstrain(String message) {
        Pattern p = Pattern.compile("key '(.*?)'");//. represents single character
        Matcher m = p.matcher(message);
        if (m.find()){
            return m.group(1);
        }
        else return null;

    }

    private String getApellido2(String[] apellidos) {
        if (apellidos.length < 2) return apellidos[0];
        else {
            return String.join( " ", Arrays.copyOfRange(apellidos, 1, apellidos.length));
        }
    }

    private String getApellido1(String[] apellidos) {
        if (apellidos.length < 2) return apellidos[0];
        else {
            return apellidos[0];
        }
    }

    private boolean getSexo(String mas) {

        System.out.println("Masculino:" + mas);
        System.out.println("Masculino:" + mas);
        System.out.println("Masculino:" + mas);
        System.out.println("Masculino:" + mas);

        return mas.equals("on");
    }

    private int getEdad(Date nacimiento) {
        LocalDate nacimiento2 = nacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate now = LocalDate.now();
        return Period.between(nacimiento2, now).getYears();
    }

}
