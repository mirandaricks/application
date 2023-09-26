package application.demo.web.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "order_item")
public class OrderItem implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "equipamento_id")
  private Equipamento equipamento;
  @Column
  private Integer quantidade;
  @ManyToOne
  @JoinColumn(name = "motivo_id")
  private Motivo motivo;
  @ManyToOne
  @JoinColumn(name = "estado_fisico_id")
  private EstadoFisico estado;
  @ManyToOne
  @JoinColumn(name = "orders_id")
  private Order order;


  public Order getOrder() {
    return order;
  }
  public void setOrder(Order order) {
    this.order = order;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Equipamento getEquipamento() {
    return equipamento;
  }
  public void setEquipamento(Equipamento equipamento) {
    this.equipamento = equipamento;
  }
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }
  public Motivo getMotivo() {
    return motivo;
  }
  public void setMotivo(Motivo motivo) {
    this.motivo = motivo;
  }
  public EstadoFisico getEstado() {
    return estado;
  }
  public void setEstado(EstadoFisico estado) {
    this.estado = estado;
  }



}
