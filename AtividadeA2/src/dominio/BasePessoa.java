package dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

  // variaveis e atributos
  protected String endereco;
  protected LocalDate dataDeInclusao;
  protected String descricao;

  // propriedades
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

  // paramentros/construtores
  public BasePessoa() {
  }

  public BasePessoa(String endereco, LocalDate dataDeInclusao, String descricao) {
    this.endereco = endereco;
    this.dataDeInclusao = dataDeInclusao;
    this.descricao = descricao;
  }

}