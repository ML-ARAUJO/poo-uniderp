package dominio;

import java.time.LocalDate;

public class ClasseFornecedor extends BasePessoa {

  public ClasseFornecedor() {
    super();
  }

  public ClasseFornecedor(String endereco, LocalDate dataDeInclusao, String descricao) {
    super(endereco, dataDeInclusao, descricao);
  }

}