import java.util.Scanner;

public class exe6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n First Number: ");
	    int num0 = input.nextInt();
		
	    System.out.print("\n Second Number: ");
	    int num1 = input.nextInt();
	    System.out.print("\n Third Number: ");
	    int num2 = input.nextInt();
    
	     
	  
	    if(num0==num1&&num0==num2) {
	    	System.out.print("Triangulo equilatero");
	    }
	    else if(num0==num1&&num0!=num2) {
	    	System.out.print("Triangulo isosceles");
	    }
	    else if(num0!=num2 && num0!=num1) {
	    	System.out.print("Triangulo escaleno");
	    } else {
	    	System.out.print("Nao formam um triangulo");
	    }
	}
}
		
