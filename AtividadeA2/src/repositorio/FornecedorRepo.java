package repositorio;

import dominio.Fornecedor;
import fakedb.FornecedorFakeDB;

public class FornecedorRepo extends BaseRepositorio<Fornecedor> {
  // Instrancia para conhece ser base db;
  private FornecedorFakeDB db;

  // construtor
  public FornecedorRepo() {
    this.db = new FornecedorFakeDB();
    this.dados = this.db.getTabela();
  }

  @Override
  public Fornecedor Read(int chave) {
    for (Fornecedor forn : dados) {
      if (chave == forn.getCodigo()) {
        return forn;
      }
    }
    return null;
  }

  @Override
  public Fornecedor Edit(Fornecedor instancia) {
    Fornecedor forn = this.Read(instancia.getCodigo());
    if (forn != null) {
      forn.setDescricao(instancia.getDescricao());
      return forn;
    } else {
      return null;
    }
  }

  @Override
  public Fornecedor Add(Fornecedor instancia) {
    int proxChave = this.dados.getLast().getCodigo() + 1;
    instancia.setCodigo(proxChave);
    this.dados.add(instancia);
    return instancia;
  }

  @Override
  public Fornecedor Delete(int chave) {
    Fornecedor forn = this.Read(chave);
    if (forn != null) {
      this.dados.remove(forn);
      return forn;
    } else {
      return null;
    }
  }

}
