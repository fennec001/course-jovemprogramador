import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
 // Escreva um algoritmo para receber um vetor A de tamanho 15 contendo números inteiros e imprimir a quantidade de valores pares.
        Scanner input = new Scanner(System.in);
     int [] A = new int [15];
     int pares = 0;
     for(int i = 0; i <A.length;i++){
        System.out.println("insira o "+(i+1)+"° número: ");
        A[i] = input.nextInt();
     }
    for(int i = 0; i<A.length;i++){
        if(A[i] % 2 == 0){
            pares++;
            System.out.println("O número "+A[i]+" da posição "+(i+1)+"° do vetor é par");
        }
    }
System.out.println("O número de pares é: "+pares);
   input.close(); }
}
