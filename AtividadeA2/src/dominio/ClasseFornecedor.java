package dominio;

import java.time.LocalDate;

public class ClasseFornecedor extends BasePessoa {

  public ClasseFornecedor() {
    super();
  }

  public ClasseFornecedor(int codigo, String endereco, LocalDate dataDeInclusao, String descricao) {
    super(codigo, endereco, dataDeInclusao, descricao);
    this.codigo = codigo;
    this.endereco = endereco;
    this.dataDeInclusao = dataDeInclusao;
    this.descricao = descricao;
  }

}