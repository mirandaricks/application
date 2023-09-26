package application.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.demo.web.models.EstadoFisico;
import application.demo.web.service.EstadoFisicoService;

@Controller
@RequestMapping("/estado_fisico")
public class EstadoFisicoController {

  @Autowired
  private EstadoFisicoService estadoFisicoService;

  public EstadoFisicoController(EstadoFisicoService estadoFisicoService) {
    this.estadoFisicoService = estadoFisicoService;
  }

  @GetMapping
  public String listarEstado(Model model){
    List<EstadoFisico> estados = estadoFisicoService.buscarTodos();
    model.addAttribute("estados", estados);
    return "estadoFisico/listaEstadosFisico";
  }
}
