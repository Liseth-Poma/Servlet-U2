<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Administrar Autos</title>
    <link rel="stylesheet" href="/WEB-INF/css/bootstrap-5.0.2-dist/css/bootstrap.min.css">

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #EBF5FB;
            margin: 20px;
        }

        h1 {
            color: #333;
            text-align: center;
        }



        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;


        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 15px;
            background-color: white;
        }

        th {
            background-color: #85C1E9;
        }

        #btn{
            border-radius: 5px;
            padding: 10px;
            background-color: #20c997;
            cursor: pointer;
            text-decoration: none;
        }
        #btn1 {

            border-radius: 5px;
            padding: 10px;
            background-color: #ffc107;
            cursor: pointer;
            text-decoration: none;
        }
        #btn2{
            border-radius: 5px;
            padding: 10px;
            background-color: #dc3545;
            cursor: pointer;
            text-decoration: none;
        }
    </style>
</head>
<body>

<h1>Lista de Autos</h1>
<br/>
<center><a href="servletController?opcion=registro" id="btn">Añadir Auto</a></center>
<br/>
<br/>
<table border="1">
    <tr>
        <th>Marca</th>
        <th>Modelo</th>
        <th>Placa</th>
        <th>Cilindraje</th>
        <th>Anio</th>
        <th>Consumo</th>

        <th colspan="2">Acciones</th>
    </tr>
    <c:forEach var="auto" items="${autos}" >
        <tr>
            <td><c:out value="${auto.marca}"></c:out></td>
            <td><c:out value="${auto.modelo}"></c:out></td>
            <td><c:out value="${auto.placa}"></c:out></td>
            <td><c:out value="${auto.cilindraje}"></c:out></td>
            <td><c:out value="${auto.anio}"></c:out></td>
            <td><c:out value="${auto.consumo}"></c:out></td>
            <td><a id="btn1" href="servletController?opcion=actualizar&placa=<c:out value="${auto.placa}"></c:out>">Editar</a></td>
            <td><a id="btn2" href="servletController?opcion=eliminar&placa=<c:out value="${auto.placa}"></c:out>">Eliminar</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>