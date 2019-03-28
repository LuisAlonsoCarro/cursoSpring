<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>App de empleados</title>
</head>
<body>
<h1>Gestión de empleados</h1>

<!-- Formulario -->
<p>
<form method="post" action="/saludos.do">
	<table>
	<tr><td>Cif:</td><td><input type="text" name="cif" /></td></tr>
	<tr><td>Nombre:</td><td><input type="text" name="nombre" /></td></tr>
	<tr><td>Apellidos:</td><td><input type="text" name="apellidos" /></td></tr>
	<tr><td>Edad:</td><td><input type="text" name="edad" /></td></tr>
	</table></br></br>
	
	<input type="submit" value="Listar" name="listar"/>
	<input type="submit" value="Mostrar Uno" name="getOne"/>
	<input type="submit" value="Insertar" name="insertar"/>
	<input type="submit" value="Modificar" name="modificar"/>
	<input type="submit" value="Eliminar" name="eliminar"/>
</form>
</p>
<p>
<!-- Mostrar un empleado -->
		<c:choose>
			<c:when test="${opcion=='muestra'}">
				<table>
					<tr>
						<th>Cif</th>
						<th>Nombre</th>
						<th>Apellidos</th>
						<th>Edad</th>
					</tr>
					<tr>
						<td>${empleado.cif}</td>
						<td>${empleado.nombre}</td>
						<td>${empleado.apellidos}</td>
						<td>${empleado.edad}</td>
					</tr>
				</table>
			</c:when>
			<c:when test="${opcion=='muestraTodos'}">
				<table>
					<tr>
						<th>Cif</th>
						<th>Nombre</th>
						<th>Apellidos</th>
						<th>Edad</th>
					</tr>
					<c:forEach items="${listaEmpleados}" var="empleadoamostrar">
						<tr>
							<td>${empleadoamostrar.cif}</td>
							<td>${empleadoamostrar.nombre}</td>
							<td>${empleadoamostrar.apellidos}</td>
							<td>${empleadoamostrar.edad}</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>

		</c:choose>
${mensaje}
</p>
</body>
</html>
