package repositorio;

import dominio.ClasseFornecedor;
import fakedb.ClasseFornecedorFakeDB;

public class ClasseFornecedorRepo extends BaseRepositorio<ClasseFornecedor> {

  private ClasseFornecedorFakeDB db;

  // construtor para buscar os dados
  public ClasseFornecedorRepo() {
    this.db = new ClasseFornecedorFakeDB();
    this.dados = this.db.getTabela();
  }

  @Override
  public ClasseFornecedor Read(int chave) {
    for (ClasseFornecedor cf : dados) {
      if (chave == cf.getCodigo()) {
        return cf;
      }
    }
    return null;
  }

  @Override
  public ClasseFornecedor Edit(ClasseFornecedor instancia) {
    ClasseFornecedor cf = this.Read(instancia.getCodigo());
    if (cf != null) {
      cf.setDescricao(instancia.getDescricao());
      return cf;
    } else {
      return null;
    }
  }

  @Override
  public ClasseFornecedor Add(ClasseFornecedor instancia) {
    int proxChave = this.dados.getLast().getCodigo() + 1;
    instancia.setCodigo(proxChave);
    this.dados.add(instancia);
    return instancia;
  }

  @Override
  public ClasseFornecedor Delete(int chave) {
    ClasseFornecedor cf = this.Read(chave);
    if (cf != null) {
      this.dados.remove(cf);
      return cf;
    } else {
      return null;
    }

  }

}
