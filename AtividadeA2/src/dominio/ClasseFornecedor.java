package dominio;

import java.time.LocalDate;

public class ClasseFornecedor extends BasePessoa {

  public ClasseFornecedor() {
    super();
  }

  public ClasseFornecedor(int id, String endereco, LocalDate dataDeInclusao, String descricao) {
    super(id, endereco, dataDeInclusao, descricao);
  }

  @Override
  public String toString() {
    String msg = "Classe Fornecedor";
    msg += "\n\tid=" + this.id;
    msg += "\n\tendereço=" + this.endereco;
    msg += "\n\tdataDeInclusão=" + this.dataDeInclusao;
    msg += "\n\tdescrição=" + this.descricao;
    return msg;
  }

}