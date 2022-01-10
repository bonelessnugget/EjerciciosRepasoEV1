/*
 * Escribe un programa que calcule la nota que hace falta sacar en el segundo examen de la
asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota
del primer examen cuenta el 12% y la del segundo examen un 28%.
Nota: Al normalizar sus valores, la nota del primer examen cuenta el 30% y la del segundo el
70%.
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double nota1;
		double resultado;
		double media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la nota del primer examen: ");
		nota1 = teclado.nextFloat();
		System.out.println("Introduce la media que quieres sacar: ");
		media = teclado.nextFloat();
		resultado = media / ((nota1 * 0.30) * (0.70));
		Math.flocd
		System.out.println("La nota del segund examen tiene que ser: " + resultado); 

	}

}
