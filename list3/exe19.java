import java.util.Scanner;

public class exe19 {
  public static void main(String[] args) {
     int gender = 0;
   int eyeColor = 0;
   int hairColor = 0;
   int age = 0;
   int bigAge = 0;
   int woman1 = 0;
    Scanner input = new Scanner(System.in);
   while(age>=0){  
    
   System.out.println("Insert age");
     age = input.nextInt();
     if(age<0){
      break;
     }
     if (age>bigAge){
       bigAge = age;
     }
   
     System.out.println("Insert Gender");
   System.out.println("Type 0 for male or 1 for female");
     gender = input.nextInt();

     

     System.out.println("Insert your eye color");
     System.out.println("Type 1 for blue, 2 for green, 3 for brown");
     eyeColor = input.nextInt();
    System.out.println("Insert your hair color");
    System.out.println("Type 1 for blonde, 2 for brown, 3 for black");
    hairColor = input.nextInt();
    
  if(age>=18&&age<=35&&gender==1&&eyeColor==2&&hairColor==1){
    woman1++;
  }
   }
 
 
 
 
 
 
 System.out.println("Oldest citizen: "+bigAge);
 System.out.println("Number of women with ages between 18 and 35, green eyes and blond hair: "+woman1);
    input.close();}
  
}
