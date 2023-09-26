package application.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.demo.web.models.Tecnico;
import application.demo.web.service.TecnicoService;

@Controller
@RequestMapping("/tecnicos")
public class TecnicoController {

  @Autowired
  private TecnicoService tecnicoService;


  public TecnicoController(TecnicoService tecnicoService) {
    this.tecnicoService = tecnicoService;
  }


  @GetMapping
  public String listarTecnico(Model model){
    List<Tecnico> tecnicos = tecnicoService.buscarTodos();
    model.addAttribute("tecnicos", tecnicos);
    return "tecnico/listaTecnicos";
  }
}
