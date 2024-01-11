package hojaEjercicios1;

import java.util.Scanner;

public class EsVocal {

	public static void main(String[] args) {
		/*
		 * Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter
			y retorna un valor true en caso de que el carácter sea una vocal, y un valor false
			en caso contrario.
		 */
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("introduce una letra");
		String letra = teclado.nextLine();
		System.out.println(esVocal(letra));

	}

	public static boolean esVocal(String caracter) {
		caracter.toLowerCase();
		boolean vocal = false;
		String vocales ="aeiouáéíóúäëïöüàèìòùâêûîô";
		if (vocales.indexOf ( caracter.charAt(0) ) != -1 ) {
			vocal = true;
		}
//		if (caracter.equals("a")||caracter.equals("e")||caracter.equals("i")||caracter.equals("o")||caracter.equals("u")) {
//		vocal = true;
//		}
		return vocal;
	}
	
}
