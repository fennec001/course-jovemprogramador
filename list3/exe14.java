import java.util.Scanner;

public class exe14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  int citizen = 0;
    int age = 1;
    int gender=0;
  int salary = 0;
  int medSalary = 0;
  int poorWoman = 0;
  int bigAge = 1;
  int smallAge = 1;
  
  while(age>=0){
    System.out.println("Insert age");
      age = input.nextInt();
    if(smallAge==1){
      smallAge=age;
    }
    if(age<0){
      break;
    }
      System.out.println("What is your gender?");
    System.out.println("Type 0 for female, 1 for male");
    gender = input.nextInt();
    System.out.println("Insert salary: ");
    salary = input.nextInt();
    citizen++;
    
   medSalary+=salary;
   if (age>bigAge){
    bigAge = age;
   } 
   if (age<smallAge){
    smallAge = age;
   }
    if(gender==0&&salary<=100){
      poorWoman++;
    }
    
    }
   System.out.println("Salary medium: "+(medSalary/citizen));
   System.out.println("Oldest citizen: "+bigAge);
   System.out.println("Youngest citizen: "+smallAge);
   System.out.println("Number of poor women: "+poorWoman);
   
   
   
   
    input.close(); }
  
  
  
 }
