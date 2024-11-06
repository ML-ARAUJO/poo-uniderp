package dominio;

import java.time.LocalDate;

public class SubclasseFornecedor extends BasePessoa {

  private int codigoClasse;

  public int getCodigoClasse() {
    return codigoClasse;
  }

  public void setCodigoClasse(int codigoClasse) {
    this.codigoClasse = codigoClasse;
  }

  public SubclasseFornecedor() {
    super();
  }

  public SubclasseFornecedor(int id, String endereco, LocalDate dataDeInclusao, String descricao, int codigoClasse) {
    super(id, endereco, dataDeInclusao, descricao);
    this.codigoClasse = codigoClasse;
  }

  @Override
  public String toString() {
    return "SubclasseFornecedor [codigoClasse=" + codigoClasse + ", id=" + id + ", endereco=" + endereco
        + ", dataDeInclusao=" + dataDeInclusao + ", descricao=" + descricao + "]";
  }

}