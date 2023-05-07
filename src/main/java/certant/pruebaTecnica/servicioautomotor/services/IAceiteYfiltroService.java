package certant.pruebaTecnica.servicioautomotor.services;


import certant.pruebaTecnica.servicioautomotor.entities.AceiteYfiltro;

public interface IAceiteYfiltroService {

	public AceiteYfiltro findById(int id);
	public AceiteYfiltro insertOrUpdate(AceiteYfiltro AceiteYfiltro);
	
}
