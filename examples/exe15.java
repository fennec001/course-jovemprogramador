import java.util.Scanner;
//  Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir o menor elemento da sua diagonal principal.
public class exe15 {
  public static void main(String[] args) {
    int [][] A = new int [5][5];
    Scanner input = new Scanner(System.in);
   int menorNum = -1;
    for (int i = 0;i<A.length;i++){
      for(int j = 0;j<A.length;j++){
        System.out.println("Insira o numero para a posição ["+i+"] ["+j+"]");
     A[i][j] = input.nextInt(); 
 
    }
}
for(int i = 0;i<A.length;i++){
if (A[i][i]<menorNum||menorNum == -1){
  menorNum = A[i][i];
}
}
System.err.println("O menor número da matriz diagonal é: "+menorNum);
input.close();}
}