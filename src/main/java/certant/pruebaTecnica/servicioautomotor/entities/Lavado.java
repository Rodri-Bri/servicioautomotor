package certant.pruebaTecnica.servicioautomotor.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="lavado")
public class Lavado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLavado;
	
	
	@Column(columnDefinition = "boolean default false", nullable=true)
	private boolean basico;
	@Column(columnDefinition = "boolean default false", nullable=true)
	private boolean completo;
	@Column(columnDefinition = "boolean default false", nullable=true)
	private boolean premium;
	
	@Column
	private double precio;

	
	public Lavado() {}
	
	public Lavado(int idLavado, boolean basico, boolean completo, boolean premium, double precio) {
		this.idLavado = idLavado;
		this.basico = basico;
		this.completo = completo;
		this.premium = premium;
		this.precio = precio;

	}

	public int getIdLavado() {
		return idLavado;
	}

	public void setIdLavado(int idLavado) {
		this.idLavado = idLavado;
	}

	public boolean isBasico() {
		return basico;
	}

	public void setBasico(boolean basico) {
		this.basico = basico;
	}

	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Lavado [idLavado=" + idLavado + ", basico=" + basico + ", completo=" + completo + ", premium=" + premium
				+ ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(basico, completo, idLavado, precio, premium);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lavado other = (Lavado) obj;
		return basico == other.basico && completo == other.completo && idLavado == other.idLavado
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && premium == other.premium;
	}










	
	
	
}
