package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Fornecedor;

public class FornecedorFakeDB extends BaseFakeDB<Fornecedor> {

  @Override
  protected void preencherDados() {
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();
    }
    this.tabela.add(new Fornecedor(
        "Rua dos amigos, 123", LocalDate.now(),
        "Centro",
        1,
        "Distribuidora de Alimentos Araujo",
        "Distribuidora Araujo",
        "12.345.678.99990/12",
        "daraujo@gmail.com",
        "3344-2222"));

    this.tabela.add(new Fornecedor(
        "Rua Norte, 132", LocalDate.now(),
        "Regiao Norte",
        2,
        "Distribuidora de Bebidas Pereira",
        "Distribuidora Pereira",
        "12.345.678.00002/34",
        "dpereira@gmail.com",
        "3355-4444"));

    this.tabela.add(new Fornecedor(
        "Rua da Paz", LocalDate.now(),
        "Regiao Sul",
        3,
        "Distribuidora de Limpeza Silva",
        "Distribuidora Silva",
        "12.345.678.00001/23",
        "dsilva@gmail.com",
        "3366-5555"));

    this.tabela.add(new Fornecedor(
        "Rua Rui Barbosa, 180", LocalDate.now(),
        "Regiao Leste",
        4,
        "Distribuidora de Carnes Lourenço",
        "Distribuidora Lourenço",
        "12.345.678.0008/58",
        "dlourenco@gmail.com",
        "3377-2222"));
  }

}
