import java.util.Scanner;
import java.util.Arrays;

public class vetorProf {


   public static void main(String[] args) {


       Scanner leitor = new Scanner(System.in);


       System.out.print("Informe a quantidade de notas: ");
        int quantidadeNotas = leitor.nextInt();


       System.out.println();


       float[] notas = new float[quantidadeNotas];
        float soma = 0;


       for (int i = 0; i < notas.length; i++) {


           System.out.print("Informe a " + (i + 1) + " ° nota: ");
            notas[i] = leitor.nextInt();
            soma += notas[i];
            
            // maneira de dar print em array/vetor ->>> System.out.print(Arrays.toString(notas));

       }


       leitor.close();


       float media = soma / notas.length;
        System.out.println("A média do aluno foi de: " + media);
        
        System.out.print(Arrays.toString(notas));
   }
}