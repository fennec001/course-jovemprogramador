import java.util.Scanner;


public class exe15 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

		System.out.print("\n Pollution level: ");
		double percentage = input.nextDouble();
    
		 if(percentage<0.3){
      System.out.println("Pollution within acceptable levels.");
     }else if(percentage>=0.3&&percentage<0.4){
      System.out.println("companies pertaining to group A are to stop their activities immediately or risk further consequences");
     }else if(percentage>=0.4&&percentage<0.5){
      System.out.println("Companies pertaining to group A&B are to stop their activities immediately or risk further consequences");
     }else if(percentage>=0.5){
      System.out.println("All companies therein affiliated in this program are to stop their activities immediately or risk termination");
     }
input.close();
	}
}
