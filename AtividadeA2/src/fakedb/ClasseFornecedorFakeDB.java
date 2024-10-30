package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.ClasseFornecedor;

public class ClasseFornecedorFakeDB extends BaseFakeDB<ClasseFornecedor> {

  @Override
  protected void preencherDados() {
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();
    }
    this.tabela.add(new ClasseFornecedor("Rua dos amigos, 123", LocalDate.now()));
    this.tabela.add(new ClasseFornecedor("Rua Norte, 132", LocalDate.now()));
    this.tabela.add(new ClasseFornecedor("Rua da Paz, 25", LocalDate.now()));
    this.tabela.add(new ClasseFornecedor("Rua Rui Barbosa, 180", LocalDate.now()));
  }

  public ClasseFornecedorFakeDB() {
    super();
  }

}
