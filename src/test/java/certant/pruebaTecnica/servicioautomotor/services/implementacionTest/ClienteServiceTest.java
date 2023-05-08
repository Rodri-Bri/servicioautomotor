package certant.pruebaTecnica.servicioautomotor.services.implementacionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import certant.pruebaTecnica.servicioautomotor.entities.Agenda;
import certant.pruebaTecnica.servicioautomotor.entities.Cliente;
import certant.pruebaTecnica.servicioautomotor.repositories.IClienteRepository;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.ClienteService;

public class ClienteServiceTest {

	@Mock
	IClienteRepository clienteRepository;
	
	@InjectMocks
	ClienteService clienteService;
	
	@BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
	}
	
	
	@Test
	public void getAllTest() throws Exception{
		List<Cliente> listCliente = new ArrayList<>();
		Cliente cliente = new Cliente();
		cliente.setCantServiciosContratados(1);;
		cliente.setIdCliente(1);;
		cliente.setNombre("Rodrigo");;
		cliente.setPatente("aa111aa");
		cliente.setPremium(true);
		listCliente.add(cliente);
		
		Mockito.when(clienteRepository.findAll()).thenReturn(listCliente);
		List<Cliente> expected = clienteService.getAll();
		assertEquals(listCliente, expected);
	}
	
	
	@Test
	public void findByIdTest() throws Exception {
		Mockito.when(clienteRepository.findByIdCliente(1)).thenReturn(simulado());
		Cliente cliente = clienteService.findById(1);
		assertEquals(simulado(), cliente);
	}
	
	@Test
	public void insertOrUpdateTest() throws Exception {
		Mockito.when(clienteRepository.save(Mockito.any())).thenReturn(simulado());
		Cliente cliente = clienteService.insertOrUpdate(simulado());
		assertEquals(simulado(), cliente);
	}
	
	@Test
	public void findByPatenteTest() throws Exception {
		Mockito.when(clienteRepository.findByPatente("aa111aa")).thenReturn(simulado());
		Cliente cliente = clienteService.findByPatente("aa111aa");
		assertEquals(simulado(), cliente);
	}
	
	
	public static Cliente simulado() throws Exception {
		Cliente cliente = new Cliente();
		cliente.setCantServiciosContratados(1);;
		cliente.setIdCliente(1);
		cliente.setNombre("Rodrigo");
		cliente.setPatente("aa111aa");
		cliente.setPremium(true);
		return cliente;
	} 
}
