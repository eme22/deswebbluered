<%--
  Created by IntelliJ IDEA.
  User: MSB19
  Date: 10/10/2021
  Time: 14:02
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/20166e3d42.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <title>BlueRed - Trabajadores</title>
</head>
<body>

<script>
    function nameFormatter(value) {
        var str='';
        for(i=0;i<value.length;i++)
        {
            str=str+'*';
        }
        return str;
    }
</script>

<section class="grid">
    <!-- Articulos -->
    <article>
        <button type="button" class="btn btn-primary" onclick="addTraba(null)">Agregar Trabajador</button>
        <table id="trabajadorstable" class="table table-sm">
            <thead>
            <tr>
                <th scope="col">ID de Trabajador</th>
                <th scope="col">DNI</th>
                <th scope="col">Apellido Paterno</th>
                <th scope="col">Nombres</th>
                <th scope="col">Estado</th>
                <th scope="col">Telefono</th>
                <th scope="col">E-mail</th>
                <th scope="col">Contraseña</th>
                <th scope="col">Acciones</th>
            </tr>
            </thead>
            <tbody id="trabajadorstablebody">
            <c:forEach var="lisTrabajadores" items="${requestScope.lisTrabajadores}">
                <tr>
                    <td>${lisTrabajadores.trabajadorID}</td>
                    <td>${lisTrabajadores.personaDNI}</td>
                    <td>${lisTrabajadores.personaApellido1}</td>
                    <td>${lisTrabajadores.personaNombre}</td>
                    <td>${lisTrabajadores.trabajadorEstado}</td>
                    <td>${lisTrabajadores.personaTelefono}</td>
                    <td>${lisTrabajadores.personaCorreo}</td>
                    <td data-field="Password"  data-sortable="true" data-formatter="nameFormatter">${lisTrabajadores.personaPassword}</td>
                    <td>
                        <button type="button" class="btn btn-primary" onclick="editartraba(${lisTrabajadores.trabajadorID})">Editar</button>
                        <button type="button" class="btn btn-alert" onclick="editartraba(${lisTrabajadores.trabajadorID})">Eliminar</button>
                    </td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </article>
</section>
<!-- Modal -->

<div class="modal fade" id="addTrabajador" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">Agregar Nuevo Trabajador</h5>
            </div>
            <div class="modal-body">
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
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                <button type="submit" class="btn btn-primary">Agregar</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="addTrabajador2" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel1">Agregar Trabajador<P></P></h5>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label for="apellidos">DNI: </label>
                    <input type="text" class="form-control" id="apellidos" name="apellidos" aria-describedby="emailHelp" placeholder="Ingrese Apellidos" required>
                </div>
                <div class="form-group">
                    <label>Sexo: </label>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="estado" id="estado1" checked>
                        <label class="form-check-label" for="estado1">
                            Activo
                        </label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="estado" id="estado2" >
                        <label class="form-check-label" for="estado2">
                            Inactivo
                        </label>
                    </div>
                </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                <button type="submit" class="btn btn-primary">Agregar</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>
