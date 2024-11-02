package servico;

import java.util.ArrayList;

import dominio.ClasseFornecedor;
import repositorio.ClasseFornecedorRepo;

public class ClasseFornecedorServ extends BaseServico<ClasseFornecedor> {

  private ClasseFornecedorRepo repo;

  public ClasseFornecedorServ() {
    this.repo = new ClasseFornecedorRepo();
  }

  @Override
  public ArrayList<ClasseFornecedor> Navegar() {
    return this.repo.Browser(); // ReadAll
  }

  @Override
  public ClasseFornecedor Ler(int chave) {
    return this.repo.Read(chave); // Read
  }

  @Override
  public ClasseFornecedor Editar(ClasseFornecedor obj) {
    return this.repo.Edit(obj); // Update
  }

  @Override
  public ClasseFornecedor Adicionar(ClasseFornecedor obj) {
    return this.repo.Add(obj); // Create
  }

  @Override
  public ClasseFornecedor Deletar(int chave) {
    return this.repo.Delete(chave); // delete
  }

  public void Criar(ClasseFornecedor cf) {
  }
}
