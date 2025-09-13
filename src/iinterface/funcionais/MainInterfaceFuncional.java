package iinterface.funcionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainInterfaceFuncional {

	public static void main(String[] args) {
		//Lista imutavel
		List<User> users = List.of(new User("Maria", 21), new User("Joao", 32),
				      new User("Eduardo", 40), new User("Ana", 19));

		//users.forEach(user -> System.out.println(user));
		//users.forEach(System.out::println);
		//printStringValue(User::name, users);
		//retornando um inteiro, a idade dos usuarios.
		//printStringValue(user -> String.valueOf(user.age()), users);
		//forma tradicional
		printStringValue(user -> user.toString(), users);
		//usando o replace p/simplificar codigo
		printStringValue(Record::toString, users);
	}//fim main
	private static void printStringValue(Function<User,String>callback,List<User>users){
		users.forEach(u -> System.out.println(callback.apply(u)));
	}
}//fim classe MainInterfaceFuncional
