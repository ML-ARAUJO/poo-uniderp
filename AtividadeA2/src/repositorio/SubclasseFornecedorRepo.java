package repositorio;

import dominio.SubclasseFornecedor;
import fakedb.SubclasseFornecedorFakeDB;

public class SubclasseFornecedorRepo extends BaseRepositorio<SubclasseFornecedor> {

  private SubclasseFornecedorFakeDB db;

  public SubclasseFornecedorRepo() {
    this.db = new SubclasseFornecedorFakeDB();
    this.dados = this.db.getTabela();
  }

  @Override
  public SubclasseFornecedor Read(int chave) {
    for (SubclasseFornecedor scf : dados) {
      if (chave == scf.getCodigo()) {
        return scf;
      }
    }
    return null;
  }

  @Override
  public SubclasseFornecedor Edit(SubclasseFornecedor instancia) {
    SubclasseFornecedor scf = this.Read(instancia.getCodigo());
    if (scf != null) {
      scf.setDescricao(instancia.getDescricao());
      return scf;
    } else {
      return null;
    }
  }

  @Override
  public SubclasseFornecedor Add(SubclasseFornecedor instancia) {
    int proxChave = this.dados.getLast().getCodigo() + 1;
    instancia.setCodigo(proxChave);
    this.dados.add(instancia);
    return instancia;
  }

  @Override
  public SubclasseFornecedor Delete(int chave) {
    SubclasseFornecedor scf = this.Read(chave);
    if (scf != null) {
      this.dados.remove(scf);
      return scf;
    } else {
      return null;
    }
  }

}
