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
@Table(name = "universidades")
public class universidades implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codUniversidad", columnDefinition = "char(6)")
	String codUniversidad;
	@Column(name="nomUniversidad", columnDefinition = "varchar(30)")
	String nomUniversidad;
	
	public universidades(String codUniversidad, String nomUniversidad) {
		this.codUniversidad = codUniversidad;
		this.nomUniversidad = nomUniversidad;
	}

	public String getCodUniversidad() {
		return codUniversidad;
	}



	public void setCodUniversidad(String codUniversidad) {
		this.codUniversidad = codUniversidad;
	}

	public String getNomUniversidad() {
		return nomUniversidad;
	}

	public void setNomUniversidad(String nomUniversidad) {
		this.nomUniversidad = nomUniversidad;
	}
	
	

}
