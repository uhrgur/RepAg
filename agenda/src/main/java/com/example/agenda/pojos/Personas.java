package com.example.agenda.pojos;
// Generated 11-sep-2018 14:32:14 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Personas generated by hbm2java
 */
@Entity
@Table(name = "personas", catalog = "agenda")
public class Personas implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idpersonas;
	private Empleados empleados;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechaNacimiento;
	private Set<Direccion> direccion = new HashSet<Direccion>(0);
	private Set<Telefonos> telefonoses = new HashSet<Telefonos>(0);

	public Personas() {
	}

	public Personas(Empleados empleados, String nombre, String apellido1) {
		this.empleados = empleados;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	public Personas(Empleados empleados, String nombre, String apellido1, String apellido2, String dni,
			Date fechaNacimiento, Set<Direccion> direccion, Set<Telefonos> telefonoses) {
		this.empleados = empleados;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefonoses = telefonoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpersonas", unique = true, nullable = false)
	public Integer getIdpersonas() {
		return this.idpersonas;
	}

	public void setIdpersonas(Integer idpersonas) {
		this.idpersonas = idpersonas;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEmpleado", nullable = false)
	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellido1", nullable = false, length = 45)
	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name = "apellido2", length = 45)
	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Column(name = "dni", length = 20)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy="personas")
	public Set<Direccion> getDireccion() {
		return this.direccion;
	}

	public void setDireccion(Set<Direccion> direccion) {
		this.direccion = direccion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personas")
	public Set<Telefonos> getTelefonoses() {
		return this.telefonoses;
	}

	public void setTelefonoses(Set<Telefonos> telefonoses) {
		this.telefonoses = telefonoses;
	}

}
