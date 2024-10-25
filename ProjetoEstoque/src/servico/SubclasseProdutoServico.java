package servico;

import dominio.SubclasseProduto;
import repositorio.SubclasseProdutoRepo;

public class SubclasseProdutoServico extends BaseServico<SubclasseProduto> {

  private SubclasseProdutoRepo repo;

  public ClasseProdutoServico(){
    this.repo = new SubclasseProdutoRepo();
  }

  @Override
  public ArrayList<SubclasseProduto> Navegar() {
    return this.repo.Browse();// ReadAll
  }

  @Override
  public SubclasseProduto Ler(int chave) {
    return this.repo.Read(chave);// Read
  }

  @Override
  public SubclasseProduto Editar(SubclasseProduto obj) {
    return this.repo.Edit(obj);// Update
  }

  @Override
  public SubclasseProduto Adicionar(SubclasseProduto obj) {
    return this.repo.Add(obj);// Create
  }

  @Override
  public SubclasseProduto Deletar(int chave) {
    return this.repo.Delete(chave);// Delete
  }

  public void Criar(SubclasseProduto cp) {

  }

}
