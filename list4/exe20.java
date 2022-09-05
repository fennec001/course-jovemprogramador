import java.util.Scanner;
//  Escreva um algoritmo para receber uma matriz A(12,12). O algoritmo deve somar cada linha de A e armazenar em um vetor B.

public class exe20 {
  public static void main(String[] args) {
    float[][] A = new float[12][12];
    float[] B = new float[12];
    float soma = 0;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        System.out.println("Insira o numero para a posição A[" + i + "] [" + j + "]");
        A[i][j] = input.nextFloat();

      }
    }
    for (int i = 0; i < A.length; i++) {
      soma = 0;
      for (int j = 0; j < A.length; j++) {
        soma += A[i][j];
      }
      B[i] = soma;

    }

    for (int i = 0; i < B.length; i++) {
      System.out.println("A soma da linha " + i + "é de: " + B[i]);
    }

  input.close();}
}
