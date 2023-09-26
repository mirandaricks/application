package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.Order;
import application.demo.web.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

  private OrderRepository orderRepository;

  public OrderServiceImpl(OrderRepository orderRepository){
    this.orderRepository = orderRepository;
  }

  @Override
  public Order buscarPorId(Long id) {
    return orderRepository.findById(id).orElse(null);
  }

  @Override
  public List<Order> buscarTodos() {
    return orderRepository.findAll();
  }

  @Override
  public Order cadastrar(Order order) {
    return orderRepository.save(order);
  }

  @Override
  public void deletar(Long id) {
    orderRepository.deleteById(id);
  }

  @Override
  public Order editar(Long id, Order order) {
    if(orderRepository.existsById(id)){
      order.setId(id);
      return orderRepository.save(order);
    }
    return null;
  }


}
