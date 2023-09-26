package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.Categoria;
import application.demo.web.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

  private CategoriaRepository categoriaRepository;

  public CategoriaServiceImpl(CategoriaRepository categoriaRepository){
    this.categoriaRepository = categoriaRepository;
  }

  @Override
  public Categoria buscarPorId(Long id) {
    return categoriaRepository.findById(id).orElse(null);
  }

  @Override
  public List<Categoria> buscarTodos() {
    return categoriaRepository.findAll();
  }

  @Override
  public Categoria cadastrar(Categoria categoria) {
    return categoriaRepository.save(categoria);
  }

  @Override
  public void deletar(Long id) {
    categoriaRepository.deleteById(id);
  }

  @Override
  public Categoria editar(Long id, Categoria categoria) {
    if(categoriaRepository.existsById(id)){
      categoria.setId(id);
      return categoriaRepository.save(categoria);
    }
    return null;
  }


}
