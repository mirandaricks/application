package application.demo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.demo.web.models.EstadoFisico;

@Repository
public interface EstadoFisicoRepository extends JpaRepository<EstadoFisico, Long>{

}
