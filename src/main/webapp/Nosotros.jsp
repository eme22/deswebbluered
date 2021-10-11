<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/20166e3d42.js" crossorigin="anonymous"></script>
    <script src="js/navbaroffset.js"></script>
    <title>BlueRed - La red de buses mas grande del Perú</title>
    <link  rel="icon"   href="imagenes/favicon.png" type="image/png" />
    <link rel="stylesheet" type="text/css" href="css/estilo.css">
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
        
        
<section>
    <div class="img-fluid w-100 vh-100 d-flex justify-content-center align-items-center" style="background-image: url(imagenes/001.jpg); background-repeat: no-repeat; background-size: cover;">
        <div class="content text-center">
            <div class="text-white">
                <h1 class="mb-3 text-dark fw-bold display-5">BlueRed</h1>
                <h4 class="mb-3 text-dark">La red de buses mas grande del Perú</h4>
            </div>
        </div>
    </div>
</section>

        
<br>
        
<div class="container " style="padding-top: 5%;">
    <div class="row ">
        <div class="col-6">
            <p class="display-5 fw-bold">¿Quiénes somos?</p>
        </div>
        <div class="col-6">
            <p class="texto-nosotros">
                Una empresa dedicada a brindar un buen servicio
                en el rubro de viajes interprovinciales dentro de nuestro
                Perú.

                Estamos dedicados a brindarte a una grata experiencia al
                transcurso de tus aventura en nuestro servicio.
            </p>
        </div>
    </div>
</div>
        
        
<div class="container px-4 py-5" id="featured-3">
    <div class="row g-4 py-5 row-cols-1 row-cols-lg-3">
        <div class="feature col">
            <div class="feature-icon bs-gradient">
                <svg class="bi" width="1em" height="1em"><use xlink:href="#collection"/></svg>
                <img src="imagenes/mision.png" alt="logo" style="height: 15ex!important; padding-right: 90%">
            </div>
            <br>
            <h2>Misión</h2>
            <p>Ser reconocida como la mejor empresa para viajes interprovinciales
                en el Perú, con la mejor experiencia y calidad para nuestros clientes.</p>
        </div>
        <div class="feature col">
            <div class="feature-icon bg-gradient">
                <svg class="bi" width="1em" height="1em"><use xlink:href="#people-circle"/></svg>
                <img src="imagenes/vision.png" alt="logo" style="height: 15ex!important; padding-right: 90%">
            </div>
            <br>
            <h2>Visión</h2>
            <p>Tener el liderazgo en el mercado peruano con el mejor servicio
                , la mejor atención, de forma constante a través de la excelencia de nuestra gestión.</p>
        </div>
        <div class="feature col">
            <div class="feature-icon bg-gradient">
                <svg class="bi" width="1em" height="1em"><use xlink:href="#toggles2"/></svg>
                <img src="imagenes/valores.png" alt="logo" style="height: 15ex!important; padding-right: 90%">
            </div>
            <br>
            <h2>Valores</h2>
            <p>Se practican los valores de Bondad, Lealtad, Unidad, Excelencia, Respeto, Empatía, Disciplina.</p>
        </div>
    </div>
</div>
        
<div class="container top-bottom">
    <div class="row ">
        <div class="col-6">
            <p class="display-5 fw-bold">Nuestros principios</p>
        </div>
        <div class="col-6">
            <p class="texto-nosotros">
                Nuestros principios estan construidos sobre la formalidad, la franqueza, la transparencia y la meritocracia.
            </p>
        </div>
    </div>
</div>
    
<div class=" container top-bottom">
    <div class="row row-cols-1 row-cols-md-2 g-4 ">
        <div class="col">
            <div class="card">
                <img
                        src="imagenes/0004.jpg"
                        class="card-img-top"
                        alt="..."
                />
                <div class="card-body">
                    <h5 class="card-title">Sueño</h5>
                    <p class="card-text">
                        oñamos en grande. Estamos construyendo una compañía rentable y en continuo crecimiento.
                    </p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card">
                <img
                        src="imagenes/0003.jpg"
                        class="card-img-top"
                        alt="..."
                />
                <div class="card-body">
                    <h5 class="card-title">Gente</h5>
                    <p class="card-text">
                        Nuestra gente es nuestra mayor fortaleza. La gente excelente crece al ritmo de su talento y es recompensada adecuadamente. La gente excelente entrega y transforma.              </p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card">
                <img
                        src="imagenes/0002.jpg"
                        class="card-img-top"
                        alt="..."
                />
                <div class="card-body">
                    <h5 class="card-title">Cultura</h5>
                    <p class="card-text">
                        Somos una compañía de dueños. Los dueños se toman los resultados de manera personal y lideran con el ejemplo.
                    </p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card">
                <img
                        src="imagenes/0001.jpg"
                        class="card-img-top"
                        alt="..."
                />
                <div class="card-body">
                    <h5 class="card-title">Precio Justo</h5>
                    <p class="card-text">
                        Un precio justo es aquel que ha sido establecido de mutuo acuerdo por todos a través del diálogo y la participación, que proporciona un pago justo a los productores y también puede ser sostenido por el mercado.
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
            
        
<div class="container top-bottom">
    <p class="fs-2">Si confías en nosotros, obtendrás la mejor experiencia de tu vida.</p>
    <div class="ratio ratio-16x9">
        <iframe
                src="https://www.youtube.com/embed/AsmE7OtfoG8"
                title="YouTube video"
                allowfullscreen
        ></iframe>
    </div>
