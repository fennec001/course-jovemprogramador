import java.util.Scanner;

public class StarWars {
  public static void main(String[] args) {
    //nome ;
    // 3 primeiras letras sobrenome
    // 2 primeiras letras sobrenome
    // sobrenome:
    // duas primeiras letras do sobrenome da sua mae
    // tres primeiras letras cidade onde você nasceu

    Scanner input = new Scanner(System.in);
     System.out.println("Insira o seu nome");
     String nome1 = input.nextLine();
     char[] char1 =  new char[3];
     for(int i = 0; i < 3;i++){
      char1[i] = nome1.charAt(i);

     }
     System.out.println("Insira o seu sobrenome: ");
     String nome2 = input.nextLine();
     char[] char2 = new char[2];
     for(int i = 0; i <2;i++){
      char2[i] = nome2.charAt(i);
     }
     System.out.println("Insira o nome de solteira da sua mãe: ");
     String nome3 = input.nextLine();
     char[] char3 = new char[2];
     for(int i = 0; i <2;i++){
      char3[i] = nome3.charAt(i);
     }
     System.out.println("Insira a cidade onde você nasceu: ");
     String nome4 = input.nextLine();
     char[] char4 = new char[3];
     for(int i = 0; i <3;i++){
      char4[i] = nome4.charAt(i);
     }
 System.out.println("Seu nome de star wars é: ");
     for(int i=0;i<3;i++){
      System.out.print(char1[i]);
     }
     for(int i=0;i<2;i++){
      System.out.print(char2[i]);
     }
     for(int i=0;i<2;i++){
      System.out.print(char3[i]);
     }
     System.out.println(" M");
     for(int i=0;i<3;i++){
      System.out.print(char4[i]);
     }
  }
}
