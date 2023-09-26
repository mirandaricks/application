package application.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.demo.web.models.Order;
import application.demo.web.service.OrderService;

@Controller
@RequestMapping("/retiradas")
public class OrderController {
  @Autowired
  private OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping
  public String listarOrders(Model model){
    List<Order> orders = orderService.buscarTodos();
    model.addAttribute("orders", orders);
    return "order/formOrder";
  }
}
