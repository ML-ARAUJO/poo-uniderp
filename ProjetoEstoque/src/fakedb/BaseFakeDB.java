package fakedb;

import java.util.ArrayList;

//classe abstrata generica

public abstract class BaseFakeDB<TDominio> {
  // Atributo Generico
  protected ArrayList<TDominio> tabela;

  public ArrayList<TDominio> getTabela() {
    return this.tabela;
  }

  // metodo/propriedade para preencher dados
  public abstract void preencherDados();

  public BaseFakeDB() {
    this.preencherDados();
  }

}
