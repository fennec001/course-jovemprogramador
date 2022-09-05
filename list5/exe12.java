import java.util.Scanner;

public class exe12 {
  public static void main(String[] args) {
    int resultado = alocarMatriz();
    System.out.println(resultado);
  }
//public static int somaMatriz(int matrizB[][]){ 
//int soma = 0;
//for(int i = 0;i<=matrizB.length;i++){
  //for(int j = 0;j<=matrizB.length;j++){
    //soma+=matrizB[i][j];
//  }
//}
//return 5;
//}

public static int alocarMatriz(){
  Scanner input = new Scanner(System.in);
  int[][] matrizB =  new int[2][2];
  for(int i = 0;i<matrizB.length;i++){
    for(int j = 0;j<matrizB.length;j++){
      System.out.println("Insira o numero");
      matrizB[i][j] = input.nextInt();
    }
  } 
  int soma = 0;
  for(int i = 0;i<matrizB.length;i++){
    for(int j = 0;j<matrizB.length;j++){
      soma+=matrizB[i][j];
    }
  }
  return soma;
}

}
