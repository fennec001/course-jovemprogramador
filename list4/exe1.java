public class exe1 {
    public static void main(String[] args) {
        //Escreva um algoritmo para criar e popular um vetor com os 100 primeiros nÃºmeros pares.
    int contador = 0;
    float [] numPares = new float[100];
    
    for(int i=1;i<200;i++){
        if (i%2 == 0){
            numPares[contador] = i;
            contador++;
        }
    }
for (int i=0;i<numPares.length;i++){
    System.out.println(numPares[i]);
}   
}
    
}
