package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.SubclasseFornecedor;

public class SubclasseFornecedorFakeDB
    extends BaseFakeDB<SubclasseFornecedor> {

  @Override
  protected void preencherDados() {
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();
    }
    this.tabela.add(new SubclasseFornecedor(0001, "Rua dos amigos, 123", LocalDate.now(), "Centro", 1));
    this.tabela.add(new SubclasseFornecedor(0002, "Rua Norte, 132", LocalDate.now(), "Regiao Norte", 2));
    this.tabela.add(new SubclasseFornecedor(0003, "Rua da Paz, 25", LocalDate.now(), "Regiao Sul", 3));
    this.tabela.add(new SubclasseFornecedor(0004, "Rua Rui Barbosa, 180", LocalDate.now(), "Regiao Leste", 4));
  }

}
