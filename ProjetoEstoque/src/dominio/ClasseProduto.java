package dominio;

import java.time.LocalDate;

public class ClasseProduto extends BaseParamentro {

  // construtor padrão(sem parametro) e com parametro
  public ClasseProduto() {
    super();
  }

  public ClasseProduto(int codigo, String descricao, LocalDate dataDeInclusao) {
    super(codigo, descricao, dataDeInclusao);
  }

}
