package visao;

import java.util.Scanner;

import dominio.Fornecedor;

public abstract class BaseMenu<TDominio> {

  protected Scanner scanner;

  public BaseMenu() {
    this.scanner = new Scanner(System.in);// Inicializa o Scanner para ler do console
  }

  // Métodos abstratos que devem ser implementados pelas subclasses
  public abstract void ExibirMenu();

  protected abstract void Listar();

  protected abstract void Localizar();

  protected abstract void Adicionar();

  protected abstract void Atualizar();

  protected abstract void Remover();

  protected abstract void Imprimir();

}
