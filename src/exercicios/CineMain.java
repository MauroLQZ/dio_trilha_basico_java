package exercicios;

import java.util.Scanner;

public class CineMain {
	public static CineIngresso cine = new CineIngresso(200.0);
	public static CineFamilia cineFamilia = null;
	public static CineEstudante cineEstudante = null;
	public static Scanner scan = new Scanner(System.in);
    public static String nomeFilme = "";
    public static double valorIngresso = 0;
    public static int qtdeFamilia = 0;
    public static boolean dublado = false;
    public static int tipoLegenda = 0;
    public static int tipoClasse = 0;
    
	public static void main(String[] args) {
		System.out.println("informe o nome do filme:");
	    nomeFilme = scan.nextLine();
	    cine.setNomeFilme(nomeFilme);
	    	    
	    System.out.println("informe:1- Legendado / 2- Dublado:");
	    tipoLegenda = scan.nextInt();
	    if(tipoLegenda == 1) 
	    	cine.setLegendado(true);
	    if(tipoLegenda == 2 )
	    	cine.setDublado(true);

	    System.out.println("Ingresso:1- Estudante / 2- Familia:");
	    tipoClasse = scan.nextInt();
	    
	    switch(tipoClasse) {
	    case 1:
	    	cineEstudante = new CineEstudante();
	    	double valorI = cineEstudante.valorIngresso(cine);
	    	System.out.println("Valor do ingresso: "+valorI);
	    	System.out.println("Filme: "+cineEstudante.getNomeFilme());
	    	if(cineEstudante.getDublado())
	    		System.out.println("Filme Dublado! ");
	    	if(cineEstudante.getLegendado())
	    		System.out.println("Filme Legendado! ");
	    	
	    	break;
	    case 2:
	    	System.out.println("Quantas pessoas tem na familia?");
	    	int numPessoas = scan.nextInt();
	    	cineFamilia = new CineFamilia(numPessoas);
	    	
	    	double valorF = cineFamilia.valorIngresso(cine);
	    	System.out.println("Valor do ingresso: "+valorF);
	    	System.out.println("Filme: "+cineFamilia.getNomeFilme());
	    	if(cineFamilia.getDublado())
	    		System.out.println("Filme Dublado! ");
	    	if(cineFamilia.getLegendado())
	    		System.out.println("Filme Legendado! ");
	    	
	    }
	}

}
