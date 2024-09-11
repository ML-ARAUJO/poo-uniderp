package servico;

import java.util.ArrayList;

import dominio.ClasseProduto;
import repositorio.ClasseProdutoRepo;

public class ClasseProdutoServico extends BaseServico<ClasseProduto> {

  private ClasseProdutoRepo repo;

  public ClasseProdutoServico() {
    this.repo = new ClasseProdutoRepo();
  }

  @Override
  public ArrayList<ClasseProduto> Navegar() {
    return this.repo.Browse();
  }

  @Override
  public ClasseProduto Ler(int chave) {
    return this.repo.Read(chave);
  }

  @Override
  public ClasseProduto Editar(ClasseProduto obj) {
    return this.repo.Edit(obj);
  }

  @Override
  public ClasseProduto Adicionar(ClasseProduto obj) {
    return this.repo.Add(obj);
  }

  @Override
  public ClasseProduto Deletar(int chave) {
    return this.repo.Delete(chave);
  }

}
