package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.SubclasseFornecedor;

public class SubclasseFornecedorFakeDB
    extends BaseFakeDB<SubclasseFornecedor> {

  @Override
  protected void preencherDados() {
    // this.tabela = new ArrayList<SubclasseFornecedor>();
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();
    }
    this.tabela.add(new SubclasseFornecedor(1, "Rua dos amigos, 123", LocalDate.now(), "Centro", 01));
    this.tabela.add(new SubclasseFornecedor(2, "Rua Norte, 132", LocalDate.now(), "Regiao Norte", 02));
    this.tabela.add(new SubclasseFornecedor(3, "Rua da Paz, 25", LocalDate.now(), "Regiao Sul", 03));
    this.tabela.add(new SubclasseFornecedor(4, "Rua Rui Barbosa, 180", LocalDate.now(), "Regiao Leste", 04));
  }

  public SubclasseFornecedorFakeDB() {
    super();
  }

}
