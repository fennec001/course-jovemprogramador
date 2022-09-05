import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        //Escreva uma função para receber dois números inteiros e positivos e retornar se o segundo corresponde ao fatorial do primeiro.
     boolean resultado = resultado();
        if(resultado == true){
            System.out.println("O segundo número é fatorial do primeiro");
        }else {
        System.out.println("O segundo numero não é fatorial do primeiro");
        }
    }
public static boolean resultado(){
    boolean resultado = false;
    int fat = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("Insira o primeiro número: ");
    int numero1 = input.nextInt();
    System.out.println("Insira o segundo número: ");
    int numero2 = input.nextInt();
    for(int i = 1; i<=numero1;i++){
        fat *=i;
    }       
if (fat==numero2){
    resultado = true;
}
return resultado;
}

}

