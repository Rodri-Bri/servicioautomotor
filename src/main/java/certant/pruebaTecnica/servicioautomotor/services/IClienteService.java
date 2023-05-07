package certant.pruebaTecnica.servicioautomotor.services;

import java.util.List;
import certant.pruebaTecnica.servicioautomotor.entities.Cliente;



public interface IClienteService {
	
	public List<Cliente> getAll();
	
	public Cliente findById(int id);
	
	public Cliente findByName(String nroPatente);
	
	public Cliente insertOrUpdate(Cliente cliente);
}
