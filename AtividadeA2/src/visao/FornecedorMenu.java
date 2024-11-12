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
    System.out.println("Fornecedores: ");
    System.out.println("Id Fornecedor: " + fn.getId());
    System.out.println("Endereço: " + fn.getEndereco());
    System.out.println("Descrição(Bairro): " + fn.getDescricao());
    System.out.println("Código Fornecedor: " + fn.getCodigo());
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

  // ///////////////////////////////////////////////////////////////////////
  @Override
  public void Listar() {
    Util.LimparConsole();

    ArrayList<Fornecedor> lista = this.srv.Navegar();
    for (Fornecedor fn : lista) {
      System.out.println("Listando...");
      this.Imprimir(fn);
    }
    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  ///////////////////////////////////////////////////////////////////////////
  @Override
  public void Localizar() {
    Util.LimparConsole();

    System.out.print("Informe o código do Fornecedor: ");
    int cod = this.scanner.nextInt();
    Fornecedor fn = this.srv.Ler(cod);
    if (fn != null) {
      System.out.println("Localizando...");
      this.Imprimir(fn);
    } else {
      System.out.println("Erro - Fornecedor não encontrado.");
    }

    System.out.println("Clique <ENTER> para continuar...");
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

  ///////////////////////////////////////////////////////////////////////////
  // foi implementado para adicionar todos requisitos do cadastro do fornecedor
  @Override
  public void Adicionar() {
    Util.LimparConsole();

    System.out.println("Adicionando...");
    this.scanner.nextLine();

    System.out.print("Informe o Endereço: ");
    String endereco = this.scanner.nextLine();

    System.out.print("Informe a Descrição(Regiao): ");
    String descricao = this.scanner.nextLine();

    System.out.print("Informe a Razão Social: ");
    String razaoSocial = this.scanner.nextLine();

    System.out.print("Informe o Nome Fantasia: ");
    String nomeFantasia = this.scanner.nextLine();

    System.out.print("Informe o CNPJ: ");
    String cnpj = this.scanner.nextLine();

    System.out.print("Informe o Telefone: ");
    String telefone = this.scanner.nextLine();

    System.out.print("Informe o E-mail: ");
    String email = this.scanner.nextLine();

    // Criação do objeto Fornecedor e configuração dos atributos
    Fornecedor fn = new Fornecedor();

    fn.setEndereco(endereco);
    fn.setDescricao(descricao);
    fn.setRazaoSocial(razaoSocial);
    fn.setNomeFantasia(nomeFantasia);
    fn.setCnpj(cnpj);
    fn.setEmail(email);
    fn.setTelefone(telefone);
    fn.setDataDeInclusao(LocalDate.now());

    // Verifica se a adição foi bem-sucedida
    if (this.srv.Adicionar(fn) != null) {
      System.out.println("Fornecedor adicionado com sucesso");
    } else {
      System.out.println("Erro - Fornecedor não adicionado");
    }

    System.out.println("Clique <ENTER> para continuar");
    this.scanner.nextLine(); // Espera a confirmação do usuário
  }

  //////////////////////////////////////////////////////////////////////////
  // Foi implementado para atualizar dados que podem sofrer alteração
  @Override
  public void Atualizar() {
    Util.LimparConsole();
    System.out.println("Atualizando...");

    System.out.print("Informe o código do Fornecedor: ");
    int cod = this.scanner.nextInt();
    this.scanner.nextLine(); // Consumir a nova linha

    Fornecedor fn = this.srv.Ler(cod);
    if (fn != null) {
      boolean continuar = true;
      while (continuar) {
        Util.LimparConsole();
        System.out.println("Escolha o que deseja atualizar:");
        System.out.println("1 - Endereço");
        System.out.println("2 - Descrição (Bairro)");
        System.out.println("3 - Telefone");
        System.out.println("4 - Email");
        System.out.println("0 - Sair");
        System.out.print("Selecione uma opção: ");
        int opcao = this.scanner.nextInt();
        this.scanner.nextLine(); // Consumir a nova linha

        switch (opcao) {
          case 1:
            System.out.print("Informe o novo Endereço: ");
            String endereco = this.scanner.nextLine();
            fn.setEndereco(endereco);
            break;
          case 2:
            System.out.print("Informe a nova Descrição: ");
            String descricao = this.scanner.nextLine();
            fn.setDescricao(descricao);
            break;
          case 3:
            System.out.print("Informe o novo Telefone: ");
            String telefone = this.scanner.nextLine();
            fn.setTelefone(telefone);
            break;
          case 4:
            System.out.print("Informe o novo Email: ");
            String email = this.scanner.nextLine();
            fn.setEmail(email);
            break;
          case 0:
            continuar = false;
            break;
          default:
            System.out.println("Opção inválida");
            break;
        }

        if (continuar) {
          if (this.srv.Editar(fn) != null) {
            System.out.println("Alteração realizada com sucesso.");
          } else {
            System.out.println("Erro - Alteração não foi realizada.");
          }

          System.out.println("Clique <ENTER> para continuar...");
          this.scanner.nextLine();
        }
      }
    } else {
      System.out.println("Erro - Fornecedor não encontrado");
      System.out.println("Clique <ENTER> para continuar...");
      this.scanner.nextLine();
    }
  }

  ///////////////////////////////////////////////////////////////////////////
  @Override
  public void Remover() {
    Util.LimparConsole();
    System.out.println("Apagando...");

    System.out.print("Informe o código do Fornecedor: ");
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
    this.scanner.nextLine();
    this.scanner.nextLine();
  }

}
