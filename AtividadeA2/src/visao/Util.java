package visao;

public class Util {
  // método estatico p/ limpar o console.
  public static void LimparConsole() {

    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}
