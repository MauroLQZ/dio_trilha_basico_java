package dio_trilha_basico_java_controle_fluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeExcecao {

	public static void main(String[] args) {
		try {
		   Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
		   System.out.println("Digite seu Nome:");
		   String nome = scanner.next();
		   System.out.println("Digite seu sobre SobreNome:");
		   String sobreNome = scanner.next();
		   System.out.println("Digite sua idade:");
		   int idade = scanner.nextInt();
		   System.out.println("Digite sua altura:");
		   double altura = scanner.nextDouble();
		   //Imprimindo os dados obtidos pelo usuario
		   System.out.println("Ola, me chamo "+nome.toUpperCase()+" "+sobreNome.toUpperCase());
		   System.out.println("Tenho "+idade+" anos");
		   System.out.println("Minha altura é "+altura+" cm ");
           scanner.close();
		} catch(InputMismatchException e){
     		  System.out.println("Os campos idade e algura precisam ser numéricos!");
     	}
	}
}
