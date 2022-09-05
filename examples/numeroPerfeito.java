import java.util.Scanner;

public class numeroPerfeito {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
   
      System.out.println("Insira o numero");
      int n1 = input.nextInt();

      int somaNumeros = 0;
      int resultado = 0;
 
      for (int i = 1; i < n1; i++){
     
       somaNumeros = (n1%i);

    if (somaNumeros == 0) {
        resultado +=i;

    }

}

if (resultado == n1){
    System.out.println("O numero é perfeito");
}
else {
    System.out.println("O numero não é perfeito");
}
input.close();
 }
  }