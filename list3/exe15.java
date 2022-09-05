import java.util.Scanner;

public class exe15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  int id = 0;
  double grade1 = 0;
  double grade2 = 0;
  double grade3 = 0;
  double sum = 0;
  
  
    
   while(id>=0){
    System.out.println("Insert ID");
    id = input.nextInt();
    if(id<0){
      break;
    }
    System.out.println("Insert grade 1");
    grade1 = input.nextDouble();
    System.out.println("Insert grade 2");
    grade2 = input.nextDouble();
    System.out.println("Insert grade 3");
    grade3 =input.nextDouble();
   if(grade1>grade2&&grade1>grade3){
    grade1 *=0.4;
    grade2 *=0.3;
    grade3 *=0.3;
   }else if(grade2>grade1&&grade2>grade3){
    grade1 *=0.3;
    grade2 *=0.4;
    grade3 *=0.3;
   }else if(grade3>grade1&&grade3>grade2){
    grade1 *=0.3;
    grade2 *=0.3;
    grade3 *=0.4;
   } else{
    grade1 *=0.4;
    grade3 *=0.3;
    grade2 *=0.3;
   }
 // não fiz exatamente o que a questão pede na demonstração de notas, pois acredito que desta forma a clareza fica maior.
   sum = grade1+grade2+grade3;
System.out.println("ID: "+id);
System.out.println("grade 1: "+grade1);
System.out.println("grade 2: "+grade2);
System.out.println("grade 3: "+grade3);
System.out.println("Sum: "+sum);
if(sum>=5){
  System.out.println("APPROVED");
}else{
  System.out.println("FAILED");
}
  
  }
    input.close();}
}
