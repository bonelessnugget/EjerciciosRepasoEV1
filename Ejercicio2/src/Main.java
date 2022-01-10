/*
 * Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
teclado.
 */
import java.util.Scanner;
public class Main {
	static double Suma(double operador1, double operador2) {
		double resultado = operador1 + operador2;
		System.out.println(resultado);
		return resultado;
	}
	
	static double Resta(double operador1, double operador2) {
		double resultado = operador1 - operador2;
		System.out.println(resultado);
		return resultado;
	}
	
	static double Multiplicacion(double operador1, double operador2) {
		double resultado = operador1 * operador2;
		System.out.println(resultado);
		return resultado;
	}
	
	static double Division(double operador1, double operador2) {
		double resultado = operador1 / operador2;
		System.out.println(resultado);
		return resultado;
	}
	
	public static void main(String[] args) {
		String op;
		double operador1;
		double operador2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el simbolo de la operación: ");
		op = teclado.nextLine();
		switch (op) {
		case "+": {
			System.out.println("Introduce el primer operador: ");
			operador1 = teclado.nextDouble();
			System.out.println("Introduce el segundo operador: ");
			operador2 = teclado.nextDouble();
			Suma(operador1,operador2);
			break;
		}
		case "-": {
			System.out.println("Introduce el primer operador: ");
			operador1 = teclado.nextDouble();
			System.out.println("Introduce el segundo operador: ");
			operador2 = teclado.nextDouble();
			Resta(operador1,operador2);	
			break;
		}
		case "*": {
			System.out.println("Introduce el primer operador: ");
			operador1 = teclado.nextDouble();
			System.out.println("Introduce el segundo operador: ");
			operador2 = teclado.nextDouble();
			Multiplicacion(operador1,operador2);
			break;
		}
		case "/":{
			System.out.println("Introduce el primer operador: ");
			operador1 = teclado.nextDouble();
			System.out.println("Introduce el segundo operador: ");
			operador2 = teclado.nextDouble();
			Division(operador1,operador2);
			break;
		}
		}
	}

}
