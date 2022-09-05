import java.util.Scanner;
//Escreva um algoritmo para receber uma matriz A(9,9) de reais e imprimir a soma dos elementos das linhas pares de A.
public class exe18 {
  public static void main(String[] args) {
   float soma = 0;
    float [][] A = new float [9][9];
    Scanner input = new Scanner(System.in);
   
    for (int i = 0;i<A.length;i++){
      for(int j = 0;j<A.length;j++){
        System.out.println("Insira o numero para a posição A["+i+"] ["+j+"]");
     A[i][j] = input.nextFloat(); 
     
    } 
   }
   for (int i = 0;i<A.length;i++){
    for(int j = 0;j<A.length;j++){
     if(i%2 == 0){
      soma += A[i][j];


     }
  } 
 }
  
  System.out.println(soma);
  input.close();  }
}
