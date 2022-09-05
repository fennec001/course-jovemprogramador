import java.util.Scanner;

public class numeroFatorial {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
   
      System.out.println("Insira o numero");
      int n1 = input.nextInt();

      int n2 = 1;
   
 
      for (int i = n1; i>1;i--){
     
       n2 = (n2*i);
    
    
 }
 System.out.println(n2);
input.close();
}
}

