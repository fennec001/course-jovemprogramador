import java.util.Scanner;

public class exe5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n First Number: ");
	    int num0 = input.nextInt();
		
	    System.out.print("\n Second Number: ");
	    int num1 = input.nextInt();
	    System.out.print("\n Third Number: ");
	    int num2 = input.nextInt();
    
	     
	    
	    if(num0 > (num1+num2)) {
	    	System.out.print("Numbers form a triangle");
	    } else {
	    	System.out.print("Numbers don't form a triangle");
	    }
	    
	}
}
		
