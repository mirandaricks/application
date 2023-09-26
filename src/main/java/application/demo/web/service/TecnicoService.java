package application.demo.web.service;

import java.util.List;

import application.demo.web.models.Tecnico;

public interface TecnicoService {
  Tecnico cadastrar(Tecnico model);
  Tecnico editar(Long id, Tecnico model);
  void deletar(Long id);
  List<Tecnico> buscarTodos();
  Tecnico buscarPorId(Long id);
}
