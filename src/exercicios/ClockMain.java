package exercicios;

import java.util.Scanner;

public class ClockMain {
	public static Clock clock;
	public static Scanner scan = new Scanner(System.in);
	public static int hora = 0;
	public static int minuto = 0;
	public static int segundo = 0;

	public static void main(String[] args) {
		System.out.println("Informe a hora:");
		hora = scan.nextInt();

		System.out.println("Informe os minutos:");
		minuto = scan.nextInt();

		System.out.println("Informe os segundos:");
		segundo = scan.nextInt();

		System.out.println("1- Hora padrão brasileiro:\n" + "2- Hora padrão Americano:");
		int padraoHora = scan.nextInt();

		switch (padraoHora) {
		case 1: {
			clock = new ClockBR();
			clock.setHour(hora);
			clock.setMinute(minuto);
			clock.setSecond(segundo);
			System.out.println("Entrei na opção 1!");
			System.out.println(clock.formatHora(clock.convert(clock)));
			break;
		} // fim case 1
		case 2: {
			clock = new ClockUS();
			clock.setHour(hora);
			clock.setMinute(minuto);
			clock.setSecond(segundo);
			System.out.println("Entrei na opção 2!");
			System.out.println(clock.formatHora(clock.convert(clock)));
			break;
		} // fim case 2
		}// fim switch
	}// fim main

}
