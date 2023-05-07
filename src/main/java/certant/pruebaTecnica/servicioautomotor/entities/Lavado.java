package certant.pruebaTecnica.servicioautomotor.entities;

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
	
	@Column(columnDefinition = "double default 20")
	private double precioBasico;
	@Column(columnDefinition = "double default 50")
	private double precioCompleto;
	@Column(columnDefinition = "double default 100")
	private double precioPremium;
	
	public Lavado() {}
	
	public Lavado(int idLavado, boolean basico, boolean completo, boolean premium, double precioBasico,
			double precioCompleto, double precioPremium) {
		this.idLavado = idLavado;
		this.basico = basico;
		this.completo = completo;
		this.premium = premium;
		this.precioBasico = precioBasico;
		this.precioCompleto = precioCompleto;
		this.precioPremium = precioPremium;
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

	public double getPrecioBasico() {
		return precioBasico;
	}

	public void setPrecioBasico(double precioBasico) {
		this.precioBasico = precioBasico;
	}

	public double getPrecioCompleto() {
		return precioCompleto;
	}

	public void setPrecioCompleto(double precioCompleto) {
		this.precioCompleto = precioCompleto;
	}

	public double getPrecioPremium() {
		return precioPremium;
	}

	public void setPrecioPremium(double precioPremium) {
		this.precioPremium = precioPremium;
	}

	@Override
	public String toString() {
		return "Lavado [idLavado=" + idLavado + ", basico=" + basico + ", completo=" + completo + ", premium=" + premium
				+ ", precioBasico=" + precioBasico + ", precioCompleto=" + precioCompleto + ", precioPremium="
				+ precioPremium + "]";
	}


	
	
	
}
