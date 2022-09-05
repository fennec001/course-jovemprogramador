import java.util.Scanner;
// Escreva um algoritmo para receber um vetor A de tamanho 10 contendo números inteiros. O algoritmo deve gerar um vetor B e o popular com os números primos do vetor A.

public class exe10 {
  public static void main(String[] args) {
    int A[] = new int[10];
    int tamanhoB = 0;
    int x = 0;
    Scanner input = new Scanner(System.in);
    for(int i = 0;i < A.length;i++){
      System.out.println("Insira o numero");
      A[i] = input.nextInt();
    }
    
    for(int i = 0;i <A.length;i++){
      x = A[i];
      int divisor = 0;
      
      for(int j = 1;j<=x;j++){
        if(x%j == 0){
          divisor++;
        }
      }
    if(divisor == 2){
      tamanhoB++;
    }
    
    }
 
 
    int[]B = new int[tamanhoB];
 tamanhoB = 0;
    for(int i = 0;i <A.length;i++){
 
  x = A[i];
  int divisor = 0;
  
  for(int j = 1;j<=x;j++){
    if(x%j == 0){
      divisor++;
    }
  }
if(divisor == 2){
 B[tamanhoB] = x;
  tamanhoB++;
}

}
    for(int i = 0;i<B.length;i++){
      System.out.println("Estas aberrações são primas: "+B[i] );
    }
input.close();}


}
