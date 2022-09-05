import java.util.Scanner;

public class teste {
  public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    System.out.print("Insira o Primeiro Numero");
    Float num1 = input.nextFloat();
    System.out.print("Insira o Segundo Numero");
    Float num2 = input.nextFloat();
    System.out.print("Insira o Terceiro Numero");
    Float num3 = input.nextFloat();

    Float media = (num1 + num2 + num3) / 3;
    System.out.println("A média é uwu" + media);

  }
}
