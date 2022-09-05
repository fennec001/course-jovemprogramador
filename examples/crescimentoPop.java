import java.util.Scanner;

public class crescimentoPop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int years = 0;
    
        System.out.println("A's population");
     float popA = input.nextFloat();
     System.out.println("A's yearly growth");
     float growthA = input.nextFloat();

     System.out.println("B's population");
     float popB = input.nextFloat();
     System.out.println("B's yearly growth");
     float growthB = input.nextFloat();
    
        while(popA<=popB){
        popA = ((growthA/100)*popA)+popA;
        popB = ((growthB/100)*popB)+popB;  
        years++;    
    }
  if (popA>popB){
    System.out.println("A's population: "+popA);
    System.out.println("B's population: "+popB);
    System.out.println("It took "+years+" years for A's population to be bigger than B's");
  }
     
input.close();
}    
    }

