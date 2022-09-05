import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        
        //Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo nÃºmeros inteiros. Ao final do algoritmo, o vetor B deve conter o fatorial de cada elemento do vetor A. 

        float fator = 1;
        int i = 0;
        int contador = 0;
        float [] num = new float[10];
        float [] fat = new float[10];
        try (Scanner input = new Scanner(System.in)) {
            while(contador < 10){
                System.out.println("Insira um número: ");
                num[contador] = input.nextFloat();
                
                contador++;
            }
   for( i = 0; i < 10; i++){
    float fatorial = num[i];
     for(int j = 1; j <= fatorial;j++){

                 fator *=j;
                
     }
    fat[i] = fator;
    fator = 1;
   }

    for(int k = 0; k < 10; k++){
            System.out.print(num[k]);
            System.out.println(" possui o fatorial de: "+fat[k]+"  ");

    }
   input.close();
        } }
    }
    

