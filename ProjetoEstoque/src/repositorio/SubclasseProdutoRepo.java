package repositorio;

import dominio.SubclasseProduto;
import fakedb.SubclasseProdutoFakeDB;

public class SubclasseProdutoRepo extends BaseRepositorio<SubclasseProduto> {

  private SubclasseProdutoFakeDB db;

  // Contrutor para buscar os dados da lista
  public SubclasseProdutoRepo() {
    this.db = new SubclasseProdutoFakeDB();
    this.dados = this.db.getTabela();
  }

  @Override
  public SubclasseProduto Read(int chave) {
    for (SubclasseProduto scp : dados) {
      if (chave == scp.getCodigo()) {
        return scp;
      }
    }
    return null;
  }

  @Override
  public SubclasseProduto Edit(SubclasseProduto instancia) {
    SubclasseProduto scp = this.Read(instancia.getCodigo());
    if (scp != null) {
      scp.setDescricao(instancia.getDescricao());
      return scp;
    } else {
      return null;
    }
  }

  @Override
  public SubclasseProduto Add(SubclasseProduto instancia) {
    int proxChave = this.dados.getLast().getCodigo() + 1;
    instancia.setCodigo(proxChave);
    this.dados.add(instancia);
    return instancia;
  }

  @Override
  public SubclasseProduto Delete(int chave) {
    SubclasseProduto scp = this.Read(chave);
    if (scp != null) {
      this.dados.remove(scp);
      return scp;
    } else {
      return null;
    }
  }

}
