package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.OrderItem;
import application.demo.web.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService{

  private OrderItemRepository orderItemRepository;

  public OrderItemServiceImpl(OrderItemRepository orderItemRepository){
    this.orderItemRepository = orderItemRepository;
  }

  @Override
  public OrderItem buscarPorId(Long id) {
    return orderItemRepository.findById(id).orElse(null);
  }

  @Override
  public List<OrderItem> buscarTodos() {
    return orderItemRepository.findAll();
  }

  @Override
  public OrderItem cadastrar(OrderItem orderItem) {
    return orderItemRepository.save(orderItem);
  }

  @Override
  public void deletar(Long id) {
    orderItemRepository.deleteById(id);
  }

  @Override
  public OrderItem editar(Long id, OrderItem orderItem) {
    if(orderItemRepository.existsById(id)){
      orderItem.setId(id);
      return orderItemRepository.save(orderItem);
    }
    return null;
  }


}
