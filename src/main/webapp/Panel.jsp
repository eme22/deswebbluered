<%--
  Created by IntelliJ IDEA.
  User: MSB19
  Date: 9/10/2021
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/paneladmin.css">
    <script src="js/navbaroffset.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/20166e3d42.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <title>BlueRed - La red de buses mas grande del Perú</title>
    <link  rel="icon"   href="imagenes/favicon.png" type="image/png" />
</head>
<body>

<script>
    function togglemenu(){
        var element = document.getElementById("wrapper");
        $("#wrapper").toggleClass("toggled");
        //element.toggleAttribute("toggled");
    }
</script>

<nav class="navbar fixed-top navbar-expand-lg navbar-dark p-md-1 bg-primary" style="background-color: #023cf1!important;">
    <div class="d-flex flex-grow-1">
        <span class="w-100 d-lg-none d-block">
            <!-- hidden spacer to center brand on mobile --></span>
        <a class="navbar-brand d-none d-lg-inline-block mx-auto ms-2" href="index.jsp" style="size: 5px">
            <img src="imagenes/logo_1.png" alt="logo"> </a>
        <a class="navbar-brand-two mx-auto d-lg-none d-inline-block" href="index.jsp" style="size: 5px">
            <img src="imagenes/logo_1.png" alt="logo">
        </a>
        <div class="w-100 text-right">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#myNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
        </div>
    </div>
    <div class="collapse navbar-collapse flex-grow-1 text-right me-2" id="myNavbar">
        <ul class="navbar-nav ms-auto flex-nowrap">
            <li class="nav-item">
                <a href="Nosotros.jsp" class="nav-link m-2 menu-item nav-active text-light">Sobre Nosotros
                    <i class="fas fa-info-circle me-2"></i>
                </a>
            </li>
            <li class="nav-item">
                <a href="#" class="nav-link m-2 menu-item text-light">Horarios
                    <i class="far fa-calendar-alt me-2"></i>
                </a>
            </li>
            <li class="nav-item">
                <a href="#" class="nav-link m-2 menu-item text-light">Contactanos
                    <i class="fas fa-phone-square-alt me-2"></i>
                </a>
            </li>
            <c:choose>
                <c:when test="${cookie.containsKey('username')}">
                    <li class="nav-item">
                        <a href="Panel.jsp" class="nav-link m-2 menu-item text-light">${cookie['username']}
                            <i class="fas fa-sign-in-alt me-2"></i>
                        </a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item">
                        <a href="Login.jsp" class="nav-link m-2 menu-item text-light">Conectate
                            <i class="fas fa-sign-in-alt me-2"></i>
                        </a>
                    </li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>

<div id="wrapper">

    <!-- Sidebar -->
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <br><br><br><br>
            <li class="sidebar-brand">
                <a href="#">
                    Bienvenido, USUARIO!
                </a>
            </li>
            <li>
                <a href="VistaGeneral.jsp" target="iframe1"><i class="fas fa-route"></i> Tus Viajes</a>
            </li>
            <li>
                <a href="Trabajadores.jsp" target="iframe1"><i class="fas fa-history"></i> Historial</a>
            </li>
            <li>
                <a href="VistaGeneral.jsp" target="iframe1"><i class="fas fa-shopping-cart"></i> Pagos Realizados</a>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <br><br><br>
        <!-- <a onclick="togglemenu()" class="btn btn-default" id="menu-toggle">Toggle Menu</a> -->
        <div class="container-fluid">
            <iframe frameborder="no" style="width: 100%; height: 100%;"  name="iframe1" src="VistaGeneral.jsp">
            </iframe>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>

