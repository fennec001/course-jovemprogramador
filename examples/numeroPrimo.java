import java.util.Scanner;

public class numeroPrimo {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
   
      System.out.println("Insira o numero");
      int n1 = input.nextInt();
        
      int somaNumeros = 0;
      int resultado = 0;
    
      for (int i = 1; i < n1; i++){
     System.out.print(somaNumeros);
       somaNumeros = (n1%i);
       
    if (somaNumeros == 0) {
        resultado++;

    }

}

if (resultado == 1){
    System.out.println("O numero é primo");
}
else {
    System.out.println("O numero não é primo");
}
input.close();
 }
  }