
public class exe8 {
	public static void main(String[] args) {
        int prod = 1;
         int i = 0;
          int numero = 92;
          int divisores = 0;
          while(numero<=107){
            numero++;
          
            for(i=1;i <=numero;i++){
           
            if (numero % i == 0){
          divisores++;
         }

       
        }
           if (divisores == 2){
            System.out.println("primo: "+numero);
             divisores = 0; 
             prod *=numero;
            }
        else {
           divisores = 0;
       
          }
        }
     System.out.println("O produto dos numeros e: "+prod); 
      }
        }     
 
