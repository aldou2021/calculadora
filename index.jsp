<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora</title>
</head>
<body>
	<h1>Calculadora</h1>
	<form action="registro" method= "post" >
	Operador 1: <input type= "text" name= "operador1">
	<br>
	Operador 2: <input type= "text" name= "operador2">
	<br>
	Tipo de operación: 
	<select name="operacion" >
  		<option value="suma">Suma</option>
  		<option value="resta">Resta</option>
  		<option value="multiplicacion">Multiplicación</option>
  		<option value="division">División</option>
	</select>

	<br>
	
	<br>
	<input type="submit"  value= "Realizar operación">
	
	
	</form>
</body>
</html>