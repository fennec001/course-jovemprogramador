import java.util.Scanner;

public class exe1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n First Number: ");
	    int num1 = input.nextInt();
		
		System.out.print("\n Second Number: ");
		int num2 = input.nextInt();
		
		int mult = num1%num2;
	    int mult1 = num2%num1;	

	    if (mult ==0 && num1>num2) {
	    	System.out.print("Numbers are multiple of themselves");}
	    	else if(mult1 ==0 && num2>num1) {
	    		System.out.print("Numbers are multiple of themselves");
	    	}else {
	    			System.out.print("Numbers are not multiple");
	    		}
	    	
	    }
}
  			
				
	
		
