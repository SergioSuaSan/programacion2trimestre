package hojaEjercicios1;

public class Repite {

	public static void main(String[] args) {
		/*
		 * Método repite(), que recibe como parámetro una cadena de caracteres y un
numero, y retorna un nuevo String donde aparece repetida la cadena de caracteres
tantas veces como indique el numero pasado como parámetro.
		 */
		
		System.out.println(repite("Hola", 5));
		
	}

	public static String repitei (String frase, int num) {
		StringBuilder st = new StringBuilder(frase);
		for (int i = 1; i < num; i++) {
			st= st.append(frase);
		}
		return st.toString();
	}
	
	public static String repite (String frase, int num) {
		if (num <=0) return "";
		String resultado =frase;
		if (num ==1) {
			return resultado;
		} else {
			return resultado+ repite(frase, num-1);
		}
	}
	
	
}
