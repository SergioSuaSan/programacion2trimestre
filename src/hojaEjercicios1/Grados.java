package hojaEjercicios1;

import java.util.Scanner;

public class Grados {

	public static void main(String[] args) {
		/*
		 * Escribe el método grados(), que convierta una temperatura en grados Celsius a
grados Fahrenheit. La formula de conversión es:
		 */
		Scanner teclado = new Scanner (System.in);
		System.out.println("introduce un grado");
		double num = teclado.nextDouble();
		System.out.println(grados(num));
	}
	
	public static double grados(double num) {
		double resultado = 9*num/5 + 32;
		return resultado;
	}
	
	
	
}
