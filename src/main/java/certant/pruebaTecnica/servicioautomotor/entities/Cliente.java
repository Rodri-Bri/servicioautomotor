package certant.pruebaTecnica.servicioautomotor.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Getter @Setter @NoArgsConstructor
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	private String nombre;
	private String patente;
	private boolean isPremium = false;
	private int cantServiciosContratados;
	
	
	public Cliente() {}


	public Cliente(int idCliente, String nombre, String patente, boolean isPremium, int cantServiciosContratados) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.patente = patente;
		this.isPremium = isPremium;
		this.cantServiciosContratados = cantServiciosContratados;
	}



	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	
	public int getCantServiciosContratados() {
		return cantServiciosContratados;
	}

	public void setCantServiciosContratados(int cantServiciosContratados) {
		this.cantServiciosContratados = cantServiciosContratados;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", patente=" + patente
				+ ", cantServiciosContratados=" + cantServiciosContratados + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cantServiciosContratados, idCliente, isPremium, nombre, patente);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cantServiciosContratados == other.cantServiciosContratados && idCliente == other.idCliente
				&& isPremium == other.isPremium && Objects.equals(nombre, other.nombre)
				&& Objects.equals(patente, other.patente);
	}

	
	
	
	
}
