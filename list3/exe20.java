import java.util.Scanner;

public class exe20 {
  public static void main(String[] args) {
   int n = 0;
   float s = 0; 
    Scanner input = new Scanner(System.in);
   System.out.println("Insert number: ");
   n = input.nextInt();
  for(int i = 1;i<=n;i++){
  s+= ((double)1/i);
  
  
    System.out.println("S += 1/"+i);
  }
  System.out.println("Final value: "+s);

 
 
 
 
    input.close();}
}
