package certant.pruebaTecnica.servicioautomotor.services.implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import certant.pruebaTecnica.servicioautomotor.entities.ServiciosBasicos;
import certant.pruebaTecnica.servicioautomotor.repositories.IServicioBasicoRepository;
import certant.pruebaTecnica.servicioautomotor.services.IServicioBasicoService;

@Service("servicioBasicoService")
public class ServicioBasicoService implements IServicioBasicoService{

	@Autowired
	@Qualifier("servicioBasicoRepository")
	private IServicioBasicoRepository servicioBasicoRepository;

	@Override
	public ServiciosBasicos insertOrUpdate(ServiciosBasicos servicioBasicos) {
		return servicioBasicoRepository.save(servicioBasicos);
	}
	

}
