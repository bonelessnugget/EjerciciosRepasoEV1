/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser
introducida por teclado.
 * 
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// 1 euro = 166,386 Pesetas
		// 1 peseta = 0.0060 euros
		int opcion;
		int pts;
		int euros;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Pesetas a euros.");
		System.out.println("2. Euros a pesetas.");
		opcion = teclado.nextInt();
		switch (opcion) {
		case 1: {
			System.out.println("Introduce la cantidad en pesetas: ");
			pts = teclado.nextInt();
			resultado = pts * 0.0060;
			System.out.println(pts + " pesetas son " + resultado + ".");
			break;

		}
		case 2: {
			System.out.println("Introduce la cantidad en euros: ");
			euros = teclado.nextInt();
			resultado = euros * 166.386;
			System.out.println(euros + " pesetas son " + resultado + ".");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		
	}

}
