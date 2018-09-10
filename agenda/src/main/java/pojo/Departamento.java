package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="departamentos")
public class Departamento {
private int iddepartamento;
private String nombre;
@Id
@GeneratedValue
@Column(name="iddepartamento")
public int getIddepartamento() {
	return iddepartamento;
}
public void setIddepartamento(int iddepartamento) {
	this.iddepartamento = iddepartamento;
}
@Column(name="nombre")
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


}






