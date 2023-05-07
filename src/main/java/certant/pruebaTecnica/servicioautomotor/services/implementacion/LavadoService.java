package certant.pruebaTecnica.servicioautomotor.services.implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import certant.pruebaTecnica.servicioautomotor.entities.Lavado;
import certant.pruebaTecnica.servicioautomotor.repositories.IlavadoRepository;
import certant.pruebaTecnica.servicioautomotor.services.IlavadoService;


@Service("lavadoService")
public class LavadoService implements IlavadoService{

	@Autowired
	@Qualifier("lavadoRepository")
	private IlavadoRepository lavadoRepository;
	
	@Override
	public Lavado insertOrUpdate(Lavado lavado) {
		return lavadoRepository.save(lavado);
	}

}
