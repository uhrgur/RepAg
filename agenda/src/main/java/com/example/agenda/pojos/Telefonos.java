package com.example.agenda.pojos;
// Generated 11-sep-2018 9:09:34 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Telefonos generated by hbm2java
 */
@Entity
@Table(name = "telefonos", catalog = "agenda")
public class Telefonos implements java.io.Serializable {

	private Integer idtelefonos;
	private Personas personas;
	private String telefono;

	public Telefonos() {
	}

	public Telefonos(Personas personas, String telefono) {
		this.personas = personas;
		this.telefono = telefono;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idtelefonos", unique = true, nullable = false)
	public Integer getIdtelefonos() {
		return this.idtelefonos;
	}

	public void setIdtelefonos(Integer idtelefonos) {
		this.idtelefonos = idtelefonos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPersona")
	public Personas getPersonas() {
		return this.personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	@Column(name = "telefono", length = 45)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
