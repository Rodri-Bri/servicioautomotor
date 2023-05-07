package certant.pruebaTecnica.servicioautomotor.services.implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import certant.pruebaTecnica.servicioautomotor.entities.AlineacionYbalanceo;
import certant.pruebaTecnica.servicioautomotor.repositories.IAlineacionYBalanceoRepository;
import certant.pruebaTecnica.servicioautomotor.services.IAlineacionYBalanceoService;


@Service("alineacionYbalanceoService")
public class AlineacionYbalanceoService implements IAlineacionYBalanceoService{

	@Autowired
	@Qualifier("alineacionYBalanceoRepository")
	private IAlineacionYBalanceoRepository alineacionYbalanceoRepository;
	
	@Override
	public AlineacionYbalanceo insertOrUpdate(AlineacionYbalanceo alineacionYbalanceo) {
		return alineacionYbalanceoRepository.save(alineacionYbalanceo);
	}
	
	
	
}
