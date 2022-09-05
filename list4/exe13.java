import java.util.Scanner;
//Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir a soma do elementos da diagonal principal.

public class exe13 {
  public static void main(String[] args) {
    int soma = 0;
    int[][]A = new int[5][5];
    Scanner input = new Scanner(System.in);
    for (int i = 0;i<A.length;i++){
      for(int j = 0;j<A.length;j++){
        System.out.println("Insira o numero para a posição ["+i+"] ["+j+"]");
     A[i][j] = input.nextInt(); 
      
    }
    }
  for(int i = 0;i<A.length;i++){
    
    System.out.println("Para obter a soma da matriz diagonal, fazemos: A["+i+"] + ["+i+"]");
    soma += A[i][i];
  }
System.out.println(soma);
  input.close();}

}
