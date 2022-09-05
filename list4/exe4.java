import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        // Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
        // números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo
        // a união de A e B

        // código está confuso pois eu confundio o enunciado, achei que era pra fazer a união de vetores igual é feita união de conjuntos. A questão 9 possui o cópdigo da união de forma mais limpa
        
      
       int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[(A.length+B.length)];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println("Insira o " + (i + 1) + "° número do vetor A");
            A[i] = input.nextInt();

        }
        for (int i = 0; i < B.length; i++) {
           System.out.println("Insira o " + (i + 1) + "° número do vetor B");
            B[i] = input.nextInt();

   
 }


   for(int i = 0;i <A.length;i++){
      for(int j = 0; j <C.length;j++){
         if(A[i] == C[j]){
            
         }else {
            C[i] = A[i];
         }
      }
   }
   for(int i = (B.length-1);i >=0;i--){
      for(int j = 0; j <C.length;j++){
         if(B[i] == C[j]){
           
         }else {
            C[(i+A.length)] = B[i];
         }
      }
   }
for(int i =0;i<C.length;i++){
   System.out.println(C[i]);
}
input.close();}

}
