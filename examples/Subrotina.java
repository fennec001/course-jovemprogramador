import java.util.Scanner;

public class Subrotina {
    public static void main(String[] args) {
    //chamar a subrotina (call) ou invokar (invoke?)
    
    boolean resultado = primo(5);    
    
    System.out.println(resultado);
    }           
     
                public static int somar(int valor01, int valor02){
                    int resultado = valor01+valor02;             
                        return resultado;

                    }

                    public static int multiplicar(int valor01, int valor02){
                        int resultado = valor01*valor02;             
                            return resultado;
            }
       
                    public static int fat(int valor01){
                        int valor02 = 1;
                        for(int i = 1; i <= valor01; i++){
                            valor02 *=i;
                        } 
                    return valor02;
                    }
       
  
                public static boolean primo(int valor01){
                    String primo1;
                    int divisores = 0;
                    boolean resultado = false;
                   for(int i = 1; i <=valor01;i++){
                    if(valor01%i == 0){
                        divisores++;
                    }
                    if (divisores == 2){
                        resultado = true;
                    }else{ 
                        resultado = false;
                     }
                   } 
                   if(resultado == true){
                     primo1 = "O número "+valor01+" é primo.";
                   }
                   return resultado;
                }
  
                }
                

//subrotina é um comando de desvio de fluxo, sempre que invocamos uam subrotina estamos desviando o fluxo do nosso programa
/*começamos int resultado recebe somar >isto é a subrotina
*passamos o somar com os 2 valores
*o valor01 e 02 tiveram o tipo definido, os 2 como inteiros. Logo,não podemos passar double ou String. Quando a subrotina é criada, são especificadas os parametros (variaveis) que é o tipo e o nome
*quando invocamos a subrotina estamos passando o valor 
*valor 1 e 2 sao os parametros()
*quando passamos o 2 e o 3, são dois valores que sao chamados de argumentos. 
*Quais são os parametros da subrotina? VALOR1 e VALOR2
*os argumentos são (2,3), e isto pode ser o valor literal, ou uma variavel, como x, algum que recebe o valor de um Scanner.class
*
*valor é na hora de definir, argumento é na hora de invocar.
*
*argumento é quando invocamos um parametro.
*
*parametro é na hora da criação da subrotina  e argumento é na hora de invocar (chamar)
quando ele encontra a rotina, ele faz o desvio para localizar a linha somar, pulando para esta parte do codigo. Ele confere os parametros e aplica para eles os argumentos
temos a variavel resultado que vai guardar valor1+valor2. executando esta soma, é alocado o resultado para o valor e este chamamos pelo método return
o return "devolve" para a linha o qual foi chamado. e quando passamos um valor para o return(pode ser uma variavel),esta volta junto pelo metodo return. 
no nosto caso, volta da linha 17 diretamente para a linha 12. 

--> Parâmetro é a variável que irá receber um valor em uma função (ou método) enquanto que um argumento é o valor (que pode originar de uma variável ou expressão) que você passa para a função (ou método).


*/ 

/*parametro seria a definição de limitação de entrada e argumento seria a entrada em si para função
 * 
 * 
 * 
 * 
 * 
 * 3 questões teóricas

5 questões práticas

1 tema único envolvendo algum conceito matemático visto

ou 5 questões fatoriais... ou 5 primos... ou 5 perfeitos... algo nesse esquema

(media aritmética, ponderada)

perguntar pq o get o set são separados

5 funções de subrotina será a prova

não sera soma




public static int somar(int valor)

PROVA SERA CRIAÇÃO DE SUBROTINA

PROCEDE:

public static < sempre

tipo de retorno

nome

abre e fecha parenteses,dentre os quais possuimos os PARAMETROS. Cada parametro é uma variavel com o tipo e o nome, e são separados por virgula.
 */