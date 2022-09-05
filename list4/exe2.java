public class exe2 {
 
 //Escreva um algoritmo para criar e popular um vetor com os 10 primeiros nÃºmeros primos.
    public static void main(String[] args) {
      int contador = 0;
      int divisores = 0;  
      float [] numPrimos = new float[10];
      for(int j=1;j<30;j++){ 
        for(int i=1;i <=j;i++){
           
            if (j % i == 0){
          divisores++;
         }

       
        }
           if (divisores == 2){
            numPrimos[contador] = j;
        
             divisores = 0; 
             System.out.println(numPrimos[contador]);
             contador++;
            }
        else {
           divisores = 0;
       
          }
        }
            
       
    }
}
