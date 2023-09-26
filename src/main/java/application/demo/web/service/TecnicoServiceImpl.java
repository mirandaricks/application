package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.Tecnico;
import application.demo.web.repository.TecnicoRepository;

@Service
public class TecnicoServiceImpl implements TecnicoService{

  private TecnicoRepository tecnicoRepository;

  public TecnicoServiceImpl(TecnicoRepository tecnicoRepository){
    this.tecnicoRepository = tecnicoRepository;
  }

  @Override
  public Tecnico buscarPorId(Long id) {
    return tecnicoRepository.findById(id).orElse(null);
  }

  @Override
  public List<Tecnico> buscarTodos() {
    return tecnicoRepository.findAll();
  }

  @Override
  public Tecnico cadastrar(Tecnico tecnico) {
    return tecnicoRepository.save(tecnico);
  }

  @Override
  public void deletar(Long id) {
    tecnicoRepository.deleteById(id);
  }

  @Override
  public Tecnico editar(Long id, Tecnico tecnico) {
    if(tecnicoRepository.existsById(id)){
      tecnico.setId(id);
      return tecnicoRepository.save(tecnico);
    }
    return null;
  }


}
