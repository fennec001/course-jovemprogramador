import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
      // Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo a união de A e B em ordem decrescente.
     int [] A = new int[5];
     int [] B = new int[5];
     int [] C = new int[A.length+B.length];
      int placeholder = 0;
     Scanner input = new Scanner(System.in);
     
     for(int i = 0;i<A.length;i++){
        System.out.println("Insira o "+(i+1)+"° valor no vetor A" );
        A[i] = input.nextInt();
     }
     for(int i =0;i<B.length;i++){
        System.out.println("Insira o "+(i+1)+"° valor no vetor B" );
        B[i] = input.nextInt();
     }
    for(int i = 0;i<A.length;i++){
      C[i] = A[i];
    }
     for(int i = 0;i<B.length;i++){
      C[i+A.length] = B[i];
     }
       
for(int i = 0; i <C.length;i++){
   for(int j=0;j<C.length;j++){
      placeholder = C[i];
      if(C[i]<C[j]){
         placeholder = C[j];
         C[j] = C[i];
         C[i] = placeholder;
      }
   }
}



for(int i = 0;i<C.length;i++){
   System.out.println(C[i]);
}
    input.close();}
}
