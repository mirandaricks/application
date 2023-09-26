package application.demo.web.service;

import java.util.List;

import application.demo.web.models.Motivo;

public interface MotivoService {
  Motivo cadastrar(Motivo model);
  Motivo editar(Long id, Motivo model);
  void deletar(Long id);
  List<Motivo> buscarTodos();
  Motivo buscarPorId(Long id);
}