</div>
     
<div class="container top-bottom " >
    <div class="p-5 mb-4 bg-light rounded-3" style="background-image: url(imagenes/contactar.jpg);">
        <div class="container-fluid py-5" >
            <h1 class="display-5 fw-bold">¿Listo para hablar?</h1>
            <p class="col-md-8 fs-4">Si deseas comunicarte con nosotros lo puedes hacer por email o por teléfono, estamos disponibles para contestar tus preguntas.</p>
            <button class="btn btn-lg" style="background-color: #023cf1!important; color: #ffffff;" type="button">Contáctanos</button>
        </div>
    </div>
</div>



<footer class="text-center text-lg-start bg-primary text-muted" style="background-color: #023cf1!important;">
    <!-- Section: Social media -->
    <section
            class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom"
    >
        <!-- Left -->
        <div class="me-5 d-none d-lg-block">
            <span class="text-dark">Conectate con nosotros:</span>
        </div>
        <!-- Left -->

        <!-- Right -->
        <div>
            <a href="" class="me-4 text-dark" style="text-decoration: none;">
                <i class="fab fa-facebook-f"></i>
            </a>
            <a href="" class="me-4 text-dark" style="text-decoration: none;">
                <i class="fab fa-twitter"></i>
            </a>
            <a href="" class="me-4 text-dark" style="text-decoration: none;">
                <i class="fab fa-google"></i>
            </a>
            <a href="" class="me-4 text-dark" style="text-decoration: none;">
                <i class="fab fa-instagram"></i>
            </a>
            <a href="" class="me-4 text-dark" style="text-decoration: none;">
                <i class="fab fa-linkedin"></i>
            </a>
            <a href="" class="me-4 text-dark" style="text-decoration: none;">
                <i class="fab fa-github"></i>
            </a>
        </div>
        <!-- Right -->
    </section>
    <!-- Section: Social media -->

    <!-- Section: Links  -->
    <section class="">
        <div class="container text-center text-md-start mt-5">
            <!-- Grid row -->
            <div class="row mt-3">
                <!-- Grid column -->
                <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                    <!-- Content -->
                    <h6 class="text-uppercase text-dark fw-bold mb-4">
                        <i class="fas fa-bus me-3"></i>BlueRed
                    </h6>
                    <p class="text-dark">
                        La red de buses mas grande del Perú
                    </p>
                </div>
                <!-- Grid column -->
                <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
                    <!-- Links -->
                    <h6 class="text-uppercase text-dark fw-bold mb-4">
                        Links
                    </h6>
                    <p>
                        <a href="#!" class="text-dark">Precios</a>
                    </p>
                    <p>
                        <a href="#!" class="text-dark">Reservas</a>
                    </p>
                    <p>
                        <a href="#!" class="text-dark">Contactanos</a>
                    </p>
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                    <!-- Links -->
                    <h6 class="text-uppercase text-dark fw-bold mb-4 ">
                        Contacto
                    </h6>
                    <p class="text-dark"><i class="fas fa-home me-3 text-dark"></i> Lima, PE</p>
                    <p class="text-dark">
                        <i class="fas fa-envelope me-3"></i>
                        BlueRed@bluered.com
                    </p>
                    <p class="text-dark"><i class="fas fa-phone me-3"></i> + 51 XXX XXX XXX</p>
                </div>
                <!-- Grid column -->
            </div>
            <!-- Grid row -->
        </div>
    </section>
    <!-- Section: Links  -->

    <!-- Copyright -->
    <div class="text-center p-4 text-dark" style="background-color: rgba(0, 0, 0, 0.05);">
        © 2021 Copyright: Alumnos de la UTP
    </div>
    <!-- Copyright -->
</footer>
        
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
</body>

</html>
