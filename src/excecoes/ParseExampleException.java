package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**Formato de data inválido:
- Ocorrendo quando uma string de data não segue o padrão esperado pelo DateFormat 
(por exemplo, ao tentar analisar "2023/10/27" com um analisador configurado para 
"dd-MM-yyyy"). 
- Formato de número inválido:
- Ocorre ao analisar uma string que não é um número válido (por exemplo, "abc" para um inteiro). 
- Formato de endereço inválido:
- Pode ocorrer ao analisar um endereço de rede, se a string não seguir o padrão esperado
- é uma exceção verificada, ela deve ser tratada explicitamente usando blocos try-catch ou 
  lançada usando a cláusula throws.*/
public class ParseExampleException {

	public static void main(String[] args) {
		String dataString = "2023/10/27";
		// Formato inválido para a string
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy"); 

        try {
            Date data = formato.parse(dataString);
            System.out.println("Data analisada: " + data);
        } catch (ParseException e) {
        	// Lidar com o erro, por exemplo, exibir uma mensagem de erro para o usuário
        	System.err.println("Erro ao analisar a data: " + e.getMessage());          
        }

        String dataStringValida = "27-10-2023";
        try {
            Date dataValida = formato.parse(dataStringValida);
            System.out.println("Data válida analisada: " + dataValida);
        } catch (ParseException e) {
            System.err.println("Erro ao analisar a data: " + e.getMessage());
        }
	}
}
