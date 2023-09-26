package application.demo.web.service;

import java.util.List;

import application.demo.web.models.Categoria;

public interface CategoriaService {
  Categoria cadastrar(Categoria categoria);
  Categoria editar(Long id, Categoria categoria);
  void deletar(Long id);
  List<Categoria> buscarTodos();
  Categoria buscarPorId(Long id);
}
