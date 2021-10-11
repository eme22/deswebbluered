<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/Login.css">
    <script src="https://kit.fontawesome.com/20166e3d42.js" crossorigin="anonymous"></script>
    <script src="js/navbaroffset.js"></script>
    <title>BlueRed - La red de buses mas grande del Perú</title>
    <link  rel="icon"   href="imagenes/favicon.png" type="image/png" />
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
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
            <li class="nav-item">
                <a href="Login.jsp" class="nav-link m-2 menu-item text-light">Conectate
                    <i class="fas fa-sign-in-alt me-2"></i>
                </a>
            </li>
        </ul>
    </div>
</nav>

<c:if test="${requestScope.error=='2'}">
    <div class="alert alert-danger" role="alert">
        Correo Vacio!
    </div>
</c:if>

<c:if test="${requestScope.error=='1'}">
    <div class="alert alert-danger" role="alert">
        Contraseña Incorrecta / Usuario no encontrado!
    </div>
</c:if>

<c:if test="${requestScope.error=='4'}">
    <div class="alert alert-danger" role="alert">
        Ha habido un error con la base de datos
    </div>
</c:if>

<c:if test="${requestScope.error=='3'}">
    <div class="alert alert-danger" role="alert">
        Ha ocurrido un error con el servidor
    </div>
</c:if>

<div class="d-flex align-top light-blue-gradient align-items-center" style="height: 100vh;">
    <div class="container" >
        <div class="d-flex justify-content-center">
            <div class="col-md-6">
                <div class="card rounded-0 shadow">
                    <div class="card-body">
                        <h3 class="justify-content-center">Ingresar</h3>
                        <form action="${pageContext.request.contextPath}/LoginServlet" method="post">
                            <div class="form-group">
                                <label for="correo">Correo:</label>
                                <input type="email" class="form-control" id="correo" name="correo" aria-describedby="emailHelp" placeholder="Escriba su Email">
                                </div>
                            <div class="form-group">
                                <label for="contrasenia">Contraseña: </label>
                                <input type="password" class="form-control" id="contrasenia" name="contrasenia" placeholder="Ingrese su contraseña">
                            </div>
                            <div class="form-group">
                                <br>
                                <label for="recordar">Recordar Contraseña: </label>
                                <input type="checkbox" class="radio" value="1" id="recordar"/>
                            </div>
                            <div class="d-flex justify-content-center">
                                <button type="submit" class="btn btn-primary ">Ingresar</button>
                            </div>
                        </form>
                        <div class="bottom text-center mb-5">
                            <br>
                            <p class="sm-text mx-auto mb-3">No tienes una cuenta? <button class="btn btn-primary ml-2" onclick="window.location.href='Register.jsp'">Registrate</button></p>
                        </div>
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