package visao;

import java.util.Scanner;

public abstract class BaseMenu {

  protected Scanner scanner;

  public BaseMenu() {
    this.scanner = new Scanner(System.in);// Inicializa o Scanner para ler do console
  }

  // Métodos abstratos que devem ser implementados pelas subclasses
  public abstract void ExibirMenu();

  public abstract void Listar();

  public abstract void Localizar();

  public abstract void Adicionar();

  public abstract void Atualizar();

  public abstract void Remover();

}
