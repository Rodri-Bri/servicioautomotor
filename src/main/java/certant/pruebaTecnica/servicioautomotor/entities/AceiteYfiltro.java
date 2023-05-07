package certant.pruebaTecnica.servicioautomotor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="aceite_y_filtro")
public class AceiteYfiltro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAceiteYfiltro;
	
	@Column(columnDefinition = "boolean default false", nullable = true)
	private boolean aceiteYfiltroBasico;
	
	@Column(columnDefinition = "boolean default false", nullable = true)
	private boolean altoRendimiento;
	
	@Column(columnDefinition = "double default 400")
	private double precioBasico;
	@Column(columnDefinition = "double default 600")
	private double precioAltoRendimiento;
	
	public AceiteYfiltro() {}

	public AceiteYfiltro(int idAceiteYfiltro, boolean aceiteYfiltroBasico, boolean altoRendimiento, double precioBasico,
			double precioAltoRendimiento) {
		this.idAceiteYfiltro = idAceiteYfiltro;
		this.aceiteYfiltroBasico = aceiteYfiltroBasico;
		this.altoRendimiento = altoRendimiento;
		this.precioBasico = precioBasico;
		this.precioAltoRendimiento = precioAltoRendimiento;
	}

	public int getIdAceiteYfiltro() {
		return idAceiteYfiltro;
	}

	public void setIdAceiteYfiltro(int idAceiteYfiltro) {
		this.idAceiteYfiltro = idAceiteYfiltro;
	}

	

	public boolean isAceiteYfiltroBasico() {
		return aceiteYfiltroBasico;
	}

	public void setAceiteYfiltroBasico(boolean aceiteYfiltroBasico) {
		this.aceiteYfiltroBasico = aceiteYfiltroBasico;
	}

	public boolean isAltoRendimiento() {
		return altoRendimiento;
	}

	public void setAltoRendimiento(boolean altoRendimiento) {
		this.altoRendimiento = altoRendimiento;
	}

	public double getPrecioBasico() {
		return precioBasico;
	}

	public void setPrecioBasico(double precioBasico) {
		this.precioBasico = precioBasico;
	}

	public double getPrecioAltoRendimiento() {
		return precioAltoRendimiento;
	}

	public void setPrecioAltoRendimiento(double precioAltoRendimiento) {
		this.precioAltoRendimiento = precioAltoRendimiento;
	}

	@Override
	public String toString() {
		return "AceiteYfiltro [idAceiteYfiltro=" + idAceiteYfiltro + ", aceiteYfiltroBasico=" + aceiteYfiltroBasico
				+ ", altoRendimiento=" + altoRendimiento + ", precioBasico=" + precioBasico + ", precioAltoRendimiento="
				+ precioAltoRendimiento + "]";
	}


	
	
}
