<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">

        <spring:url value="resources/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="resources/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />  

<title>LISTADO DE USUARIOS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE USUARIOS RepoLACERDA</h1>
		<h3>
			<a href="new">Clic para crear un NUEVO USUARIO</a>
		</h3>

		<table border="1">
		<tr>
			<th>Nº</th>
			<th>Usuario</th>
			<th>Email</th>
			<th>Acciones</th>
			</tr>
				<tr>
					<td>QUEMARAVILLA</td>
				</tr>
		</table>
	</div>
</body>
</html>