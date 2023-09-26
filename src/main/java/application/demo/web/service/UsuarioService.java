package application.demo.web.service;

import java.util.List;

import application.demo.web.models.Usuario;

public interface UsuarioService {
  Usuario cadastrar(Usuario model);
  Usuario editar(Long id, Usuario model);
  void deletar(Long id);
  List<Usuario> buscarTodos();
  Usuario buscarPorId(Long id);
}
