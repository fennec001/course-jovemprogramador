import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("\n Identification number: ");
		int id = input.nextInt();
    System.out.print("\n First grade: ");
		double grade0 = input.nextDouble();
    System.out.print("\n Second grade: ");
		double grade1 = input.nextDouble();
    System.out.print("\n Third grade: ");
		double grade2 = input.nextDouble();
    System.out.print("\n Exercises: ");
 		double grade3 = input.nextDouble();
    double ma = (grade0+(grade1*2)+(grade2*3)+grade3)/7;
    System.out.println(id);
      System.out.println("First grade: "+grade0);
      System.out.println("Second grade: "+grade1);
      System.out.println("Third grade: "+grade2);
      System.out.println("Sum of exercises: "+grade3);
      System.out.println("MA: "+ma);
    if(ma>=9){ 
      System.out.println("Overall result: A");
      System.out.println("PASSED");
    }  else if(ma>=7.5&&ma<9){
      System.out.println("Overall result: B");
      System.out.println("PASSED");
    } else if (ma>=6&&ma<7.5){
      System.out.println("Overall result: C");
      System.out.println("PASSED");
    }else if(ma>=4&&ma<=6){
      System.out.println("Overall result: D");
      System.out.println("FAILED");
    } else if(ma<4.0){
      System.out.println("Overall result: E");
      System.out.println("FAILED");
    }
	}
}
