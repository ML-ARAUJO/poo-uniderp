package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

  @Override
  public void preencherDados() {
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();
    }
    this.tabela.add(new Produto(1, "Picanha", LocalDate.now(), 1, 67.5));
    this.tabela.add(new Produto(1, "Maminha", LocalDate.now(), 2, 37.5));
    this.tabela.add(new Produto(1, "Contra-Filé", LocalDate.now(), 3, 47.5));
    this.tabela.add(new Produto(1, "Angus", LocalDate.now(), 4, 157.5));
    this.tabela.add(new Produto(1, "Filé Mignon", LocalDate.now(), 5, 60.5));
  }

  public ProdutoFakeDB() {
    super();
  }

}
