package application.demo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.demo.web.models.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long>{

}
