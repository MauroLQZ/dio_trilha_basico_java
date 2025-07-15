package fluxo_condicionais_candidatura;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Foi solicitado que nosso sistema garanta que diante das inúmeras candidaturas sejam 
 * selecionados apenas no máximo 5 candidatos para entrevista onde o salário pretendido seja 
 * menor ou igual ao sálario base. */
public class ProcessoSeletivo {
    static String[] contratado = new String[5];
    static Double[] salario = new Double[5];
    static int contContratados = 0;
    
	public static void main(String[] args) {
		System.out.println("Processo Seletivo!");  
		/*analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);*/
		selecaoCandidatos();
		System.out.println("------------------------------------------------------------------");
		imprimirContratados();
		//imprimirSelecionados();	
	  }
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento:");
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº "+(indice+1)+" é o "+candidatos[indice]);
		}
		for(String candidato: candidatos) {
			System.out.println("O candidato "+candidato+", foi selecionado!");
		}
	}
	/*//System.out.printf("Nota do aluno %s: ", aluno);
        System.out.printf("Média da turma %.1f", media); */
	static void imprimirContratados() {
		System.out.println("Seleção dos Contratados: ");
		for(int n=0; n < contratado.length; n++) {
			System.out.printf("Nome: %s",contratado[n]);
			System.out.printf(" - Salario: %.2f",salario[n]);
			System.out.println();
		}
	}
	static void analisarCandidato(double salarioPretendido) {
	    double salarioBase = 2000.0;//-o- (BreakPoint AQUI...)
		if(salarioBase > salarioPretendido) {
		    System.out.println ("LIGAR PARA O CANDIDATO");  
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");  
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");  
		}
     }
	 static void selecaoCandidatos() {
	    //Array com a lista de candidatos 
	    String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO",
	    		  "MIRELA","DANIELA","JORGE"};
	      
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;   
		double salarioBase = 2100.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
			String candidato = candidatos[candidatosAtual];
	        double salarioPretendido = valorPretendido();	
	        System.out.printf(" %s",candidato);
	        System.out.printf(", solicitou este vlr de salario: %.1f"
					  ,salarioPretendido);
	        System.out.println();
			 
		if(salarioBase >= salarioPretendido) { 
		    System.out.println("O candidato "+candidato+", foi selecionado para a vaga!");
				 candidatosSelecionados++;
			contratado[contContratados] = candidato;
			salario[contContratados] = salarioPretendido; 
			contContratados++;
		}
			candidatosAtual++;
		}
	   }
	   //Metodo que simula o valor pretendido
	   static double valorPretendido() {
	       return ThreadLocalRandom.current().nextDouble(1800, 2200);	
	   }
}
