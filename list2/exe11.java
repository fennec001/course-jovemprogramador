import java.util.Scanner;

public class exe11 {
	public static void main(String[] args) {

		

		Scanner input = new Scanner(System.in);

		System.out.print("\n ID:");
		String id = input.next();

		System.out.print("\n Role:");
		String role = input.next();
		
		System.out.print("\n Salary:");
		double salary = input.nextDouble();
		
		double raise = 0;
		double newSalary = 0;
		switch (id) {
		case "101":
			raise = 0.1;
			newSalary = (salary*raise)+salary;
			System.out.println(id);
			System.out.println(role);
			System.out.println(raise);
			System.out.println(salary);	
			System.out.println(newSalary);
			break;
			case "102":
			raise = 0.2;
			newSalary = (salary*raise)+salary;
			System.out.println(id);
			System.out.println(role);
			System.out.println(raise);
			System.out.println(salary);	
			System.out.println(newSalary);
			break;
			case "103":
			raise = 0.3;
			newSalary = (salary*raise)+salary;
			System.out.println(id);
			System.out.println(role);
			System.out.println(raise);
			System.out.println(salary);	
			System.out.println(newSalary);
			break;
	    default: 
		
			raise = 0.4;
			newSalary = (salary*raise)+salary;
			System.out.println(id);
			System.out.println(role);
			System.out.println(raise);
			System.out.println(salary);	
			System.out.println(newSalary);
			break;
	 
	
	
	
	}
	}
}
