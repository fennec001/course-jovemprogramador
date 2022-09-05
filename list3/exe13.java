import java.util.Scanner;

public class exe13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int candidate1 = 0;
    int candidate2 = 0;
    int candidate3 = 0;
    int candidate4 = 0;
    int nulo = 0;
    int blank = 0;
    int voto = 1;
    
    while(voto!=0){
    System.out.println("Insert your vote");
    voto = input.nextInt();
    
    switch(voto){
      case 1:
      candidate1++;
      break;
      case 2:
      candidate2++;
      break;
      case 3:
      candidate3++;
      break;
      case 4:
      candidate4++;
      break;
      case 5:
      nulo++;
      break;
      case 6:
      blank++;
      break;
      case 0:
      voto = 0;
      break;
    }
    }  
    System.out.println("candidate 1 votes: "+candidate1);
    System.out.println("candidate 2 votes: "+candidate2);
    System.out.println("candidate 3 votes: "+candidate3);
    System.out.println("candidate 4 votes: "+candidate4);
    System.out.println("null votes: "+nulo);
    System.out.println("blank votes: "+blank);
  
  
  
  
  input.close();}
}
