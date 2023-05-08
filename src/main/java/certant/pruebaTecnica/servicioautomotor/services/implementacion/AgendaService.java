package certant.pruebaTecnica.servicioautomotor.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import certant.pruebaTecnica.servicioautomotor.entities.Agenda;
import certant.pruebaTecnica.servicioautomotor.repositories.IAgendaRepository;
import certant.pruebaTecnica.servicioautomotor.services.IAgendaService;


@Service("agendaService")
public class AgendaService implements IAgendaService{
	
	
	@Autowired
	@Qualifier("agendaRepository")
	private IAgendaRepository agendaRepository;
	
	@Override
	public List<Agenda> getAll(){
		// TODO Auto-generated method stub
		//AGREGAR LOGICA DE NEGOCIA ACA-
		return agendaRepository.findAll();
	}

	@Override
	public Agenda findById(int id) {
		return agendaRepository.findByIdAgenda(id);
	}

	
	@Override
	public Agenda insertOrUpdate(Agenda Agenda) {
		return agendaRepository.save(Agenda);
	}
	
}
