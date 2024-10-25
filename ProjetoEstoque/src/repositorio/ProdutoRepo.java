package repositorio;

import dominio.Produto;

import fakedb.ProdutoFakeDB;

public class ProdutoRepo extends BaseRepositorio<Produto> {

  private ProdutoFakeDB db;

  // Contrutor para buscar os dados da lista
  public ProdutoRepo() {
    this.db = new ProdutoFakeDB();
    this.dados = this.db.getTabela();
  }

  @Override
  public Produto Read(int chave) {
    for (Produto prod : dados) {
      if (chave == prod.getCodigo()) {
        return prod;
      }
    }
    return null;
  }

  @Override
  public Produto Edit(Produto instancia) {
    Produto prod = this.Read(instancia.getCodigo());
    if (prod != null) {
      prod.setDescricao(instancia.getDescricao());
      return prod;
    } else {
      return null;
    }
  }

  @Override
  public Produto Add(Produto instancia) {
    int proxChave = this.dados.getLast().getCodigo() + 1;
    instancia.setCodigo(proxChave);
    this.dados.add(instancia);
    return instancia;
  }

  @Override
  public Produto Delete(int chave) {
    Produto prod = this.Read(chave);
    if (prod != null) {
      this.dados.remove(prod);
      return prod;
    } else {
      return null;
    }
  }

}
