package fakedb;

import java.util.ArrayList;

//classe abstrata generica

public abstract class BaseFakeDB<TDominio> {
  // Atributo Generico, para armazenar a instancia de apresentação
  protected ArrayList<TDominio> tabela;

  // propriedade de somente leitura (Reand-only)
  public ArrayList<TDominio> getTabela() {
    return this.tabela;
  }

  // 1 - Métodos abstract não pode ter codigo.
  // 2 - Devem ser codificado nas classes filhas(reais)
  // 3 - Toda vez que a classe filha criar uma instancia será executado esse
  // método.
  // metodo/propriedade para preencher dados
  protected abstract void preencherDados();// 1

  public BaseFakeDB() {
    this.preencherDados();// 2 e 3
  }

}
