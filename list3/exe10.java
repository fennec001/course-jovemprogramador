
public class exe10 {
	public static void main(String[] args) {

      int somaNumeros;
      int quantidadePerfeitos = 0;
      int numero = 1;

   while(quantidadePerfeitos != 5){ 

    somaNumeros = 0;

   for (int i = 1; i < numero; i++){
     
    if ( numero % i == 0) 
        somaNumeros += i;  
}

if (somaNumeros == numero){

    System.out.println("O numero: " + numero + " é perfeito");
    quantidadePerfeitos++;

}

numero++;
   }
}
 }