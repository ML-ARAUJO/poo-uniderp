package visao;

import java.time.LocalDate;
import java.util.ArrayList;
import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {

  // metodo exibir da Classe produto
  private ClasseProdutoServico srv;

  public ClasseProdutoVisao() {
    this.srv = new ClasseProdutoServico();
  }

  public void Exibir() {
    ArrayList<ClasseProduto> lista = this.srv.Navegar();
    for (ClasseProduto cp : lista) {
      this.Imprimir(cp);
    }

  }

  private void Imprimir(ClasseProduto alvo) {
    System.out.println("Produtos");
    System.out.println("Código da Classe: " + alvo.getCodigo());
    System.out.println("Descrição: " + alvo.getDescricao());
    System.out.println("Data de Inclusão: " + alvo.getDataDeInclusao());
    System.out.println("---------------------------------------------");
  }

  public void Criar() {
    ClasseProduto novo = new ClasseProduto(0, "Teste", LocalDate.now());
    this.srv.Adicionar(novo);
    this.Imprimir(novo);
  }

}