import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su nombre:");
    String name = scanner.nextLine();

    System.out.println("Bienvenido, " + name + "!");
  }
}
