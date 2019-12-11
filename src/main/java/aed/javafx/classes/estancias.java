package aed.javafx.classes;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "estancias")
public class estancias implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codEstancia", columnDefinition = "int(11)")
	int codEstancia;
	@Column(name="codEstudiante", columnDefinition = "int(11)")
	int codEstudiante;
	@Column(name="codResidencia", columnDefinition = "int(11)")
	int codResidencia;
	@Temporal(TemporalType.DATE)
	Date fechaInicio;
	@Temporal(TemporalType.DATE)
	Date fechaFin;
	@Column(name="preciopagado", columnDefinition = "smallint(6)")
	int preciopagado;
	
	
	public estancias(int codEstancia, int codEstudiante, int codResidencia, Date fechaInicio, Date fechaFin, int preciopagado) {
		
		this.codEstancia = codEstancia;
		this.codEstudiante = codEstudiante;
		this.codResidencia = codResidencia;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.preciopagado = preciopagado;
	}


	public int getCodEstancia() {
		return codEstancia;
	}


	public void setCodEstancia(int codEstancia) {
		this.codEstancia = codEstancia;
	}


	public int getCodEstudiante() {
		return codEstudiante;
	}


	public void setCodEstudiante(int codEstudiante) {
		this.codEstudiante = codEstudiante;
	}


	public int getCodResidencia() {
		return codResidencia;
	}


	public void setCodResidencia(int codResidencia) {
		this.codResidencia = codResidencia;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public int getPreciopagado() {
		return preciopagado;
	}


	public void setPreciopagado(int preciopagado) {
		this.preciopagado = preciopagado;
	}
	
	
	
}
