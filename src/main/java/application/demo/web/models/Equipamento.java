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
@Table(name = "equipamentos")
public class Equipamento implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column
  private String nome;
  private String mac;
  private Tecn
  @ManyToOne
  @JoinColumn(name = "categoria_id")
  private Categoria categoria;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Categoria getCategoria() {
    return categoria;
  }
  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }


}
