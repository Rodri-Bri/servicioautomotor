package certant.pruebaTecnica.servicioautomotor.services.implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import certant.pruebaTecnica.servicioautomotor.entities.AceiteYfiltro;
import certant.pruebaTecnica.servicioautomotor.repositories.IAceiteYfiltroRepository;
import certant.pruebaTecnica.servicioautomotor.services.IAceiteYfiltroService;


@Service("aceiteYfiltroService")
public class AceiteYfiltroService implements IAceiteYfiltroService{

	@Autowired
	@Qualifier("aceiteYfiltroRepository")
	private IAceiteYfiltroRepository aceiteYfiltroRepository;
	
	@Override
	public  AceiteYfiltro insertOrUpdate(AceiteYfiltro aceiteYfiltro) {
		return aceiteYfiltroRepository.save(aceiteYfiltro);
	}
	

	
	
	
	
	
	
	
	
}
