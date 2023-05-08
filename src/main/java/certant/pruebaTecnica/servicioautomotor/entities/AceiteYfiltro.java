package certant.pruebaTecnica.servicioautomotor.entities;

import java.util.Objects;

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
	
	@Column
	private double precio;
	
	public AceiteYfiltro() {}

	public AceiteYfiltro(int idAceiteYfiltro, boolean aceiteYfiltroBasico, boolean altoRendimiento, double precioBasico,
			double precioAltoRendimiento, double precio) {
		this.idAceiteYfiltro = idAceiteYfiltro;
		this.aceiteYfiltroBasico = aceiteYfiltroBasico;
		this.altoRendimiento = altoRendimiento;
		this.precio = precio;
		
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "AceiteYfiltro [idAceiteYfiltro=" + idAceiteYfiltro + ", aceiteYfiltroBasico=" + aceiteYfiltroBasico
				+ ", altoRendimiento=" + altoRendimiento + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aceiteYfiltroBasico, altoRendimiento, idAceiteYfiltro, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AceiteYfiltro other = (AceiteYfiltro) obj;
		return aceiteYfiltroBasico == other.aceiteYfiltroBasico && altoRendimiento == other.altoRendimiento
				&& idAceiteYfiltro == other.idAceiteYfiltro
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	


	
	
}
