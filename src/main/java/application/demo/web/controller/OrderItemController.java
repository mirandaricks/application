package application.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.demo.web.models.OrderItem;
import application.demo.web.service.OrderItemService;

@Controller
@RequestMapping("/itens")
public class OrderItemController {

  @Autowired
  private OrderItemService orderItemService;



  public OrderItemController(OrderItemService orderItemService) {
    this.orderItemService = orderItemService;
  }



  @GetMapping
  public List<OrderItem> ListarOrderItens(){
    return orderItemService.buscarTodos();
  }
}
