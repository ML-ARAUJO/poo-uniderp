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
    this.tabela.add(new SubclasseFornecedor("Rua dos amigos, 123", LocalDate.now(), 1));
    this.tabela.add(new SubclasseFornecedor("Rua Norte, 132", LocalDate.now(), 2));
    this.tabela.add(new SubclasseFornecedor("Rua da Paz, 25", LocalDate.now(), 3));
    this.tabela.add(new SubclasseFornecedor("Rua Rui Barbosa, 180", LocalDate.now(), 4));
  }

}
