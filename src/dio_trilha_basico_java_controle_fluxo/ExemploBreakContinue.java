package dio_trilha_basico_java_controle_fluxo;

public class ExemploBreakContinue {

	public static void main(String[] args) {
		for(int num=1;num<=5;num++) {
			  if(num==3)
				  //break;
				  continue;
			 System.out.println(num);
		  }
	}

}
