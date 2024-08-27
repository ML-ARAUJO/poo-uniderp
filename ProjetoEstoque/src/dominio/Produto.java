package dominio;

import java.time.LocalDate;

public class Produto extends BaseParamentro {
  // atribudos
  private int codigoSubClasse;
  private double valor;

  // propriedades
  public int getCodigoSubClasse() {
    return codigoSubClasse;
  }

  public void setCodigoSubClasse(int codigoSubClasse) {
    this.codigoSubClasse = codigoSubClasse;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  // construtur/paramentros
  public Produto() {
    super();
  }

  public Produto(int codigo, String descricao, LocalDate dataDeInclusao, int codigoSubClasse, double valor) {
    super(codigo, descricao, dataDeInclusao);
    this.codigoSubClasse = codigoSubClasse;
    this.valor = valor;
  }

}
