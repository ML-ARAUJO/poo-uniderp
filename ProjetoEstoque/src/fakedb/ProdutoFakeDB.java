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
    this.tabela.add(new Produto(201, "Picanha", LocalDate.now(), 101, 67.5));
    this.tabela.add(new Produto(202, "Whisky", LocalDate.now(), 102, 37.5));
    this.tabela.add(new Produto(203, "Grego-Ameixa", LocalDate.now(), 103, 47.5));
    this.tabela.add(new Produto(204, "Limão-Galego", LocalDate.now(), 104, 157.5));
    this.tabela.add(new Produto(205, "Brócoli", LocalDate.now(), 105, 60.5));
  }

  public ProdutoFakeDB() {
    super();
  }

}
