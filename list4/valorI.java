import java.util.Scanner;

public class valorI {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Insira o numero");
    double x = input.nextInt();
    
    double y = 0;
    double z = x;
    if(x == 1.0){
      z = x/x;
      System.out.println(z);
    }else { 
    for (double i = 1; i < x; i++) {
      y = (x - i) / (i + 1);
      z =  z - y;
     
    }
    
    System.out.println(z);}


  }
}
