import java.util.Scanner;

public class exe17 {
  public static void main(String[] args) {
    int [][] A = new int [2][2];
    int [][] B = new int [2][2];
    int [][] C = new int [2][2];
    Scanner input = new Scanner(System.in);
    int somaTotal = 0;
    for (int i = 0;i<A.length;i++){
      for(int j = 0;j<A.length;j++){
        System.out.println("Insira o numero para a posição A["+i+"] ["+j+"]");
     A[i][j] = input.nextInt(); 
     System.out.println("Insira o numero para a posição B["+i+"] ["+j+"]");
     B[i][j] = input.nextInt();
 
    } 
   }
  
   for (int i = 0;i<A.length;i++){
    for(int j = 0;j<A.length;j++){
   
      C[i][j]= (A[i][j]) + (B[i][j]);
   

  } 
 }
 for (int i = 0;i<A.length;i++){
  for(int j = 0;j<A.length;j++){
    
    System.out.println("A soma é A["+i+"] ["+j+"] ("+A[i][j]+") + B["+i+"] ["+j+"] ("+B[i][j]+") igual a: "+C[i][j]);
    somaTotal += C[i][j];

} 
}
System.out.println("A soma total das matrizes é de: "+somaTotal);  
  
 input.close(); }
}
