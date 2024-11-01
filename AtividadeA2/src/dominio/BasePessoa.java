package dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

  // variaveis e atributos
  protected int codigo;
  protected String endereco;
  protected LocalDate dataDeInclusao;
  protected String descricao;

  // propriedades

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
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

  // construtor/propriedade
  public BasePessoa() {
  }

  public BasePessoa(int codigo, String endereco, LocalDate dataDeInclusao, String descricao) {
    this.codigo = codigo;
    this.dataDeInclusao = dataDeInclusao;
    this.descricao = descricao;
  }

}