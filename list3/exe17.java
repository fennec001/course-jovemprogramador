import java.util.Scanner;

public class exe17 {
  public static void main(String[] args) {
  int mult = 0;
    Scanner input = new Scanner(System.in);
   System.out.println("Insert number");
   int num = input.nextInt();

   for(int i=1;i<=num;i++){
  mult = i*num;
  System.out.println(i+" x "+num+" = " +mult);

   }





 input.close(); }
}
