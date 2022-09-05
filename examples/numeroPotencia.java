import java.util.Scanner;

public class numeroPotencia {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
   
      System.out.println("Insira o primeiro numero");
      int n1 = input.nextInt();

      System.out.println("Insira o segundo numero");
      int n2 = input.nextInt();
   
      int n3= 1;
   
        for (int i = 0; i<n2;i++){
     
      n3 =+ n1*n3;

    System.out.println(n3);
 }
 input.close();

}


	
}

