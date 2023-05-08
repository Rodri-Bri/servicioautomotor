package certant.pruebaTecnica.servicioautomotor.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="alineacion_y_balanceo")
public class AlineacionYbalanceo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlineacionYbalanceo;
	
	@Column(columnDefinition = "boolean default false", nullable = true)
	private boolean cambioDeCubierta;
	
	
	@Column()
	private double precio;
	
	public AlineacionYbalanceo() {}

	public AlineacionYbalanceo(int idAlineacionYbalanceo, boolean cambioDeCubierta, double precio) {
		super();
		this.idAlineacionYbalanceo = idAlineacionYbalanceo;
		this.cambioDeCubierta = cambioDeCubierta;
		this.precio = precio;
	}

	public int getIdAlineacionYbalanceo() {
		return idAlineacionYbalanceo;
	}

	public void setIdAlineacionYbalanceo(int idAlineacionYbalanceo) {
		this.idAlineacionYbalanceo = idAlineacionYbalanceo;
	}

	public boolean isCambioDeCubierta() {
		return cambioDeCubierta;
	}

	public void setCambioDeCubierta(boolean cambioDeCubierta) {
		this.cambioDeCubierta = cambioDeCubierta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "AlineacionYbalanceo [idAlineacionYbalanceo=" + idAlineacionYbalanceo + ", cambioDeCubierta="
				+ cambioDeCubierta + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cambioDeCubierta, idAlineacionYbalanceo, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlineacionYbalanceo other = (AlineacionYbalanceo) obj;
		return cambioDeCubierta == other.cambioDeCubierta && idAlineacionYbalanceo == other.idAlineacionYbalanceo
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}


	

	
	
	
	
}
