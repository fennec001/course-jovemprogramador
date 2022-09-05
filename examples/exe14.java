import java.util.Scanner;
// ) Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir a soma dos elementos da linha 5 e da coluna 3.
public class exe14 {
  public static void main(String[] args) {
    int [][] A = new int [5][5];
    int somaLinha = 0;
    int somaColuna = 0;
    Scanner input = new Scanner(System.in);
    for (int i = 0;i<A.length;i++){
      for(int j = 0;j<A.length;j++){
        System.out.println("Insira o numero para a posição ["+i+"] ["+j+"]");
     A[i][j] = input.nextInt(); 
  }
    }
    for(int i = 0;i<A.length;i++){
      somaLinha += A[4][i];
      somaColuna += A[i][2];
    }
    
    System.out.println("A soma dos elementos da linha 5 é de: "+somaLinha);
    System.out.println("A soma dos elementos da coluna 3 é de: "+somaColuna);
  
  input.close();}
}

