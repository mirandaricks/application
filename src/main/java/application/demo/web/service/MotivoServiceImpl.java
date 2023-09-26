package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.Motivo;
import application.demo.web.repository.MotivoRepository;

@Service
public class MotivoServiceImpl implements MotivoService{

  private MotivoRepository motivoRepository;

  public MotivoServiceImpl(MotivoRepository motivoRepository){
    this.motivoRepository = motivoRepository;
  }

  @Override
  public Motivo buscarPorId(Long id) {
    return motivoRepository.findById(id).orElse(null);
  }

  @Override
  public List<Motivo> buscarTodos() {
    return motivoRepository.findAll();
  }

  @Override
  public Motivo cadastrar(Motivo motivo) {
    return motivoRepository.save(motivo);
  }

  @Override
  public void deletar(Long id) {
    motivoRepository.deleteById(id);
  }

  @Override
  public Motivo editar(Long id, Motivo motivo) {
    if(motivoRepository.existsById(id)){
      motivo.setId(id);
      return motivoRepository.save(motivo);
    }
    return null;
  }


}
