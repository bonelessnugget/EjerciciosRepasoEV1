/*
 * Escribe un programa que calcule el área de un rectángulo.
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		float b;
		float l;
		float resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		b = teclado.nextFloat();
		System.out.println("Introduce el lado: ");
		l = teclado.nextFloat();
		resultado = b*l;
		System.out.println("El resultado es: " + resultado);

	}

}
