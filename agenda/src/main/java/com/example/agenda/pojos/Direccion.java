package com.example.agenda.pojos;
// Generated 12-sep-2018 12:10:41 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Direcciones generated by hbm2java
 */
@Entity
@Table(name = "direcciones", catalog = "agenda")
public class Direccion implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer iddirecciones;
	private Personas personas;
	private String direccion;
	private String codPostal;
	private String localidad;
	private String provincia;

	public Direccion() {
	}

	public Direccion(String direccion, String codPostal, String localidad, String provincia) {
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public Direccion(Personas personas, String direccion, String codPostal, String localidad, String provincia) {
		this.personas = personas;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "iddirecciones", unique = true, nullable = false)
	public Integer getIddireccion() {
		return this.iddirecciones;
	}

	public void setIddireccion(Integer iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpersonas")
	public Personas getPersonas() {
		return this.personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	@Column(name = "direccion", nullable = false, length = 45)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "cod_postal", nullable = false, length = 45)
	public String getCodPostal() {
		return this.codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	@Column(name = "localidad", nullable = false, length = 45)
	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Column(name = "provincia", nullable = false, length = 45)
	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
