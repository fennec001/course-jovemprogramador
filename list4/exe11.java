import java.util.Scanner;
//Escreva um algoritmo para receber um vetor A de tamanho 15 contendo números inteiros e imprimir o maior valor do vetor.

public class exe11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int maiorNum = 0;
    int x = 0;
    int[] A = new int[5];
  for(int i = 0;i<A.length;i++){
    System.out.println("Insira um número: ");
    A[i] = input.nextInt();
  }
  for(int i = 0;i<A.length;i++){
   x = A[i];
   if(maiorNum<x){
    maiorNum = x;
   }
  }
System.out.println("O maior numero é: "+maiorNum);

input.close();
  }
}
