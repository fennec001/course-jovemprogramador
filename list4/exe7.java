import java.util.Scanner;
public class exe7 {
    public static void main(String[] args) {
        // Escreva um algoritmo para receber um vetor A de tamanho 20 contendo números inteiros e imprimir a soma dos seus elementos.
        int soma = 0;
        int [] A = new int[20];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < A.length;i++){
            System.out.println("Insira o "+(i+1)+"° Número");
            A[i] = input.nextInt();
            soma +=A[i];
        }
System.out.println("A soma dos valores de A é de: "+soma);

  input.close();  }
}
