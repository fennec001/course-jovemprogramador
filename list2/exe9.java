import java.util.Scanner;

public class exe9 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n Code: ");
		int code = input.nextInt();
        
	   switch (code) {
	   case 100:
	   System.out.print("How many items would you like: ");
	   int quantity = input.nextInt();
	   double value = (quantity * 1.20);
	   System.out.print("The price is: "+value);
	    break;
	   
	   case 101:
		   System.out.print("How many items would you like: ");
		    quantity = input.nextInt();
		    value = (quantity * 1.30);
		   System.out.print("The price is: "+value);
	   break;
	   case 102:
	   
		   System.out.print("How many items would you like: ");
	    quantity = input.nextInt();
	   value = (quantity * 1.50);
	   System.out.print("The price is: "+value);
	   break;
	   case 103:
		   System.out.print("How many items would you like: ");
		   quantity = input.nextInt();
		   value = (quantity * 1.20);
		   System.out.print("The price is: "+value);
		   break;
	   case 104:
		   System.out.print("How many items would you like: ");
		    quantity = input.nextInt();
		    value = (quantity * 1.30);
		   System.out.print("The price is: "+value);
	   break;
	   case 105:
		   System.out.print("How many items would you like: ");
		    quantity = input.nextInt();
		    value = (quantity * 1.00);
		   System.out.print("The price is: "+value);
	    break;
	   
	   }
	   
	   
 	
	 
}
}	
