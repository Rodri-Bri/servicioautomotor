package certant.pruebaTecnica.servicioautomotor.services;

import java.util.List;
import certant.pruebaTecnica.servicioautomotor.entities.Cliente;



public interface IClienteService {
	
	public List<Cliente> getAll();
	
	public Cliente findById(int id);
	
	
	public Cliente insertOrUpdate(Cliente cliente);
	
	public Cliente findByPatente(String patente);
	
	
}
