package repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<TDominio> {
  // para representar os dados
  protected ArrayList<TDominio> dados;

  // BREAD
  public ArrayList<TDominio> Browser() {// readAll
    return this.dados;
  }

  public abstract TDominio Read(int chave);// Read

  public abstract TDominio Edit(TDominio instancia);// Update

  public abstract TDominio Add(TDominio instancia);// CREATE

  public abstract TDominio Delete(int chave);// DELETE

}
