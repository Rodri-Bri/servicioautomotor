package certant.pruebaTecnica.servicioautomotor.services.implementacionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import certant.pruebaTecnica.servicioautomotor.entities.AceiteYfiltro;
import certant.pruebaTecnica.servicioautomotor.entities.Lavado;
import certant.pruebaTecnica.servicioautomotor.repositories.IAceiteYfiltroRepository;
import certant.pruebaTecnica.servicioautomotor.repositories.IlavadoRepository;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AceiteYfiltroService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.LavadoService;

public class LavadoServiceTest {

	@Mock
	IlavadoRepository lavadoRepository;
	
	@InjectMocks
	LavadoService lavadoService;
	
	@BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void insertOrUpdateTest() {
		Mockito.when(lavadoRepository.save(Mockito.any())).thenReturn(simulado());
		Lavado lavado = lavadoService.insertOrUpdate(simulado());
		assertEquals(simulado(), lavado);
	}
	
	public static Lavado simulado() {
		Lavado lavado = new Lavado();
		lavado.setBasico(true);
		lavado.setCompleto(false);
		lavado.setIdLavado(1);
		lavado.setPrecio(1000.00);
		lavado.setPremium(true);
		return lavado;
	} 
	
	
}
