package certant.pruebaTecnica.servicioautomotor.services.implementacionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import certant.pruebaTecnica.servicioautomotor.entities.AceiteYfiltro;
import certant.pruebaTecnica.servicioautomotor.repositories.IAceiteYfiltroRepository;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AceiteYfiltroService;

public class AceiteYfiltroTest {
	@Mock
	IAceiteYfiltroRepository aceiteYfiltroRepository;
	
	@InjectMocks
	AceiteYfiltroService aceiteYfiltroService;
	
	@BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void insertOrUpdateTest() {
		Mockito.when(aceiteYfiltroRepository.save(Mockito.any())).thenReturn(simulado());
		AceiteYfiltro aceiteYfiltro = aceiteYfiltroService.insertOrUpdate(simulado());
		assertEquals(simulado(),aceiteYfiltro);
	}
	
	
	public static AceiteYfiltro simulado() {
		AceiteYfiltro aceiteYfiltro = new AceiteYfiltro();
		aceiteYfiltro.setAceiteYfiltroBasico(true);
		aceiteYfiltro.setAltoRendimiento(true);
		aceiteYfiltro.setIdAceiteYfiltro(1);
		aceiteYfiltro.setPrecio(2000.00);
		return aceiteYfiltro;
	} 
	
	
}
