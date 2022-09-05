import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
    //Uma revendedora de carros usados paga a seus funcionários um salário fixo por mês, mais uma comissão em reais para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escreva uma função para receber o número de carros vendidos por um vendedor, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e retorne o salário final do vendedor.
    System.out.println();
    double salarioTotal = salarioVendedor();
    System.out.println("O salário final do vendedor é de: "+salarioTotal);

    }
    public static double salarioVendedor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o numero de carros vendidos: ");
       int vendaCarros = input.nextInt();
   System.out.println("Insira o valor total de vendas: ");
   double valorVendas = input.nextInt();
   System.out.println("Insira o salário base: ");
  double salarioBase = input.nextInt();
  System.out.println("Insira o valor recebido por carro vendido: ");
  int valorPorVenda = input.nextInt();
  double salarioTotal = salarioBase + (valorVendas * 0.05) + (vendaCarros*valorPorVenda);

       return salarioTotal;
    }
}
