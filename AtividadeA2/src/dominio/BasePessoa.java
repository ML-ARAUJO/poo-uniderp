package dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

  // variaveis e atributos
  protected int id;
  protected String endereco;
  protected LocalDate dataDeInclusao;
  protected String descricao;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public LocalDate getDataDeInclusao() {
    return dataDeInclusao;
  }

  public void setDataDeInclusao(LocalDate dataDeInclusao) {
    this.dataDeInclusao = dataDeInclusao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  // propriedades
  public BasePessoa() {
  }

  public BasePessoa(int id, String endereco, LocalDate dataDeInclusao, String descricao) {
    this.id = id;
    this.endereco = endereco;
    this.dataDeInclusao = dataDeInclusao;
    this.descricao = descricao;
  }
}