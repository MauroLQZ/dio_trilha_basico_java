package dio_trilha_basico_java.poo.hinterface.equipamentos.multifuncional;

import dio_trilha_basico_java.poo.hinterface.equipamentos.copiadora.Copiadora;
import dio_trilha_basico_java.poo.hinterface.equipamentos.digitalizadora.Digitalizadora;
import dio_trilha_basico_java.poo.hinterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MUTIFUNCIONAL");
	}

	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MUTIFUNCIONAL");
	}

	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MUTIFUNCIONAL");
	}

}