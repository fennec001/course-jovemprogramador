import java.util.Scanner;

public class exe9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Insert number");
    int num = input.nextInt();
    int i = 0;
    double fat = 1;
    double e = 1;
    int j = 0;
     for(i=1;i<=num;i++){ 
    for(j=1;j<=i;j++){
    fat*=j;
    }
System.out.println(fat);
 e += 1/fat;
fat = 1;
  }
  System.out.println(e);
  input.close();}
}
