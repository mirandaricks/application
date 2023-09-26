package application.demo.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.demo.web.models.Motivo;
import application.demo.web.service.MotivoService;

@Controller
@RequestMapping("/motivos")
public class MotivoController {
  @Autowired
  private MotivoService motivoService;

  public MotivoController(MotivoService motivoService) {
    this.motivoService = motivoService;
  }

  @GetMapping
  public String ListarMotivo(Model model){
    List<Motivo> motivos = motivoService.buscarTodos();
    model.addAttribute("motivos", motivos);
    return "motivo/listaMotivos";
  }
}
