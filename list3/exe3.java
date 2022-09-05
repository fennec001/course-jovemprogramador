import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
      
           
             int sum = 1;
            int num = 0;
           Scanner input = new Scanner(System.in);
            
           System.out.println("Insert number: ");
           num = input.nextInt(); 
           while(num != 0){ 
           if (num % 2 == 0&&num>0){
                sum *= num;
                
            }
            System.out.println("Insert number: ");
           num = input.nextInt(); 
           }System.out.println("product of even numbers: "+sum);    
        input.close();    
            }
        }
