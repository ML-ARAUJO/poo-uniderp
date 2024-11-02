package servico;

import java.util.ArrayList;

import dominio.Fornecedor;
import repositorio.FornecedorRepo;

public class FornecedorServ extends BaseServico<Fornecedor> {

  private FornecedorRepo repo;

  public FornecedorServ() {
    this.repo = new FornecedorRepo();
  }

  @Override
  public ArrayList<Fornecedor> Navegar() {
    return this.repo.Browser(); // ReadAll
  }

  @Override
  public Fornecedor Ler(int chave) {
    return this.repo.Read(chave);// Read
  }

  @Override
  public Fornecedor Editar(Fornecedor obj) {
    return this.repo.Edit(obj);// Update
  }

  @Override
  public Fornecedor Adicionar(Fornecedor obj) {
    return this.repo.Add(obj);// Create
  }

  @Override
  public Fornecedor Deletar(int chave) {
    return this.Deletar(chave);// delete
  }

  public void Criar(Fornecedor fn) {
  }

}
