package certant.pruebaTecnica.servicioautomotor.services;

import java.util.List;

import certant.pruebaTecnica.servicioautomotor.entities.Agenda;

public interface IAgendaService {

	public List<Agenda> getAll();
	public Agenda findById(int id);
	public Agenda insertOrUpdate(Agenda Agenda);
	
}
