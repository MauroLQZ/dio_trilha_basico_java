package excecoes;

/**Suponha que trabalhamos para uma empresa onde temos um programa que valida a idade dos 
 * seus empregados. Para a construção do método de validação de idades, foram passadas 
 * as seguintes regras:
 * 
 * A idade do empregado será considerada válida se ele tiver mais de 18 anos;
 * Empregados com menos de 18 anos devem ser considerados inválidos, pois não são 
 * permitidos trabalhadores menores de idade.
 * Em uma primeira análise, o programador pode se sentir tentado a criar uma exceção para 
 * indicar que um trabalhador é menor de idade. 
 * Código de criação de uma exceção para esse caso.*/
public class VerificaIdadeFuncionario {

	public static void main(String[] args) {
		testeEmployeeAge(28);
	    testeEmployeeAge(16);
	}
	public static void checkEmployeeAge(int age) throws UnderAgeException {
	    if (age > 18) {
	       System.out.println("Employee age: OK! Employee has "+
	                            age+" years old.");
	    }
	     else {
	       throw new UnderAgeException("Employee can't be under age!", age);
	     }
	}
	public static void testeEmployeeAge(int age) {
	     try {
	        checkEmployeeAge(age);
	      }
	      catch (UnderAgeException e) {
	         System.out.print("Exception ocurred! Error message: " + e.getMessage());
	         System.out.println(" Employee age: " + e.getAge());
	       }
	 }
}
