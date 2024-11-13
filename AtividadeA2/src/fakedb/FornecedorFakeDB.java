package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Fornecedor;

public class FornecedorFakeDB extends BaseFakeDB<Fornecedor> {

  @Override
  protected void preencherDados() {
    // this.tabela = new ArrayList<>();
    if (this.tabela == null) {
      this.tabela = new ArrayList<>();// Linha principal
    }

    this.tabela.add(new Fornecedor(
        101,
        "Rua Centro Oeste, 1000",
        LocalDate.now(),
        "Região Norte",

        001,
        "Distribuidora de Alimentos Araujo Ltda",
        "Distribuidora Araujo",
        "12.345.678.0009/12",
        "daraujo@gmail.com",
        "3333-1010"));

    this.tabela.add(new Fornecedor(
        102,
        "Rua Norte, 132", LocalDate.now(),
        "Regiao Norte",

        002,
        "Distribuidora de Bebidas Pereira",
        "Distribuidora Pereira",
        "12.345.678.00002/34",
        "dpereira@gmail.com",
        "3355-4444"));

    this.tabela.add(new Fornecedor(
        103,
        "Rua da Paz", LocalDate.now(),
        "Regiao Sul",

        003,
        "Distribuidora de Limpeza Silva",
        "Distribuidora Silva",
        "12.345.678.00001/23",
        "dsilva@gmail.com",
        "3366-5555"));

    this.tabela.add(new Fornecedor(
        104,
        "Rua Rui Barbosa, 180", LocalDate.now(),
        "Regiao Leste",

        004,
        "Distribuidora de Carnes Lourenço",
        "Distribuidora Lourenço",
        "12.345.678.0008/58",
        "dlourenco@gmail.com",
        "3377-2222"));
  }

  // para chamar construtor do pai o preencher dados
  public FornecedorFakeDB() {
    super();
  }

}
