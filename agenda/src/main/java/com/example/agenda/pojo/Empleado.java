package com.example.agenda.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")

public class Empleado {
	
	private int idempleados;
	String codEmpleados;
	String salario;
	private Date fechaAlta;
	int idDepartamento;
	int idCategoria;
	
	@Id
	@GeneratedValue
	@Column(name="idempleados")

	public int getIdempleados() {
		return idempleados;
	}

	public void setIdempleados(int idempleados) {
		this.idempleados = idempleados;
	}

	@Column(name="codEmpleados")
	public String getCodEmpleados() {
		return codEmpleados;
	}

	public void setCodEmpleados(String codEmpleados) {
		this.codEmpleados = codEmpleados;
	}

	@Column(name="salario")
	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	@Column(name="fechaAlta")
	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Column(name="idDepartamento")
	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	@Column(name="idCategoria")
	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	
}
