package certant.pruebaTecnica.servicioautomotor.services.implementacionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import certant.pruebaTecnica.servicioautomotor.entities.Agenda;
import certant.pruebaTecnica.servicioautomotor.entities.AlineacionYbalanceo;
import certant.pruebaTecnica.servicioautomotor.repositories.IAgendaRepository;
import certant.pruebaTecnica.servicioautomotor.repositories.IAlineacionYBalanceoRepository;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AgendaService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AlineacionYbalanceoService;

public class AlineacionYBalanceoServiceTest {

	@Mock
	IAlineacionYBalanceoRepository alineacionYBalanceoRepository;
	
	@InjectMocks
	AlineacionYbalanceoService alineacionYbalanceoService;
	
	@BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void insertOrUpdateTest() {
		Mockito.when(alineacionYBalanceoRepository.save(Mockito.any())).thenReturn(simulado());
		AlineacionYbalanceo alineacionybalanceo = alineacionYbalanceoService.insertOrUpdate(simulado());
		assertEquals(simulado(), alineacionybalanceo);
	}
	
	
	public static AlineacionYbalanceo simulado() {
		AlineacionYbalanceo alineacionYbalanceo = new AlineacionYbalanceo();
		alineacionYbalanceo.setCambioDeCubierta(true);
		alineacionYbalanceo.setIdAlineacionYbalanceo(1);
		alineacionYbalanceo.setPrecio(2000.00);
		return alineacionYbalanceo;
	} 
	
}
