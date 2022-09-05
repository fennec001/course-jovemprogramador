import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        int big = 0;
        int n = 0;
        int smol = 0;
        int sum = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        for (i = 1;i<=10;i++){
                while(i<=10){
                    System.out.println("Insert number");
                        n = input.nextInt();        
                    sum+=n;
                    if(n>big){
                     big = n;
                    } if(n<smol||smol==0){
                        smol = n;
                    }
         break;
        }
       }
System.out.println("Smallest number"+smol);
System.out.println("Biggest number"+big);
System.out.println("Sum"+sum);

}
}
