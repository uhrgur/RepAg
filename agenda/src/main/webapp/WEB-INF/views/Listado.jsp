<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <script src="js/list.js"></script> -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">


			<div class="col-md-20">
				<h4>Librin e telefonit</h4>
				<div class="table-responsive">


					<table id="mytable" class="table table-bordred table-striped">

						<thead>

							<th>Nombre</th>
							<th>Apellidos</th>
							<th>DNI</th>
							<th>Dirección</th>
							<th>Teléfono</th>
							<th>Fecha Nacimiento</th>
							<th>Editar</th>
							<th>Borrar</th>

						</thead>

						<!-- Contacto -->

						<tbody>
							<c:forEach items="${lista}" var="personas">
								<tr>
									<td>${personas.nombre}</td>
									<td>${personas.apellido1}</td>
									<td>${personas.dni}</td>
									<td>${personas.direccion}</td>
									<td>${personas.telefonoses}</td>
									<td>${personas.fechaNacimiento}</td>
									<td>
										<p data-placement="top" data-toggle="tooltip"
											title="Edit">
											<button class="btn btn-primary btn-xs" data-title="Edit"
												data-toggle="" data-target="#edit">
												<span class="glyphicon glyphicon-pencil"></span>
											</button>
										</p>
									</td>
									<td>
										<p data-placement="top" data-toggle="tooltip"
											title="Delete">
											<button class="btn btn-danger btn-xs" data-title="Delete"
												data-toggle="modal" data-target="#delete">
												<span class="glyphicon glyphicon-trash"></span>
											</button>
										</p>
									</td>
								</tr>
							</c:forEach>
						</tbody>

					</table>


			</div>
		</div>
	</div>


	<div class="modal fade" id="edit" tabindex="-1" role="dialog"
		aria-labelledby="edit" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
					<h4 class="modal-title custom_align" id="Heading">Edit Your
						Detail</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<input class="form-control " type="text" placeholder="Mohsin">
					</div>
					<div class="form-group">

						<input class="form-control " type="text" placeholder="Irshad">
					</div>
					<div class="form-group">
						<textarea rows="2" class="form-control"
							placeholder="CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan"></textarea>


					</div>
				</div>
				<!-- BOTON PARA MODIFICAR -->
				<div class="modal-footer ">
					<button type="button" class="btn btn-warning btn-lg"
						style="width: 100%;">
						<span class="glyphicon glyphicon-ok-sign"></span> Modificar
					</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<div class="modal fade" id="delete" tabindex="-1" role="dialog"
		aria-labelledby="edit" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
					<h4 class="modal-title custom_align" id="Heading">Delete this
						entry</h4>
				</div>
				<div class="modal-body">

					<div class="alert alert-danger">
						<span class="glyphicon glyphicon-warning-sign"></span> ¿Estas seguro de que deseas borrar el contacto.?
					</div>

				</div>
				<!-- Boton para confirmar que se borra el contacto  -->
				<div class="modal-footer ">
					<button type="button" class="btn btn-success">
						<span class="glyphicon glyphicon-ok-sign"></span> Yes
					</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">
						<span class="glyphicon glyphicon-remove"></span> No
					</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
</body>
</html>