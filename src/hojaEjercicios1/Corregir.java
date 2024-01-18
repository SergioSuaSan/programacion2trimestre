package hojaEjercicios1;

public class Corregir {

	public static void main(String[] args) {
		/*
		 * 8. Realiza un método llamado quitaFaltas() al que se le pasa un String con un texto
en minúsculas con signos de puntuación y coloque adecuadamente las palabras
que deban empezar en mayúsculas.
		 */

		System.out.println(quitaFaltas("hola. me quiero ir. Estoy cansado, señor Stark"));
		
	}
	
	public static String quitaFaltas (String frase) {
		StringBuilder sb = new StringBuilder(frase);
		boolean hacerCambio = true;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '.') {
				hacerCambio = true;
			} else  if ( hacerCambio && Character.isAlphabetic( sb.charAt(i) ) ){
				sb.setCharAt( i, Character.toUpperCase( sb.charAt(i) ) );
				hacerCambio = false;
			}
		}		
		return sb.toString();
	}

	
}
