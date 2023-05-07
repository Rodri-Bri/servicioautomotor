package certant.pruebaTecnica.servicioautomotor.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="servicio_basico")
public class ServiciosBasicos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idServicioBasico;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_lavado", nullable = true)
	private Lavado lavado;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_alineacion_ybalanceo", nullable = true)
	private AlineacionYbalanceo alineacionYbalanceo;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_aceite_y_filtro", nullable = true)
	
	private AceiteYfiltro aceiteYfiltro;
	
	
	public ServiciosBasicos() {}

	public ServiciosBasicos(int idServicioBasico, Lavado lavado, AlineacionYbalanceo alineacionYbalanceo,
			AceiteYfiltro aceiteYfiltro) {
		this.idServicioBasico = idServicioBasico;
		this.lavado = lavado;
		this.alineacionYbalanceo = alineacionYbalanceo;
		this.aceiteYfiltro = aceiteYfiltro;
	}




	public int getIdServicioBasico() {
		return idServicioBasico;
	}


	public void setIdServicioBasico(int idServicioBasico) {
		this.idServicioBasico = idServicioBasico;
	}


	public Lavado getLavado() {
		return lavado;
	}


	public void setLavado(Lavado lavado) {
		this.lavado = lavado;
	}


	public AlineacionYbalanceo getAlineacionYbalanceo() {
		return alineacionYbalanceo;
	}


	public void setAlineacionYbalanceo(AlineacionYbalanceo alineacionYbalanceo) {
		this.alineacionYbalanceo = alineacionYbalanceo;
	}


	public AceiteYfiltro getAceiteYfiltro() {
		return aceiteYfiltro;
	}


	public void setAceiteYfiltro(AceiteYfiltro aceiteYfiltro) {
		this.aceiteYfiltro = aceiteYfiltro;
	}

	@Override
	public String toString() {
		return "ServiciosBasicos [idServicioBasico=" + idServicioBasico + ", lavado=" + lavado
				+ ", alineacionYbalanceo=" + alineacionYbalanceo + ", aceiteYfiltro=" + aceiteYfiltro + "]";
	}
	
	
	
	
}
