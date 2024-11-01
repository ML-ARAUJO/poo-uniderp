package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.ClasseFornecedor;

public class ClasseFornecedorFakeDB extends BaseFakeDB<ClasseFornecedor> {

  // instancia dentro do metodo
  @Override
  protected void preencherDados() {
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();
    }
    this.tabela.add(new ClasseFornecedor(1234, "Rua dos amigos, 123", LocalDate.now(), "Centro"));
    this.tabela.add(new ClasseFornecedor(5678, "Rua Norte, 132", LocalDate.now(), "Regiao Norte"));
    this.tabela.add(new ClasseFornecedor(9876, "Rua da Paz, 25", LocalDate.now(), "Regiao Sul"));
    this.tabela.add(new ClasseFornecedor(5432, "Rua Rui Barbosa, 180", LocalDate.now(), "Regiao Leste"));
  }

  public ClasseFornecedorFakeDB() {
    super();
  }

}
