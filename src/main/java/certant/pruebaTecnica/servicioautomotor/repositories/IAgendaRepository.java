package certant.pruebaTecnica.servicioautomotor.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certant.pruebaTecnica.servicioautomotor.entities.Agenda;
import certant.pruebaTecnica.servicioautomotor.entities.Cliente;


@Repository("agendaRepository")
public interface IAgendaRepository extends JpaRepository<Agenda, Serializable>{
	public abstract Agenda findByIdAgenda(int idAgenda);
	public abstract List<Agenda> findAllByCliente(Cliente cliente);
}
