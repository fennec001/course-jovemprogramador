import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
     // (04) O custo ao consumidor de um carro novo é a soma do custo de fábrica com o percentual do distribuidor e dos impostos (aplicados ao custo de fábrica). O percentual do distribuidor é de 28% e os impostos de 45%. Escreva uma função para receber o custo de fábrica de um carro e retornar o custo ao consumidor.
   
       Scanner input = new Scanner(System.in);
       System.out.println("insira o custo de fábrica: ");
       int custoFabrica = input.nextInt();

       double custoTotal = custoCarro(custoFabrica);
       System.out.println("O preço total do carro é de: "+custoTotal);

    }
    public static double custoCarro(int custoFabrica){
      double custoDistribuidor = (custoFabrica*0.28);
      double custoImposto = (custoFabrica*0.45);
      double custoTotal = custoFabrica+custoDistribuidor+custoImposto;
      return custoTotal;
    }
}
