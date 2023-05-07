package certant.pruebaTecnica.servicioautomotor.entities;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Agenda")
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAgenda;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_cliente", nullable=true)
	private Cliente cliente;
	
	@Column(name="fecha_y_hora")
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date fechaYhora;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_servicio_basico", nullable=true)
	private ServiciosBasicos servicioContratados;
	
	@Column(nullable=true)
	private double calcularPrecioServicio;
	
	public Agenda() {}

	public Agenda(int idAgenda, Cliente cliente, Date fechaYhora, ServiciosBasicos servicioContratados,
			double calcularPrecioServicio) {
		this.idAgenda = idAgenda;
		this.cliente = cliente;
		this.fechaYhora = fechaYhora;
		this.servicioContratados = servicioContratados;
		this.calcularPrecioServicio = calcularPrecioServicio;
	}

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaYhora() {
		return fechaYhora;
	}

	public void setFechaYhora(Date fechaYhora) {
		this.fechaYhora = fechaYhora;
	}

	public ServiciosBasicos getServicioContratados() {
		return servicioContratados;
	}

	public void setServicioContratados(ServiciosBasicos servicioContratados) {
		this.servicioContratados = servicioContratados;
	}

	public double getCalcularPrecioServicio() {
		return calcularPrecioServicio;
	}

	public void setCalcularPrecioServicio(double calcularPrecioServicio) {
		this.calcularPrecioServicio = calcularPrecioServicio;
	}

	@Override
	public String toString() {
		return "Agenda [idAgenda=" + idAgenda + ", cliente=" + cliente + ", fechaYhora=" + fechaYhora
				+ ", servicioContratados=" + servicioContratados + ", calcularPrecioServicio=" + calcularPrecioServicio
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}