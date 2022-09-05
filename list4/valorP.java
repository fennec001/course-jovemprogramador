import java.util.Scanner;
public class valorP {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Insira o numero: ");
    int x = input.nextInt();
    long fat = 1;
   int contador = 0;
   int contador1 = 0;
   double p  = 0;
  for(double i = 1; i <=x; i++){
    fat = 1;
    contador++;
    contador1 = contador* 2;
    for(long j = 1; j <= contador1; j++){
      fat *=j;
    }
    if(contador <=1){
      p += fat / contador;
    }
    if(contador % 2 ==0 && contador > 1){ 
    p += fat / contador;
    }else if( contador % 2 != 0 && contador > 1){
      p -= fat / contador;
    }
  }
  System.out.println(p);
  }
}