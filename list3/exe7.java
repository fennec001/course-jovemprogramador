import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        System.out.print("Insert Number");
        int num0 = input.nextInt();
        System.out.print("Insert Number");
        int num1 = input.nextInt();
        for (int i=1;i<=num0;i++){
            n = n * i;
        }
        if (num1 == n){
            System.out.print(num1+" É fatorial de "+num0);
         } else {
            System.out.print(num1+"Não é fatorial de "+num0);
         }input.close();}
}
