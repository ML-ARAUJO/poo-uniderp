package dominio;

import java.time.LocalDate;

public abstract class BaseParamentro {

  protected int codigo;
  protected String descricao;
  protected LocalDate dataDeInclusao;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataDeInclusao() {
    return dataDeInclusao;
  }

  public void setDataDeInclusao(LocalDate dataDeInclusao) {
    this.dataDeInclusao = dataDeInclusao;
  }

  public BaseParamentro() {
  }

  public BaseParamentro(int codigo, String descricao, LocalDate dataDeInclusao) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.dataDeInclusao = dataDeInclusao;
  }

}