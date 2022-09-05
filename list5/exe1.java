import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
     // (01) Escreva uma função para receber as dimensões de um retângulo (base e altura) e retornar a sua área.   
    Scanner input = new Scanner(System.in);
    System.out.println("Insira a base");
    int valor1 = input.nextInt();
    System.out.println("Insira a area");
    int valor2 = input.nextInt();
    int area = area(valor1,valor2);
    System.out.println(area);

    }
    
    public static int area(int valor1, int valor2){
        int area = 0;
        area = valor1*valor2;
        return area;
    }

}
