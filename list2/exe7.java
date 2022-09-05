import java.util.Scanner;

public class exe7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n age: ");
	    int age = input.nextInt();
		if(age<5) {
			System.out.print("Baby");
		}
	    else if(age>=5&&age<=7) {
    	  System.out.print("Infant");
      }
      else if(age>=8&&age<=10) {
    	  System.out.print("Child");
      }else if(age>=11&&age<=13) {
    	  System.out.print("early teens");
    	  
      }else if(age>=14&&age<=17) {
    	  System.out.print("Late teens");
      }
      else {
    	  System.out.print("Adult");
      }
	}
}
		
