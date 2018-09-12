<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<title>Contact V18</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>


	<div class="container-contact100">
		<div class="wrap-contact100">
			<form class="contact100-form validate-form">
				<span class="contact100-form-title">
					Registrar contactos
				</span>


				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">nombre</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">Primer apellido</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">Segundo apellido</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">DNI</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">ID EMPLEADO</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">CP</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">LOCALIDAD</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">PROVINCIA</label>
					<input id="name" class="input100" type="text" name="nombre" placeholder="Dime tu nombre">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">Dirección</label>
					<input id="name" class="input100" type="text" name="direccion" placeholder="Dime tu dirección">
					<span class="focus-input40"></span>
				</div>
					<div class="wrap-input100 validate-input" data-validate="Name is required">
					<label class="label-input100" for="name">Teléfono</label>
					<input id="name" class="input100" type="text" name="direccion" placeholder="Dime tu dirección">
					<span class="focus-input40"></span>
				</div>
				<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
					<label class="label-input100" for="email">Email</label>
					<input id="email" class="input100" type="text" name="email" placeholder="Enter your email...">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100">
					<div class="label-input100">DIME EL DEPARTAMENTO DEL CONTACTO</div>
					<div>
						<select class="js-select2" name="service">
							<option>Recursos humanos</option>
							<option>Informática</option>
                            <option>Logistica</option>
                            <option>Dirección</option>
						</select>
						<div class="dropDownSelect2"></div>
					</div>
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100">
					<div class="label-input100">DIME LA CATEGORIA DEL CONTACTO</div>
					<div>
						<select class="js-select2" name="service">
							<option>Programador Analista</option>
							<option>Técnico recursos humanos</option>
                            <option>Secretaria</option>
                            <option>Recepcionista</option>
                            <option>Master del universo</option>
						</select>
						<div class="dropDownSelect2"></div>
					</div>
					<span class="focus-input100"></span>
				</div>

				<div class="container-contact100-form-btn">
					<button class="contact100-form-btn">
						Enviar
					</button>
				</div>
					<div class="container-contact100-form-btn">
					<button class="contact100-form-btn">
                <input type="reset" value="Borrar">  
               
					</button>
				</div>

			
			</form>

			<div class="contact100-more flex-col-c-m" style="background-image: url('images/duass.jpeg');">
			</div>
		</div>
	</div>

<!--===s============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<script>
		$(".js-select2").each(function(){
			$(this).select2({
				minimumResultsForSearch: 20,
				dropdownParent: $(this).next('.dropDownSelect2')
			});
		})
		$(".js-select2").each(function(){
			$(this).on('select2:open', function (e){
				$(this).parent().next().addClass('eff-focus-selection');
			});
		});
		$(".js-select2").each(function(){
			$(this).on('select2:close', function (e){
				$(this).parent().next().removeClass('eff-focus-selection');
			});
		});

	</script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
	<script>
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());

	  gtag('config', 'UA-23581568-13');
	</script>
</body>
</html>
