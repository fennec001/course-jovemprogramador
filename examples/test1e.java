import java.util.ArrayList;
import java.util.Scanner;

public class test1e {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
     int bigNum = 0;
    int smallNum = 1;
       for(int i = 0; i<10;i++)
       
       {System.out.println("insert number");  
        int x = input.nextInt();
        cars.add(x);
      if(cars.get(i)>bigNum){
        bigNum=cars.get(i);
      } 
      if(cars.get(i)<smallNum){
        smallNum=cars.get(i);
      } 
    }



System.out.println(cars.size());
        System.out.println(bigNum);
       System.out.println(cars);
  System.out.println(smallNum);
       input.close();  }
}
