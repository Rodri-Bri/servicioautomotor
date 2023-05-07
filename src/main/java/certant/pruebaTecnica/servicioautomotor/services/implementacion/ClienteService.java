package certant.pruebaTecnica.servicioautomotor.services.implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import certant.pruebaTecnica.servicioautomotor.entities.Cliente;
import certant.pruebaTecnica.servicioautomotor.repositories.IClienteRepository;
import certant.pruebaTecnica.servicioautomotor.services.IClienteService;

@Service("clienteService")
public class ClienteService implements IClienteService{
	
	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> getAll(){
		// TODO Auto-generated method stub
		//AGREGAR LOGICA DE NEGOCIA ACA-
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findByName(String nroPatente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Cliente insertOrUpdate(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
	
}
