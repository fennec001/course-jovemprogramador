import java.util.Scanner;

public class exe4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n Game began at: ");
	    int initialHour = input.nextInt();
		
	    System.out.print("\n Game ended at: ");
	    int finalHour = input.nextInt();
	    
	    int hourDiff = ((24 - initialHour)+finalHour);
	    
	    int hourDiff1 = finalHour - initialHour;
	    
	    if (finalHour > initialHour) {
	    	System.out.print("The game lasted this many hours: "+hourDiff1);
	    }
	    else if(initialHour >finalHour) {
	 System.out.print("The game lasted this many hours:"+hourDiff);   	
	    } else {
	    	System.out.print("The game lasted 24 hours");
	    }
	}
}
