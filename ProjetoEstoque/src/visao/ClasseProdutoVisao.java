package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoVisao {

  // metodo exibir da Classe produto
  public void Exibir() {

    ClasseProdutoFakeDB fakedb = new ClasseProdutoFakeDB();
    ArrayList<ClasseProduto> tab = fakedb.getTabela();

    for (ClasseProduto cp : tab) {
      this.Imprimir(cp);
    }
  }

  private void Imprimir(ClasseProduto alvo) {
    System.out.println("Classe de Produtos");
    System.out.println("Codigo: " + alvo.getCodigo());
    System.out.println("Descrição: " + alvo.getDescricao());
    System.out.println("Data de Inclusão: " + alvo.getDataDeInclusao());
    System.out.println();
  }
}