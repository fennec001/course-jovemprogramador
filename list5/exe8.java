import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
     // Escreva uma função para receber um número inteiro e positivo e retornar qual o próximo número perfeito a partir dele.
    int resultado = numeroPerfeito();
    System.out.println("O próximo numero perfeito é: "+resultado);

    }
   // sempre dividir em duas subrotians quando necessario
   
   
    public static int numeroPerfeito(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = input.nextInt();
        int contador = 0;
        int numPerfeito = 0;
        while (contador == 0){ 
            num++;
            numPerfeito = 0;
            for(int i = 1; i <num;i++){
                if (num % i == 0){
                    numPerfeito +=i;
                }
    
            }
            if (numPerfeito == num){
    contador++;
            }
            
}
return numPerfeito;
}

 }