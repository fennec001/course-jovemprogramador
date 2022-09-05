import java.util.Scanner;
// Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir a soma dos seus elementos.
public class exe12 {
  public static void main(String[] args) {
   int soma = 0;
    int [][]A = new int [5][5];
   System.err.println(A.length);
   Scanner input = new Scanner(System.in);
   for(int i = 0; i < A.length;i++){
    
    for(int j = 0;j <A.length;j++){
     System.out.println("Insira o numero para a posição ["+i+"] ["+j+"]");
     A[i][j] = input.nextInt(); 
    soma += A[i][j];
    }
   }
  System.out.println("A soma dos vetores é de: "+soma);
 input.close(); }
}
