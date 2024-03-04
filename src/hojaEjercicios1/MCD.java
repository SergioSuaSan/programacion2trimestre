package hojaEjercicios1;

public class MCD {

	public static void main(String[] args) {
		/*
		 * Método mcd() (máximo común divisor), que calcule el mcd de dos números
pasados como parámetros utilizando el algoritmo de Euclides. Este algoritmo
dice que si tenemos dos números A y B, restamos el menor del mayor hasta que
A y B sean iguales, es ese momento tenemos el valor de mcd.
		 */

		System.out.println( mcd(60,26));
	}

	public static int mcd (int num1, int num2) {
		while(num1!=num2) {
			if (num1>num2) {
				num1 = num1-num2;
			} else {
				num2 = num2-num1;
			}
		}
		return num1;
	}
	
}
