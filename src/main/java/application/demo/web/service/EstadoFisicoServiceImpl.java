package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.EstadoFisico;
import application.demo.web.repository.EstadoFisicoRepository;

@Service
public class EstadoFisicoServiceImpl implements EstadoFisicoService{

  private EstadoFisicoRepository estadoFisicoRepository;

  public EstadoFisicoServiceImpl(EstadoFisicoRepository estadoFisicoRepository){
    this.estadoFisicoRepository = estadoFisicoRepository;
  }

  @Override
  public EstadoFisico buscarPorId(Long id) {
    return estadoFisicoRepository.findById(id).orElse(null);
  }

  @Override
  public List<EstadoFisico> buscarTodos() {
    return estadoFisicoRepository.findAll();
  }

  @Override
  public EstadoFisico cadastrar(EstadoFisico estadoFisico) {
    return estadoFisicoRepository.save(estadoFisico);
  }

  @Override
  public void deletar(Long id) {
    estadoFisicoRepository.deleteById(id);
  }

  @Override
  public EstadoFisico editar(Long id, EstadoFisico estadoFisico) {
    if(estadoFisicoRepository.existsById(id)){
      estadoFisico.setId(id);
      return estadoFisicoRepository.save(estadoFisico);
    }
    return null;
  }


}
