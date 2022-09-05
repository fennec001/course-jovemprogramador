import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        System.out.println("Insert number: ");
        int num = input.nextInt();
        for (int i=1;i<=num;i++){
            n = n * i;
        }
 System.out.print(n);
 input.close();
    }
}
