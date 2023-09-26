package application.demo.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.demo.web.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
