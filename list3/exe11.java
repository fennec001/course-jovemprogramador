import java.util.Scanner;

public class exe11 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int somaNumeros;
      int quantidadePerfeitos = 4;
    System.out.println("insert number");
      int numero = input.nextInt();

   while(quantidadePerfeitos != 5){ 
    numero++;
    somaNumeros = 0;
  int teste = 0;

   for (int i = 1; i < numero; i++){
     
    if ( numero % i == 0) 
        somaNumeros += i;  
}

if (somaNumeros == numero){

    System.out.println("O proximo numero perfeito é "+numero);
    quantidadePerfeitos++;

}


   }
   input.close();
  }
}
