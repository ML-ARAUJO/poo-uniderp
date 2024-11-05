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

  public SubclasseFornecedor(int codigo, String endereco, LocalDate dataDeInclusao, String descricao,
      int codigoClasse) {
    super(codigo, endereco, dataDeInclusao, descricao);
    this.codigoClasse = codigoClasse;
    this.codigo = codigo;
    this.endereco = endereco;
    this.dataDeInclusao = dataDeInclusao;
    this.descricao = descricao;
  }

}