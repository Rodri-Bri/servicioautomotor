package certant.pruebaTecnica.servicioautomotor.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certant.pruebaTecnica.servicioautomotor.entities.ServiciosBasicos;


@Repository("servicioBasicoRepository")
public interface IServicioBasicoRepository extends JpaRepository<ServiciosBasicos, Serializable>{

}
