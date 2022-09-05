import java.util.Scanner;

public class exe16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  int n = 0;
  int start = 0;
  int r = 0;
  int sum = 0;
  int un = 0;
  System.out.println("N: ");
  n = input.nextInt();
  System.out.println("start: ");
  start = input.nextInt();
  System.out.println("R: ");
  r = input.nextInt();
  
  for(int i=0;i<n;i++){
  if(i==0){sum+=start;
    System.out.println(start);
  }else{ 
    start+=r;
   
    System.out.println(start);
    sum+=start;
  } if(i==(n-1)){
   un = start;
  }
  }
  sum = (n*(r+un))/2;
  System.out.println("Reason of AP: "+r);
  System.out.println("Sum: "+sum);
  
  
  input.close();}
}
