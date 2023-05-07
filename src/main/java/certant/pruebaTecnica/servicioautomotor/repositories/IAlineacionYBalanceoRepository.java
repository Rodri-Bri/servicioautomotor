package certant.pruebaTecnica.servicioautomotor.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import certant.pruebaTecnica.servicioautomotor.entities.AlineacionYbalanceo;


@Repository("alineacionYBalanceoRepository")
public interface IAlineacionYBalanceoRepository extends JpaRepository<AlineacionYbalanceo, Serializable>{

}
