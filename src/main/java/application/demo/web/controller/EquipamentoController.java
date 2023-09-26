package application.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.demo.web.models.Equipamento;
import application.demo.web.service.EquipamentoService;

@Controller
@RequestMapping("/equipamentos")
public class EquipamentoController {
  @Autowired
  private EquipamentoService equipamentoService;

  public EquipamentoController(EquipamentoService equipamentoService) {
    this.equipamentoService = equipamentoService;
  }

  @GetMapping
    public String listarEquipamento(Model model) {
      List<Equipamento> equipamentos = equipamentoService.buscarTodos();
      model.addAttribute("equipamentos", equipamentos);
        return "equipamento/listaEquipamentos";
    }
}
