package programacao_orientada_objetos.hinterface.equipamentos.multifuncional;

import programacao_orientada_objetos.hinterface.equipamentos.copiadora.Copiadora;
import programacao_orientada_objetos.hinterface.equipamentos.digitalizadora.Digitalizadora;
import programacao_orientada_objetos.hinterface.equipamentos.impressora.Impressora;

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