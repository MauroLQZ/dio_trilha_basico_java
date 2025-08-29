package heranca_polimorfismo;

import heranca_polimorfismo.domain.Employee;
import heranca_polimorfismo.domain.Manager;
import heranca_polimorfismo.domain.Salesman;

public class Main {

	public static void main(String[] args) {
		// Employee employee = new Employee();
		// Employee manager = new Manager();
		// manager.getLogin();//ERRO
		// manager.getPassword();//ERRO
		// Salesman salesman = new Salesman();//Nao pode converter p/Manager
		// Employee salesman = new Salesman();//Nao pode converter p/Manager
		// Employee manager = new Manager();//Ñ pode ser usado como Manager,é tipo
		// Employee
		// Employee employee = new Employee();
		// System.out.println("TESTANDO: "+(employee instanceof Manager
		// manager));//TESTANDO: false
		// System.out.println("Verificando Classe:
		// "+employee.getClass().getCanonicalName());
		// Verificando Classe: heranca_polimorfismo.Employee
		// if(employee instanceof Manager manager) {
		// Após vc utiliza a variavel no codigo direto sem cast.
		// System.out.println(employee.getClass().getCanonicalName());
		// System.out.println(employee.getClass().getCanonicalName());
		// }
		// Employee employee = new Manager();
		// Manager employee = new Manager();
		// employee.setLogin("DAVID");
		// employee.setPassword("123456");
		// employee.setComission(10);
		// System.out.println(employee.getLogin());
		// System.out.println(employee.getPassword());
		// System.out.println(employee.getComission());
		// printEmployee(employee);
		printEmployee(new Manager());
		printEmployee(new Salesman());
	}

	public static void printEmployee(Employee employee) {

		//employee.code = "";
		// USANDO IF:
		// System.out.println("employee.getClass(): "+employee.getClass());
		// if (employee instanceof Manager) {
		// if (employee instanceof Manager manager) { }
		System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
		switch (employee) {
		case Manager manager: {
			manager.setCode("123");
			manager.setName("Joao");
			manager.setSalary(5000);
			manager.setLogin("joao_nunes");
			manager.setPassword("123456");
			manager.setComission(1200);

			System.out.println(manager.getName());
			System.out.println(manager.getCode());
			System.out.println(manager.getSalary());
			System.out.println(manager.getLogin());// Agora funciona,instancia de Manager
			System.out.println(manager.getPassword());// Agora funciona,instancia de Manager
			System.out.println(manager.getComission());
			System.out.println(manager.getFullSalary(500));
			break;
		}
		case Salesman salesman:{
			salesman.setCode("456");
			salesman.setName("Lucas");
			salesman.setSalary(2800);
			salesman.setPercentPerSold(10);
			salesman.setSoldAmount(1000);

			System.out.println(salesman.getName());
			System.out.println(salesman.getCode());
			System.out.println(salesman.getSalary());
			System.out.println(salesman.getPercentPerSold());
			System.out.println(salesman.getSoldAmount());
			break;
		}
		default:
			break;
		}
		System.out.println(employee.getFullSalary());
		System.out.println(employee.getFullSalary(1000));
		
		System.out.printf("===========================================\n");
	}
}
