import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
    //(02) Escreva uma função para receber 3 notas de um aluno e retornar a sua média final (média ponderada; o peso das notas é: 2, 3 e 5, respectivamente). 
        Scanner input = new Scanner(System.in);   
    System.out.println("Insira a primeira nota: ");
    double nota1 = input.nextDouble();
    System.out.println("Insira a segunda nota: ");
    double nota2 = input.nextDouble();
    System.out.println("Insira a terceira nota: ");
    double nota3 = input.nextDouble();
    double resultado = media(nota1,nota2,nota3);
    System.out.println("A media é: "+resultado);

    }
public static double media(double nota1,double nota2,double nota3){
 double media = (nota1*0.2)+(nota2*0.3)+(nota3*0.5);
 return media;
}
}
// perguntar a respeito de duvida aqui, ordem que os numeros recebem