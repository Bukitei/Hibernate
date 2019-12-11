package aed.javafx.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name = "residenciasobservaciones")
public class residenciasobservaciones implements Serializable{

	@Id
	@GeneratedValue(generator = "codResidencia")
	@GenericGenerator( name = "codResidencia", strategy = "foreign",
	parameters = {@org.hibernate.annotations.Parameter(name = "property", value = "presidenteX")})
	private List<residencias> codResidencia = new ArrayList<residencias>();
	@Column(name="observaciones", columnDefinition = "varchar(200)")
	private String observaciones;
	
	public residenciasobservaciones(int codResidencia, String observaciones) {
		
		this.codResidencia = codResidencia;
		this.observaciones = observaciones;
		
	}

	public int getCodResidencia() {
		return codResidencia;
	}

	public void setCodResidencia(int codResidencia) {
		this.codResidencia = codResidencia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
}
