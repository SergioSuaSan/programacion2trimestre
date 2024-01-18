package hojaEjercicios1;

import java.util.Iterator;

public class RevertirNumero {

	public static void main(String[] args) {
		/*
		 * 9. Escribe el método inverso(), que recibe un numero y retorna el inverso (si recibe
el 1234 da como retorno el 4321). Prohibido usar método reverse().
		 */

		System.out.println(inverso(456456));
		System.out.println(inverso2(132123));
	}

	public static int inverso(int num) {
		String numero = String.valueOf(num);
		StringBuilder operador = new StringBuilder();
		for (int i = numero.length()-1; i >= 0; i--) {
			operador.append(numero.charAt(i));
		}
		String resultado = operador.toString();
		return Integer.parseInt(resultado);
	}
	
	public static int inverso2 (int numero) {
		return Integer.parseInt( new StringBuilder( String.valueOf(numero) ).reverse().toString()  );
	}
	
	
}
