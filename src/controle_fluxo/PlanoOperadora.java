package controle_fluxo;

/*
 * Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
 * BASIC:100 minutos de ligação
 * MIDIA:100 minutos de ligação + Whats e Instagram grátis.
 * TURBO:100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube*/
public class PlanoOperadora {

	public static void main(String[] args) {
		/*String plano = "M";
	    if(plano == "B")
	    	System.out.println("Plano 100 minutos de ligação");
		else if(plano == "M") {
			System.out.println("Plano 100 minutos de ligação");
	        System.out.println("+ Whats e Instagram grátis");
		}else if(plano == "T") {
			System.out.println("Plano 100 minutos de ligação");
	        System.out.println("+ Whats e Instagram grátis");
	        System.out.println("+ 5Gb Youtube");
	    }else {
			System.out.println("INDEFINIDO");
	    }*/
		String plano = "T";
		switch(plano) {
		case "T":{
			System.out.println("5Gb Youtube");
			//break;
		}
		case "M":{
			System.out.println("Whats e Instagram grátis");
			//break;
		}
		case "B":{
			System.out.println("100 minutos de ligação");
			break;
		}
		default:{
			System.out.println("INDEFINIDO");
			break;
		}
	}
  }
}
	


