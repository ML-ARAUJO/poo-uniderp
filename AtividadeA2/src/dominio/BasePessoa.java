package dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

  // variaveis e atributos
  protected String endereco;
  protected LocalDate dataDeInclusao;

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

  // paramentros/construtores
  public BasePessoa() {
  }

  public BasePessoa(String endereco, LocalDate dataDeInclusao) {
    this.endereco = endereco;
    this.dataDeInclusao = dataDeInclusao;
  }

}