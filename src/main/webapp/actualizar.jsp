<%--
  Created by IntelliJ IDEA.
  User: ESPE
  Date: 19/01/2024
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actualizar auto</title>
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

    form {
      margin-top: 20px;

    }
    .form-container {
      width: 25%;
      margin: 0 auto;
      background-color: rgba(3, 162, 162, 0.83);
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    table {
      border-collapse: collapse;
      margin-top: 10px;
    }

    td {
      padding: 8px;
    }

    input[type="text"] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      border-radius: 5px;
      padding: 10px;
      background-color: rgba(166, 248, 248, 0.89);
      cursor: pointer;
      border: none;
    }

  </style>
</head>
<body>
<h1>Actualizar Auto</h1>
<br>
<div class="form-container">
<form action="servletController" method="post">
  <input type="hidden" name="opcion" value="actualizar">
  <table>
    <tr>
      <td>Marca</td>
      <td><input type="text" name="marca" value="${auto.marca}"></td>
    </tr>
    <tr>
      <td>Placa 2</td>
      <td><input type="text" name="placa" value="${auto.placa}"></td>
    </tr>
    <tr>
      <td>Modelo</td>
      <td><input type="text" name="modelo" value="${auto.modelo}"></td>
    </tr>
    <tr>
      <td>Cilindraje</td>
      <td><input type="text" name="cilindraje" value="${auto.cilindraje}"></td>
    </tr>
    <tr>
      <td>Anio</td>
      <td><input type="text" name="anio" value="${auto.anio}"></td>
    </tr>
    <tr>
      <td>Consumo</td>
      <td><input type="text" name="consumo" value="${auto.consumo}"></td>
    </tr>
  </table>
  <center><input type="submit" value="actualizar"></center>
</form>
</div>
</body>
</html>
