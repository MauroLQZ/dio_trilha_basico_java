package dio_trilha_basico_java.depurar;

import java.util.Scanner;

/**
 * Exemplo de debugging da classe CalculadoraDeMedias:
 * Para debugar agente coloca um breakpoint nos pontos q/podem dar problemas.
 * Depois,p/rodar o codigo no modo debug clicar executar no modo debug.*/
public class CalculadoraDeMedias {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

//colocar o breakpoint aqui:
        double media = calculaMediaDaTurma(alunos, scan);
    	//int media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
		//System.out.printf("Média da turma %d ",media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
