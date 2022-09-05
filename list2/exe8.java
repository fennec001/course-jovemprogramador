import java.util.Scanner;

public class exe8 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n Code: ");
		int code = input.nextInt();
		System.out.print("\n Grade: ");
		double grade0 = input.nextDouble();
		System.out.print("\n Second Grade: ");
		double grade1 = input.nextDouble();
		System.out.print("\n Third Grade: ");
		double grade2 = input.nextDouble();
	    double finalGrade = 0;
	 	
	 if(grade0>grade1&&grade0>grade2){
	 finalGrade = (grade0*0.4)+(grade1*0.3)+(grade2*0.3);
	} else if(grade1>grade0&&grade1>grade2) {
	 
		finalGrade =(grade0*0.3)+(grade1*0.4)+(grade2*0.3);
	} else if (grade2>grade0&&grade2>grade1) {
		
		
		 finalGrade =(grade0*0.3)+(grade1*0.3)+(grade2*0.4);
	} else {
		
		 finalGrade =(grade0*0.3)+(grade1*0.4)+(grade2*0.3);
	}
	 
	if(finalGrade>7) {
		System.out.println(code);
		System.out.println(finalGrade);
		System.out.println("Student has passed");
	} else {
		System.out.println(code);
		System.out.println(finalGrade);
		System.out.println("Student has failed");
	}
	 
	 
	
	 
}
}	
