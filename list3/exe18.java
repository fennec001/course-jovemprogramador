import java.util.Scanner;

public class exe18 {
  public static void main(String[] args) {
    int m = 0;
    int fat = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("Insert number");
     m = input.nextInt();
     if(m<0){
      System.out.println("WRONG NUMBER");
     } 
     if(m % 2 == 0){
      for(int i = 1;i<=m;i++){ 
        if (i==1){
          System.out.println("Os divisores de "+m+" Sao: ");
        }
        if(m%i==0){
        System.out.println(i);
       }
      }

     }
    if(m%2!=0&&m<10){
      for(int i=1;i<=m;i++){
      fat *=i;
      }
System.out.println("Fatorial: "+fat);
    }
     
    else if(m %2!=0&&m>=10){{
      for (int i=0;i<=m;i++){
        fat +=i;
      }
      fat--;
    }System.out.println("Soma dos inteiros de 1 até "+m+" : "+fat);
  }
    input.close(); }
}
