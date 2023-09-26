package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.Usuario;
import application.demo.web.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

  private UsuarioRepository usuarioRepository;

  public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
  }

  @Override
  public Usuario buscarPorId(Long id) {
    return usuarioRepository.findById(id).orElse(null);
  }

  @Override
  public List<Usuario> buscarTodos() {
    return usuarioRepository.findAll();
  }

  @Override
  public Usuario cadastrar(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  @Override
  public void deletar(Long id) {
    usuarioRepository.deleteById(id);
  }

  @Override
  public Usuario editar(Long id, Usuario usuario) {
    if(usuarioRepository.existsById(id)){
      usuario.setId(id);
      return usuarioRepository.save(usuario);
    }
    return null;
  }


}
