package certant.pruebaTecnica.servicioautomotor.services.implementacionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import certant.pruebaTecnica.servicioautomotor.entities.Agenda;
import certant.pruebaTecnica.servicioautomotor.repositories.IAgendaRepository;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AgendaService;

public class AgendaServiceTest {
	
	@Mock
	IAgendaRepository repository;
	
	@InjectMocks
	AgendaService service;
	
	@BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void getAllTest() {
		List<Agenda> listAgenda = new ArrayList<>();
		Agenda agenda = new Agenda();
		agenda.setCalcularPrecioServicio(12);
		agenda.setFechaYhora(new Date());
		agenda.setIdAgenda(1);
		listAgenda.add(agenda);
		
		Mockito.when(repository.findAll()).thenReturn(listAgenda);
		List<Agenda> expected = service.getAll();
		assertEquals(listAgenda, expected);
	}
	
	@Test
	public void findByIdTest() {
		Mockito.when(repository.findByIdAgenda(1)).thenReturn(simulado());
		Agenda agenda = service.findById(1);
		assertEquals(simulado(), agenda);
	}
	
	
	@Test
	public void insertOrUpdateTest() {
		Mockito.when(repository.save(Mockito.any())).thenReturn(simulado());
		Agenda agenda = service.insertOrUpdate(simulado());
		assertEquals(simulado(), agenda);
	}
	
	
	public static Agenda simulado() {
		Agenda agenda = new Agenda();
		agenda.setCalcularPrecioServicio(12);
		agenda.setFechaYhora(new Date());
		agenda.setIdAgenda(1);
		return agenda;
	} 
	

	
}
