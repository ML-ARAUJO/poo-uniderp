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
    return this.repo.Browser(); // ReadAll - Listar
  }

  @Override
  public ClasseFornecedor Ler(int chave) {
    return this.repo.Read(chave); // Read - Localizar
  }

  @Override
  public ClasseFornecedor Editar(ClasseFornecedor obj) {
    return this.repo.Edit(obj); // Update - Atualizar
  }

  @Override
  public ClasseFornecedor Adicionar(ClasseFornecedor obj) {
    return this.repo.Add(obj); // Create - Adicionar
  }

  @Override
  public ClasseFornecedor Deletar(int chave) {
    return this.repo.Delete(chave); // delete - Remover
  }

  public void Criar(ClasseFornecedor cf) {
  }
}
