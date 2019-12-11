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
@Table(name = "residencias")
public class residencias implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codResidencia", columnDefinition = "int(11)")
	int codResidencia;
	@Column(name="nomResidencia", columnDefinition = "varchar(30)")
	String nomResidencia;
	@Column(name="codUniversidad", columnDefinition = "char(6)")
	String codUniversidad;
	@Column(name="precioMensual", columnDefinition = "smallint(6)")
	int precioMensual;
	@Column(name="Comedor", columnDefinition = "tinyint(1)")
	int Comedor;
	
	public residencias(int codResidencia, String nomResidencia, String codUniversidad, int precioMensual,	int Comedor) {
		this.codResidencia = codResidencia;
		this.codUniversidad = codUniversidad;
		this.Comedor = Comedor;
		this.nomResidencia = nomResidencia;
		this.precioMensual = precioMensual;
	}

	public int getCodResidencia() {
		return codResidencia;
	}

	public void setCodResidencia(int codResidencia) {
		this.codResidencia = codResidencia;
	}

	public String getNomResidencia() {
		return nomResidencia;
	}

	public void setNomResidencia(String nomResidencia) {
		this.nomResidencia = nomResidencia;
	}
	
	public int getPrecioMensual() {
		return precioMensual;
	}

	public void setPrecioMensual(int precioMensual) {
		this.precioMensual = precioMensual;
	}

	public int getComedor() {
		return Comedor;
	}

	public void setComedor(int comedor) {
		Comedor = comedor;
	}

	public String getCodUniversidad() {
		return codUniversidad;
	}

	public void setCodUniversidad(String codUniversidad) {
		this.codUniversidad = codUniversidad;
	}
	
	
	
	

}
