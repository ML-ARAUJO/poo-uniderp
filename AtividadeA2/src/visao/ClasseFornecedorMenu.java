package visao;

import java.util.ArrayList;
import java.time.LocalDate;
import dominio.ClasseFornecedor;
import servico.ClasseFornecedorServ;

public class ClasseFornecedorMenu extends BaseMenu {

  // Serviço para gerenciar as operações relacionadas às classes
  private ClasseFornecedorServ srv;

  public ClasseFornecedorMenu() {
    super();
    this.srv = new ClasseFornecedorServ(); // Inicializa o serviço de fornecedor
  }

  // Método auxiliar para imprimir informações
  private void ImprimirPorLinha(ClasseFornecedor cf) {
    String mensagem = "";
    mensagem += "Classe de Produto: ";
    mensagem += "Código: " + cf.getCodigo() + " | ";
    mensagem += "Endereço: " + cf.getEndereco() + " | ";
    mensagem += "Data de Inclusão: " + cf.getDataDeInclusao() + " | ";
    mensagem += "Descrição: " + cf.getDescricao();
    System.out.println(mensagem);

  }

  // Método para exibir o menu e capturar a opção
  @Override
  public void ExibirMenu() {
    int opcao = 0;

    while (opcao != 9) {
      Util.LimparConsole();
      System.out.println("CADASTRO DE CLASSES DE FORNECEDORES(MENU)");
      System.out.println("1 - Listar");
      System.out.println("2 - Localizar");
      System.out.println("3 - Adicionar");
      System.out.println("4 - Atualizar");
      System.out.println("5 - Remover");
      System.out.println("9 - Sair");
      System.out.print("Selecione uma opção: ");
      opcao = this.scanner.nextInt();

      switch (opcao) {
        case 1:
          this.Listar();
          break;
        case 2:
          this.Localizar();
          break;
        case 3:
          this.Adicionar();
          break;
        case 4:
          this.Atualizar();
          break;
        case 5:
          this.Remover();
          break;
        case 9:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção Inválida");
          break;
      }
    }
  }

  // Implementação do método apra toda as classes de Classefornecedor
  @Override
  public void Listar() {
    Util.LimparConsole();
    System.out.println("Listando...");

    ArrayList<ClasseFornecedor> lista = this.srv.Navegar();
    for (ClasseFornecedor cf : lista) {
      this.ImprimirPorLinha(cf);
    }

    System.out.println("Clique <ENTER> para continuar. ");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  @Override
  public void Localizar() {
    Util.LimparConsole();
    System.out.println("Localizando...");

    System.out.print("Informe o código da Classe de Produto: ");
    int cod = this.scanner.nextInt();

    ClasseFornecedor cf = this.srv.Ler(cod);
    if (cf != null) {
      this.ImprimirPorLinha(cf);
    } else {
      System.out.println("Problema - Classe de Fornecedor não encontrado");
    }

    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  @Override
  public void Adicionar() {
    Util.LimparConsole();
    System.out.println("Adicionando...");

    System.out.print("Informe a Descrição: ");
    String descricao = this.scanner.next();
    ClasseFornecedor cf = new ClasseFornecedor();
    cf.setDescricao(descricao);
    cf.setDataDeInclusao(LocalDate.now());
    if (this.srv.Adicionar(cf) != null) {
      System.out.println("Classe de Fornencedor adicionado com sucesso");
    } else {
      System.out.println("Problema - Erro ao adicionar classe de Fornecedor");
    }

    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();

  }

  @Override
  public void Atualizar() {
    Util.LimparConsole();
    System.out.println("Atualizando...");
    System.out.print("Informe o código da Classe de Produto: ");
    int cod = this.scanner.nextInt();

    ClasseFornecedor cf = this.srv.Ler(cod);
    if (cf != null) {
      System.out.print("Informe a nova Descrição: ");
      String descricao = this.scanner.next();
      cf.setDescricao(descricao);
      if (this.srv.Editar(cf) != null) {
        System.out.println("Alteração realizada com sucesso");
      } else {
        System.out.println("Problema - alteração não foi realizada");
      }
    } else {
      System.out.println("Problema - Classe de Fornecedor não encontrada");
    }

    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  @Override
  public void Remover() {
    Util.LimparConsole();
    System.out.println("Removendo...");

    System.out.print("Informe o código da Classe de Produto: ");
    int cod = this.scanner.nextInt();
    ClasseFornecedor cf = this.srv.Ler(cod);
    if (cf != null) {
      if (this.srv.Deletar(cod) != null) {
        System.out.println("Classe de Fornecedor excluida com sucesso");
      } else {
        System.out.println("Problema - Classe de Produto não foi excluida");
      }
    } else {
      System.out.println("Problema - Classe de Produto não encontrada");
    }

    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();

  }
}
