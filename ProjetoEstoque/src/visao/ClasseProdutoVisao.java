package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {

  // metodo exibir da Classe produto

  public void Exibir() {
    // ProdutoFakeDB prod = new ProdutoFakeDB();
    // ArrayList<Produto> lista = prod.getTabela(); // se for CRUD em vez de
    // repo.Browser > repo.getTabela();
    ClasseProdutoServico srv = new ClasseProdutoServico();
    ArrayList<ClasseProduto> lista = srv.Navegar();
    for (ClasseProduto cp : lista) {
      this.Imprimir(cp);

    }

  }

  private void Imprimir(ClasseProduto alvo) {
    System.out.println("Produtos");
    System.out.println("Código da Classe: " + alvo.getCodigo());
    System.out.println("Descrição: " + alvo.getDescricao());
    System.out.println("Data de Inclusão: " + alvo.getDataDeInclusao());
    // System.out.println("Código do produto: " + alvo.getCodigoSubClasse());
    // System.out.println("Preço: " + alvo.getValor());
    System.out.println("---------------------------------------------");
  }
}