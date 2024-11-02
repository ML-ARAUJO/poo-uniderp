package servico;

import java.util.ArrayList;

import dominio.SubclasseFornecedor;
import repositorio.SubclasseFornecedorRepo;

public class SubclasseFornecedorServ extends BaseServico<SubclasseFornecedor> {

  private SubclasseFornecedorRepo repo;

  public SubclasseFornecedorServ() {
    this.repo = new SubclasseFornecedorRepo();
  }

  @Override
  public ArrayList<SubclasseFornecedor> Navegar() {
    return this.repo.Browser(); // ReadAll
  }

  @Override
  public SubclasseFornecedor Ler(int chave) {
    return this.repo.Read(chave); // Read
  }

  @Override
  public SubclasseFornecedor Editar(SubclasseFornecedor obj) {
    return this.repo.Edit(obj); // Update
  }

  @Override
  public SubclasseFornecedor Adicionar(SubclasseFornecedor obj) {
    return this.repo.Add(obj); // Create
  }

  @Override
  public SubclasseFornecedor Deletar(int chave) {
    return this.repo.Delete(chave); // Delete
  }

  public void Criar(SubclasseFornecedor scf) {
  }

}
