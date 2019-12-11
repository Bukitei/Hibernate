package aed.javafx.classes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "estudiantes")
public class estudiantes implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codEstudiante", columnDefinition = "int(11)")
	int codEstudiante;
	@Column(name="dni", columnDefinition = "char(9)")
	String dni;
	@Column(name="nomEstudiante", columnDefinition = "varchar(50)")
	String nomEstudiante;
	@Column(name="telefonoEstudiante", columnDefinition = "char(9)")
	String telefonoEstudiante;

	public estudiantes(int codEstudiante, String dni, String nomEstudiante, String telefonoEstudiante) {
		
		
		this.codEstudiante = codEstudiante;
		this.dni = dni;
		this.nomEstudiante = nomEstudiante;
		this.telefonoEstudiante = telefonoEstudiante;
		
	}

	public int getCodEstudiante() {
		return codEstudiante;
	}

	public void setCodEstudiante(int codEstudiante) {
		this.codEstudiante = codEstudiante;
	}

	public String getNomEstudiante() {
		return nomEstudiante;
	}

	public void setNomEstudiante(String nomEstudiante) {
		this.nomEstudiante = nomEstudiante;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefonoEstudiante() {
		return telefonoEstudiante;
	}

	public void setTelefonoEstudiante(String telefonoEstudiante) {
		this.telefonoEstudiante = telefonoEstudiante;
	}

	
	
	
	
}
