package application.demo.web.service;

import java.util.List;

import application.demo.web.models.OrderItem;

public interface OrderItemService {
  OrderItem cadastrar(OrderItem model);
  OrderItem editar(Long id, OrderItem model);
  void deletar(Long id);
  List<OrderItem> buscarTodos();
  OrderItem buscarPorId(Long id);
}
