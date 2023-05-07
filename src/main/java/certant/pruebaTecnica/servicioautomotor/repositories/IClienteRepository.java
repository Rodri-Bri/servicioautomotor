package certant.pruebaTecnica.servicioautomotor.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certant.pruebaTecnica.servicioautomotor.entities.Cliente;

@Repository("clienteRepository")
public interface IClienteRepository extends JpaRepository<Cliente, Serializable>{
	
	public abstract Cliente findByIdCliente(int idCliente);
	
	public abstract Cliente findByPatente(String patente);
	
}

