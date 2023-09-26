package application.demo.web.service;

import java.util.List;

import application.demo.web.models.Equipamento;

public interface EquipamentoService {
  Equipamento cadastrar(Equipamento model);
  Equipamento editar(Long id, Equipamento model);
  void deletar(Long id);
  List<Equipamento> buscarTodos();
  Equipamento buscarPorId(Long id);
}
