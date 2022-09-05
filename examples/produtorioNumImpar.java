import java.util.Scanner;

public class produtorioNumImpar {
    public static void main(String[] args) {
        
    int sum = 1;
    int num = 0;
   Scanner input = new Scanner(System.in);
    
   System.out.println("Insert number: ");
   num = input.nextInt(); 
   while(num != 0){ 
   if (num % 2 != 0){
        sum *= num;
        
    }
    System.out.println("Insert number: ");
   num = input.nextInt(); 
   }System.out.println("Sum of odd numbers: "+sum);    
input.close();    
}
}
