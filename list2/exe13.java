import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("\n How many dollars: ");
    int money = input.nextInt();
    
    System.out.println("Value in cash: "+money);
    System.out.println("Value in 100 dollar bills: "+(money/100));
    System.out.println("Value in 50 dollar bills: "+((money%100)/50));
    System.out.println("Value in 10 dollar bills:  "+(((money%100)%50))/10);
    System.out.println("Value in 2 dollar bills:  "+(((money%100)%50)%10)/2);
    System.out.println("Value in 1 dollar bills:  "+(((money%100)%50)%10)%2);


}
		
} 
