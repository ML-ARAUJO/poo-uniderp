package visao;

import dominio.ClasseProduto;
import java.time.LocalDate;

public class ClasseProdutoVisao {

  // metodo exibir da Classe produto
  public void Exibir() {
    ClasseProduto cp1 = new ClasseProduto();
    cp1.setCodigo(1);
    cp1.setDescricao("Carnes");
    cp1.setDataDeInclusao(LocalDate.now());

    System.out.println("Classe de Produto:");
    System.out.println("Codigo: " + cp1.getCodigo());
    System.out.println("Descrição: " + cp1.getDescricao());
    System.out.println("Data de Inclusão: " + cp1.getDataDeInclusao);
    
    ClasseProduto cp2 = new ClasseProduto(2,"Bebidas", LocalDate.now());
    System.out.println("Codigo: " + cp2.getCodigo());
    System.out.println("Descrição: " + cp2.getDescricao());
    System.out.println("Data de Inclusão: " + cp2.getDataDeInclusao());

  }

}
