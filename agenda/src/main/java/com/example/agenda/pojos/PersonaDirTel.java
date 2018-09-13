package com.example.agenda.pojos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PersonaDirTel {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String fechaNacimiento;
	private Set<Direccion> direcciones = new HashSet<Direccion>(0);
	private Set<Telefonos> telefonoses = new HashSet<Telefonos>(0);
	private Personas personas;
	private String telefono;
	private String direccion;
	private String codPostal;
	private String localidad;
	private String provincia;
	
	public PersonaDirTel() {
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Set<Direccion> getDirecciones() {
		return direcciones;
	}


	public void setDirecciones(Set<Direccion> direcciones) {
		this.direcciones = direcciones;
	}


	public Set<Telefonos> getTelefonoses() {
		return telefonoses;
	}


	public void setTelefonoses(Set<Telefonos> telefonoses) {
		this.telefonoses = telefonoses;
	}


	public Personas getPersonas() {
		return personas;
	}


	public void setPersonas(Personas personas) {
		this.personas = personas;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCodPostal() {
		return codPostal;
	}


	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
