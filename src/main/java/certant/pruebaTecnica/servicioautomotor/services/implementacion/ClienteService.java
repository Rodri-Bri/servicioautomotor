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
		return clienteRepository.findByIdCliente(id);
	}

	@Override
	public Cliente findByName(String nroPatente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Cliente insertOrUpdate(Cliente cliente) {
//		Cliente clientebd = clienteRepository.findByPatente(cliente.getPatente());
//		System.out.println("clientebd"+clientebd);
//		System.out.println("cliente"+cliente);
//		if(clientebd != null) {
//			clientebd.setCantServiciosContratados(cliente.getCantServiciosContratados()+clientebd.getCantServiciosContratados());
//			return clienteRepository.save(clientebd);
//		}
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente findByPatente(String patente) {
		return clienteRepository.findByPatente(patente);
	}
	
	
	
}
