<%--
  Created by IntelliJ IDEA.
  User: MSB19
  Date: 26/09/2021
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/Register.css">
    <script src="https://kit.fontawesome.com/20166e3d42.js" crossorigin="anonymous"></script>
    <script src="js/navbaroffset.js"></script>
    <title>BlueRed - La red de buses mas grande del Perú</title>
    <link  rel="icon"   href="imagenes/favicon.png" type="image/png" />
    <title>RedBus - Registrate Para Viajar con Nosotros </title>
</head>
<body>

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
                        <a href="Panel.jsp" class="nav-link m-2 menu-item text-light">Conectate
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

<div class="d-flex align-top light-blue-gradient" style="height: 100vh;">
    <div class="container" >
        <div class="d-flex justify-content-center">
            <div class="col-md-6">
                <div class="card rounded-0 shadow">
                    <div class="card-body">
                        <h3 class="justify-content-center">Registrarse</h3>
                        <form action="${pageContext.request.contextPath}/RegistroServlet" method="post">
                            <div class="form-group">
                                <label for="dni">DNI: </label>
                                <input type="number" class="form-control" id="dni" name="dni" aria-describedby="emailHelp" placeholder="Ingrese DNI" required>
                            </div>
                            <div class="form-group">
                                <label for="apellidos">Apellidos: </label>
                                <input type="text" class="form-control" id="apellidos" name="apellidos" aria-describedby="emailHelp" placeholder="Ingrese Apellidos" required>
                            </div>
                            <div class="form-group">
                                <label for="nombres">Nombres: </label>
                                <input type="text" class="form-control" id="nombres" name="nombres" aria-describedby="emailHelp" placeholder="Ingrese Nombres" required>
                            </div>
                            <div class="form-group">
                                <label>Sexo: </label>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="mas" id="mas" checked>
                                    <label class="form-check-label" for="mas">
                                        Masculino
                                    </label>
                                </div>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="mas" id="wom" >
                                    <label class="form-check-label" for="wom">
                                        Femenino
                                    </label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="nacimiento">Fecha de Nacimiento: </label>
                                <input type="date" class="form-control" id="nacimiento" name="nacimiento" aria-describedby="emailHelp" required>
                            </div>
                            <div class="form-group">
                                <label for="correo">Correo:</label>
                                <input type="email" class="form-control" id="correo" name="correo" aria-describedby="emailHelp" placeholder="Escriba su Email" required>
                                <small id="correoAyuda" class="form-text text-muted">No compartiremos su correo con fines de publicidad.</small>
                            </div>
                            <div class="form-group">
                                <label for="direccion">Direccion: </label>
                                <input type="text" class="form-control" id="direccion" name="direccion" aria-describedby="emailHelp" placeholder="Ingrese su direccion" required>
                            </div>
                            <div class="form-group">
                                <label for="telefono">Telefono: </label>
                                <input type="number" class="form-control" id="telefono" name="telefono" aria-describedby="emailHelp" placeholder="Ingrese su telefono" required>
                            </div>
                            <div class="form-group">
                                <label for="contrasenia">Contraseña: </label>
                                <input type="password" class="form-control" id="contrasenia" name="contrasenia" placeholder="Ingrese su contraseña" required>
                            </div>
                            <div class="form-group">
                                <label for="contrasenia1">Confirme Su Contraseña:</label>
                                <input type="password" class="form-control" id="contrasenia1" name="contrasenia1" placeholder="Ingrese su contraseña" required>
                            </div>
                            <button type="submit" class="btn btn-primary">Registrarse</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </div>
</body>
</html>
