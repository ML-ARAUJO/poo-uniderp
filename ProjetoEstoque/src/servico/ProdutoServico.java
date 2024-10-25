package servico;

import dominio.Produto;
import repositorio.ProdutoRepo;

public class ProdutoServico extends BaseServico<Produto> {

  private ProdutoRepo repo;

  public ProdutoServico() {
    this.repo = new ProdutoRepo();
  }

  @Override
  public ArrayList<Produto> Navegar() {
    return this.repo.Browse();// ReadAll
  }

  @Override
  public Produto Ler(int chave) {
    return this.repo.Read(chave);// Read
  }

  @Override
  public Produto Editar(Produto obj) {
    return this.repo.Edit(obj);// Update
  }

  @Override
  public Produto Adicionar(Produto obj) {
    return this.repo.Add(obj);// Create
  }

  @Override
  public Produto Deletar(int chave) {
    return this.repo.Delete(chave);// Delete
  }

  public void Criar(Produto cp) {

  }

}
