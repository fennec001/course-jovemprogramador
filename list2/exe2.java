import java.util.Scanner;

public class exe2	 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n First Number: ");
	    int num0 = input.nextInt();
		
		System.out.print("\n Second Number: ");
		int num1 = input.nextInt();
		
		System.out.print("\n Third Number");
		int num2 = input.nextInt();
		
	   if (num0 > num1 && num0 > num2) {
		   System.out.print("The highest number is"+num0);
	   } else if
	   (num1 > num0 && num1 > num2){
		   System.out.println("The highest number is"+num1);
	   }
	   else if(num2 > num0 && num2 > num1) {
		   System.out.println("The highest number is"+num2);
	   }
	   else {
		   System.out.print("Numbers are equal");
	   }
	    
	    
	    
	    
	}
}
		
