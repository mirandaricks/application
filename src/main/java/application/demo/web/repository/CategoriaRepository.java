package application.demo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.demo.web.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
