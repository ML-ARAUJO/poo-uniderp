package visao;

import dominio.Fornecedor;
import servico.FornecedorServ;

public class FornecedorMenu extends BaseMenu {

  private FornecedorServ srv;

  public FornecedorMenu() {
    super();
    this.srv = new FornecedorServ();
  }

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

  private void ImprimirPorLinha(Fornecedor fn) {
    String msg = "";
    msg += "Lista de Fornecedores: ";
    msg += "Código Fornecedor: " + fn.getCodigoForn() + " | ";
    msg += "Razão Social: " + fn.getRazaoSocial() + " | ";
    msg += "Nome Fantasia: " + fn.getNomeFantasia() + " | ";
    msg += "CNPJ: " + fn.getCnpj() + " | ";
    msg += "Email: " + fn.getEmail() + " | ";
    msg += "Telefone: " + fn.getTelefone();
    System.out.println("-----------------------------------------");
    System.out.println(msg);
  }

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
      System.out.println("Selecione uma opção: ");
      opcao = this.scanner.nextInt();
    }
  }

  @Override
  public void Listar() {

  }

  @Override
  public void Localizar() {

  }

  @Override
  public void Adicionar() {

  }

  @Override
  public void Atualizar() {

  }

  @Override
  public void Remover() {

  }

}
