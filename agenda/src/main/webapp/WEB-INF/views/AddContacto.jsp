<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Nuevo contacto</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="resources/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="resources/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="resources/css/util.css">
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<!--===============================================================================================-->
</head>
<body>


	<div class="container-contact100">
		<div class="wrap-contact100">
			<form:form action="save" method="post" modelAttribute="personadirtel"
				class="contact100-form validate-form">
				<span class="contact100-form-title"> Registrar contacto </span>

				<div class="wrap-input100 validate-input"
					data-validate="Nombre obligatorio">
					<label class="label-input100" for="name">Nombre</label>

					<form:input path="nombre" id="nombre" class="input100" type="text"
						name="nombre" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="Primer apellido obligatorio">
					<label class="label-input100" for="name">Primer apellido</label>

					<form:input path="apellido1" id="primerapellido" class="input100"
						type="text" name="primerapellido" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="Segundo apellido obligatorio">
					<label class="label-input100" for="name">Segundo apellido</label>

					<form:input path="apellido2" id="segundoapellido" class="input100"
						type="text" name="segundoapellido" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="DNI obligatorio">
					<label class="label-input100" for="name">DNI</label>

					<form:input path="dni" id="dni" class="input100" type="text"
						name="dni" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="Fecha Nacimiento obligatorio">
					<label class="label-input100" for="name">Fecha Nacimiento</label>

					<form:input path="fechaNacimiento" id="fecha" class="input100"
						type="date" name="fecha" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="CP obligatorio">
					<label class="label-input100" for="name">CP</label>

					<form:input path="codPostal" id="cp" class="input100" type="text"
						name="cp" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="Localidad obligatoria">
					<label class="label-input100" for="name">Localidad</label>

					<form:input path="localidad" id="localidad" class="input100"
						type="text" name="localidad" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="Provincia obligatoria">
					<label class="label-input100" for="name">Provincia</label>

					<form:input path="provincia" id="provincia" class="input100"
						type="text" name="provincia" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="Dirección obligatoria">
					<label class="label-input100" for="name">Dirección</label>

					<form:input path="direccion" id="direccion" class="input100"
						type="text" name="direccion" placeholder="" />

					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input"
					data-validate="Teléfono obligatorio">
					<label class="label-input100" for="name">Teléfono</label>

					<form:input path="telefono" id="telefono" class="input100"
						type="text" name="telefono" placeholder="" />

					<span class="focus-input40"></span>
				</div>

				<div class="container-contact100-form-btn">
					<!-- <button class="contact100-form-btn">Enviar</button> -->
					<input id="submit" type="submit" class="contact100-form-btn"
						value="Registrar">
				</div>
			</form:form>


			<!-- <div class="container-contact100-form-btn">
					<button class="contact100-form-btn">
						<input type="reset" value="Borrar">
					</button>
				</div> -->

			<div class="contact100-more flex-col-c-m"
				style="background-image: url('resources/images/background.jpg');"></div>
		</div>
	</div>

	<!--===s============================================================================================-->
	<script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="resources/vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="resources/vendor/bootstrap/js/popper.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="resources/vendor/select2/select2.min.js"></script>

	<!--===============================================================================================-->
	<script src="resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="resources/vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="resources/vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
</body>
</html>
