/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		float horas;
		float resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce las horas trabajadas: ");
		horas = teclado.nextFloat();
		resultado = horas * 12;
		System.out.println("Has ganado " + resultado + " euros.");

	}

}
