package application.demo.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import application.demo.web.models.Equipamento;
import application.demo.web.repository.EquipamentoRepository;
import jakarta.transaction.Transactional;

@Service
public class EquipamentoServiceImpl implements EquipamentoService{

  private EquipamentoRepository equipamentoRepository;

  public EquipamentoServiceImpl(EquipamentoRepository equipamentoRepository){
    this.equipamentoRepository = equipamentoRepository;
  }

  @Override
  public Equipamento buscarPorId(Long id) {
    return equipamentoRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public List<Equipamento> buscarTodos() {
    return equipamentoRepository.findAll();
  }

  @Override
  public Equipamento cadastrar(Equipamento equipamento) {
    return equipamentoRepository.save(equipamento);
  }

  @Override
  public void deletar(Long id) {
    equipamentoRepository.deleteById(id);
  }

  @Override
  public Equipamento editar(Long id, Equipamento equipamento) {
    if(equipamentoRepository.existsById(id)){
      equipamento.setId(id);
      return equipamentoRepository.save(equipamento);
    }
    return null;
  }


}
