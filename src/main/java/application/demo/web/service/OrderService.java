package application.demo.web.service;

import java.util.List;

import application.demo.web.models.Order;

public interface OrderService {
  Order cadastrar(Order model);
  Order editar(Long id, Order model);
  void deletar(Long id);
  List<Order> buscarTodos();
  Order buscarPorId(Long id);
}
