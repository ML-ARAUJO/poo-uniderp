package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {
  // atributo generico para armazenar instancia de apresentação
  protected ArrayList<TDominio> tabela;

  // propriedade de somente leitura(Reand-only)
  public ArrayList<TDominio> getTabela() {
    return this.tabela;
  }

  // metodos abstratc é vazio
  protected abstract void preencherDados();

  // codificar nas classes filhas e ao criar uma instancia será executado
  // preencherDados.
  public BaseFakeDB() {
    this.preencherDados();
  }
}
