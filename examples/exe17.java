import java.util.Scanner;

public class exe17 {
  public static void main(String[] args) {
    int [][] A = new int [4][4];
    int [][] B = new int [4][4];
    int [][] C = new int [4][4];
    Scanner input = new Scanner(System.in);
    
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
    

} 
}

 input.close(); }
}
  