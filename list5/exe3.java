import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // (03) Escreva uma função para receber a idade de uma pessoa expressa em anos, meses e dias e retorne-a expressa apenas em dias (considerar o ano com 365 dias e o mês com 30 dias).  
    System.out.println("Qual a sua idade em anos?");
    int anos = input.nextInt();
    System.out.println("Qual a sua idade em meses?");
    int meses = input.nextInt();
    System.out.println("Qual a sua idade em dias?");
    int dias = input.nextInt();    
    int idade = idd(anos,meses,dias);
System.out.println("A idade apenas em dias é de:"+idade);
    
    }
public static int idd(int anos,int meses,int dias){
 int idd = anos*365;
  idd = idd + (meses*30);
 idd = idd + (dias);
 return idd;
}

}
