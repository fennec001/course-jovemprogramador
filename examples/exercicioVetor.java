import java.util.Arrays;
import java.util.Scanner;

// inserimos o numero de alunos de uma turma, e a quantia de provas que cada aluno fez.
// recebemos a nota de todos os alunos, a média da turma e a maior nota.
public class exercicioVetor {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    int turma = 0;
    int quantiaNotas = 0;
    float maiorMedia = 0;
    float mediaTurma = 0;
    float media = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Insira o número de alunos: ");
    turma = input.nextInt();
    System.out.println("Insira o numero de notas para cada aluno: ");
    quantiaNotas = input.nextInt();

    float[] notas = new float[turma];
// criamos um for para o numero de alunos, e depois outro for para que cada aluno tenha as suas notas lidas
    for (i = 0; i < turma; i++) {
      for (j = 0; j < quantiaNotas; j++) {
        System.out.println("Insira a " + (1+j) + " nota do "+(1+i)+" aluno" );
        media += input.nextInt();
      }
      media = media / quantiaNotas;
      if (maiorMedia < media) {
        maiorMedia = media;
      }
      notas[i] += media;
      mediaTurma += media;
      media = 0;

    }
    mediaTurma = mediaTurma / notas.length;
    System.out.println("A média de cada aluno é: " + Arrays.toString(notas));
    System.out.println("A maior média é: " + maiorMedia);
    System.out.println("A média dos alunos é: " + mediaTurma);

    input.close();
  }

}
