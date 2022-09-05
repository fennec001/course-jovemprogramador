import java.util.Scanner;
//Escreva um algoritmo para receber uma matriz A(9,9) de reais e imprimir a soma dos elementos das linhas pares de A.
public class exe19 {
  public static void main(String[] args) {
    float [][] A = new float [6][6];
    float [][] C = new float [6][6];
    Scanner input = new Scanner(System.in);
    int B = 0;
    System.out.println("Insira o valor de B: ");
    B = input.nextInt();
    for (int i = 0;i<A.length;i++){
      for(int j = 0;j<A.length;j++){
        System.out.println("Insira o numero para a posição A["+i+"] ["+j+"]");
     A[i][j] = input.nextFloat(); 
     
    } 
   }
   for (int i = 0;i<A.length;i++){
    for(int j = 0;j<A.length;j++){
     C[i][j] = (A[i][j])* B;

     }
  } 
  for (int i = 0;i<A.length;i++){
    for(int j = 0;j<A.length;j++){
 System.out.println("O valor de A["+i+"] ["+j+"] "+A[i][j]+" vezes "+B+" é de: "+C[i][j]);

}
  
  
    }

input.close();}
}
