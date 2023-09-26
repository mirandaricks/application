package application.demo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.demo.web.models.Motivo;

@Repository
public interface MotivoRepository extends JpaRepository<Motivo, Long>{

}
