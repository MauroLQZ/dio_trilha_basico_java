package exercicios;

public class Pet {
	//Ñ altera o nome do pet quando ele for criado
		private final String name;
		//informar se o pet esta limpo ou nao.
		private boolean clean;

		public Pet(String name) {
			this.name = name;
			this.clean = false;
		}

		public String getName() {
			return name;
		}

		public boolean isClean() {
			return clean;
		}
	    /**A logica a var clean for true o pet esta limpo*/
		public void setClean(boolean clean) {
			this.clean = clean;
		}

	
}
