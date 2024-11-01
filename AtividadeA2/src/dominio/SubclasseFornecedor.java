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
  }

  public SubclasseFornecedor(String endereco, LocalDate dataDeInclusao, String descricao, int codigoClasse) {
    super(endereco, dataDeInclusao, descricao);
    this.codigoClasse = codigoClasse;
  }

}
