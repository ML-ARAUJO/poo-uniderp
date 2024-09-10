package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.SubclasseProduto;

public class SubclasseProdutoFakeDB extends BaseFakeDB<SubclasseProduto> {

  @Override
  protected void preencherDados() {
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();
    }
    this.tabela.add(new SubclasseProduto(101, "Bovino", LocalDate.now(), 1));
    this.tabela.add(new SubclasseProduto(102, "Alcoólicas", LocalDate.now(), 2));
    this.tabela.add(new SubclasseProduto(103, "Iogurts", LocalDate.now(), 3));
    this.tabela.add(new SubclasseProduto(104, "Ácidas", LocalDate.now(), 4));
    this.tabela.add(new SubclasseProduto(105, "Hortaliças-Verdes", LocalDate.now(), 5));
  }

}
