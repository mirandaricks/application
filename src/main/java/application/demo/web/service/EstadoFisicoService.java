package application.demo.web.service;

import java.util.List;

import application.demo.web.models.EstadoFisico;

public interface EstadoFisicoService {
  EstadoFisico cadastrar(EstadoFisico model);
  EstadoFisico editar(Long id, EstadoFisico model);
  void deletar(Long id);
  List<EstadoFisico> buscarTodos();
  EstadoFisico buscarPorId(Long id);
}
