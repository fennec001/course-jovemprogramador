import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        //  Escreva uma função para receber um um valor N inteiro e positivo e retornar o valor de E:  

	//E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!
    double E = valorE();
   System.out.println("O valor é de:" +E);    

}
 public static double valorE(){
    Scanner input = new Scanner(System.in);
    double valorNum = 1;
    double fat = 1;
    System.out.println("Insira o valor de N");
    int num = input.nextInt();
    for( double i = 1;i <= num; i++){
       for(double j = 1; j <=i;j++){
       fat *=j;
       } 
     valorNum += 1 / fat;
    fat = 1;
    }
return valorNum; 
}

}
