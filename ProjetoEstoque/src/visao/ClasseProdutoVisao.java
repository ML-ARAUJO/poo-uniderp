package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;
import repositorio.ClasseProdutoRepo;

public class ClasseProdutoVisao {

  // metodo exibir da Classe produto

  public void Exibir() {
    ClasseProdutoRepo repo = new ClasseProdutoRepo();

    ArrayList<ClasseProduto> lista = repo.Browse(); // se for CRUD em vez de repo.Browser > repo.getTabela();
    for (ClasseProduto cp : lista) {
      this.Imprimir(cp);

    }
  }

  private void Imprimir(ClasseProduto alvo) {
    System.out.println("Classe de Produtos");
    System.out.println("Codigo: " + alvo.getCodigo());
    System.out.println("Descrição: " + alvo.getDescricao());
    System.out.println("Data de Inclusão: " + alvo.getDataDeInclusao());
    System.out.println("---------------------------------------------");
  }
}