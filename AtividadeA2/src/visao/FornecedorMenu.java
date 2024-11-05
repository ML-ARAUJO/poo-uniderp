package visao;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.Fornecedor;
import servico.FornecedorServ;

public class FornecedorMenu extends BaseMenu {

  // Serviço para gerenciar as operações relacionadas às classes
  private FornecedorServ srv;

  public FornecedorMenu() {
    super();
    this.srv = new FornecedorServ(); // Inicializa o serviço de fornecedor
  }

  // Método auxiliar para imprimir informações
  private void Imprimir(Fornecedor fn) {
    System.out.println("Lista de Fornecedores: ");
    System.out.println("Código Fornecedor: " + fn.getCodigoForn());
    System.out.println("Razão Social: " + fn.getRazaoSocial());
    System.out.println("Nome Fantasia: " + fn.getNomeFantasia());
    System.out.println("CNPJ: " + fn.getCnpj());
    System.out.println("Email: " + fn.getEmail());
    System.out.println("Telefone: " + fn.getTelefone());
    System.out.println("-----------------------------------------");
  }

  // Método para exibir o menu e capturar a opção
  @Override
  public void ExibirMenu() {
    int opcao = 0;
    while (opcao != 9) {
      Util.LimparConsole();
      System.out.println("Cadastro do Fornecedor");
      System.out.println("1 - Listar");
      System.out.println("2 - Localizar");
      System.out.println("3 - Atualizar");
      System.out.println("4 - Adicionar");
      System.out.println("5 - Remover");
      System.out.println("9 - Sair");
      System.out.print("Selecione uma opção: ");
      opcao = this.scanner.nextInt();

      switch (opcao) {
        case 1:
          this.Listar();
          ;
          break;
        case 2:
          this.Localizar();
          break;
        case 3:
          this.Atualizar();
          break;
        case 4:
          this.Adicionar();
          break;
        case 5:
          this.Remover();
          break;
        case 9:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida");
          break;
      }
    }
  }

  // Implementação do método apra toda as classes de fornecedor
  @Override
  public void Listar() {
    Util.LimparConsole();
    System.out.println("Listando...");

    ArrayList<Fornecedor> lista = this.srv.Navegar();
    for (Fornecedor fn : lista) {
      this.Imprimir(fn);
    }
    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  @Override
  public void Localizar() {
    Util.LimparConsole();
    System.out.println("Localizando...");

    System.out.println("Informe o código do Fornecedor: ");
    int cod = this.scanner.nextInt();
    Fornecedor fn = this.srv.Ler(cod);
    if (fn != null) {
      this.Imprimir(fn);
    } else {
      System.out.println("Erro - Fornecedor não encontrado.");
    }

    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  @Override
  public void Adicionar() {
    Util.LimparConsole();

    System.out.println("Adicionando...");

    System.out.println("Informe a descrição: ");
    String descricao = this.scanner.next();
    Fornecedor fn = new Fornecedor();
    fn.setDescricao(descricao);
    fn.setDataDeInclusao(LocalDate.now());
    if (this.srv.Adicionar(fn) != null) {
      System.out.println("Fornecedor adicionado com sucesso");
    } else {
      System.out.println("Erro - Fornecedor não adicionado");
    }
    System.out.println("Clique <ENTER> para continuar");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  @Override
  public void Atualizar() {
    Util.LimparConsole();

    System.out.println("Atualizando...");
    System.out.println("Informe o código do Fornecedor: ");

    int cod = this.scanner.nextInt();

    Fornecedor fn = this.srv.Ler(cod);
    if (fn != null) {
      this.Imprimir(fn);
    } else {
      System.out.println("Erro - Fornecedor não encontrado");
    }

  }

  @Override
  public void Remover() {
    Util.LimparConsole();
    System.out.println("Apagando...");

    System.out.println("Informe o código do Fornecedor: ");
    int cod = this.scanner.nextInt();
    Fornecedor fn = this.srv.Ler(cod);
    if (fn != null) {
      if (this.srv.Deletar(cod) != null) {
        System.out.println("Fornecedor excluido com sucesso.");
      } else {
        System.out.println("Erro - Fornecedor não excluido.");
      }
    } else {
      System.out.println("Erro - Fornecedor não encontrado");
    }

    System.out.println("Clique <ENTER> para continuar...");

  }

}
