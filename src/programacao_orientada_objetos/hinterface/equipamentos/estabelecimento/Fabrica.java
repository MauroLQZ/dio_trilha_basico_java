package programacao_orientada_objetos.hinterface.equipamentos.estabelecimento;

import programacao_orientada_objetos.hinterface.equipamentos.copiadora.Copiadora;
import programacao_orientada_objetos.hinterface.equipamentos.digitalizadora.Digitalizadora;
import programacao_orientada_objetos.hinterface.equipamentos.digitalizadora.Scanner;
import programacao_orientada_objetos.hinterface.equipamentos.impressora.Deskjet;
import programacao_orientada_objetos.hinterface.equipamentos.impressora.Impressora;
import programacao_orientada_objetos.hinterface.equipamentos.impressora.Laserjet;
import programacao_orientada_objetos.hinterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		
	      Impressora impressora = new Deskjet();
		  impressora.imprimir();//IMPRIMINDO DESKJET
		  Impressora impressora2 = new Laserjet();
		  impressora2.imprimir();//IMPRIMINDO LASERJET
		  Impressora impressora3 = new EquipamentoMultifuncional();
		  impressora3.imprimir();//IMPRIMINDO EQUIPAMENTO MUTIFUNCIONAL
		  
		  EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		  Impressora impressora4 = em;
		  Digitalizadora digitalizadora = em;
		  Copiadora copiadora = em;
		  impressora4.imprimir();//IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL
		  digitalizadora.digitalizar();//DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL
		  copiadora.copiar();//COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL
		  
		  Deskjet deskjet = new Deskjet();
		  Impressora impressora5 = deskjet;//OK. Ele é uma impressora.
		  //Digitalizadora digitalizadora2 = deskjet;//ERRO ele nao é uma Digitalizadora.
		  //Copiadora copiadora5 = deskjet;//ERRO Ele nao é uma Copiadora.
		  
		  Scanner scanner = new Scanner();
		  //Impressora impressora6 = scanner;//ERRO. Ele não é uma impressora.
		  Digitalizadora digitalizadora6 = scanner;//OK ele é uma Digitalizadora.
		  //Copiadora copiadora6 = scanner;//ERRO Ele nao é uma Copiadora.
		  
	    }		

}
