import java.util.Scanner;

public class numerosPrimos {
	public static void main(String[] args) {

        try(Scanner entrada = new Scanner(System.in)) {
          System.out.println("Informe um numero ");
          int numero = entrada.nextInt();
          int divisores = 0;
          int j;
      
          for( j=1;j<=numero;j++){ 
          
            for(int i=1;i <=j;i++){
           
            if (j % i == 0){
          divisores++;
         }

       
        }
           if (divisores == 2){
            System.out.println("primo: "+j);
             divisores = 0; 
          
            }
        else {
          System.out.println("Nao é primo: "+j);
           divisores = 0;
       
          }

      }
        }     
 }
  }