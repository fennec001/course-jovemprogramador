import java.util.Scanner;
// Escreva um algoritmo para receber um vetor A de tamanho 20 de contendo números inteiros e ordená-lo em ordem crescente.
public class exe8 {
    public static void main(String[] args) {
        int placeholder = 0;
       
        int [] A = new int[20];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < A.length;i++){
            System.out.println("Insira o "+(i+1)+"° Número");
            A[i] = input.nextInt();
            
        }
    
            
            for(int j = 0;j < A.length;j++){
                
                for(int i = 0; i <A.length;i++){
                    if(A[j] < A[i]){ 
                    placeholder = A[j];
                    A[j] = A[i];
                    A[i] = placeholder;
                    
                }
                }
  
            }

    
    
    System.out.println("Em ordem crescente: ");
    
        for(int i = 0; i <A.length;i++){
        System.out.println(A[i]);
    }
    input.close();
}
} 