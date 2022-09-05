import java.util.Scanner;

public class exe3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n First Number: ");
	    int num0 = input.nextInt();
		
		
	   if (num0 >0) {
		   System.out.print("Number is positive");
	   } else {
			   System.out.print("Number is negative");
		   }
	   
	    if ((num0%2)==0) {
	    	System.out.print("Number is even");
	    } else {
	    	System.out.print("Number is odd");
	    }
	}
}
		
