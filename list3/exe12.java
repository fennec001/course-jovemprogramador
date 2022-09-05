import java.util.Scanner;

public class exe12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int citizen = 0;
    double salary = 0;
    int offspring = 0;
    int smolSalary = 0;
    double bigSalary = 0;
    double medSalary = 0;
    int medOffspring = 0;
    while(salary >= 0){
    citizen++;
      System.out.println("Number of offspring");
     offspring += input.nextInt();
   
     System.out.println("Salary");
     salary = input.nextInt();
    
    
    
    if (salary>bigSalary){
      bigSalary = salary;
    }
   if (salary<100){
    smolSalary++;
   
  } if (salary < 0){
    offspring=0;
    salary=-1;
  }
  medSalary +=salary;
    medOffspring +=offspring;
  
  }
  salary++;
System.out.println("Salary medium: "+(medSalary/citizen));
System.out.println("Average number of offspring: "+(medOffspring/citizen));
System.out.println("Biggest salary: "+bigSalary);
System.out.println("Number of poor people: "+smolSalary);
  input.close();
  }
}
