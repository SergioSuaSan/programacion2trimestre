package hojaEjercicios1;

public class Cifrar {

	public static void main(String[] args) {
		/*
		 * Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de
caracteres. Estos métodos reciben un String y retornan ese String ya cifrado o
descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que está
dos puestos mas adelante( la ‘a’ se cambia por la ‘c’), teniendo en cuenta que el
cambio es circular, es decir, la ‘z’ se cambiará por la ‘b’. El proceso de
descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán
ningún cambio.
		 */
		
		
		System.out.println(cifrar ("Hola, cómo estás"));
		System.out.println(descifrar ("Jqnc, eõoq guvãu"));

	}
	
	
//	public static String cifrar(String frase) {
//		String resultado = "";
//		for (int i = 0; i < frase.length(); i++) {
//			char cifrado =(char) (frase.charAt(i) +2);
//			resultado += cifrado ;
//		}
//		return resultado;
//	}
//	public static String descifrar(String frase) {
//		String resultado = "";
//		for (int i = 0; i < frase.length(); i++) {
//			char cifrado =(char) (frase.charAt(i) -2);
//			resultado += cifrado ;
//		}
//		return resultado;
//	}
	

	public static String cifrar(String frase) {
		StringBuilder sb = new StringBuilder(frase);
		char letra;
		for (int i = 0; i < sb.length(); i++) {
			letra = sb.charAt(i);
			if (Character.isAlphabetic(letra)) {
				if (letra== 'y') { letra ='a';} 
				else if (letra== 'z') { letra ='b';} 
				else {letra  =(char) (letra + 2);
				sb.setCharAt(i, letra);
			}
		}
		}
		return sb.toString();
	}
		
		public static String descifrar(String frase) {
			StringBuilder sb = new StringBuilder(frase);
			char letra;
			for (int i = 0; i < sb.length(); i++) {
				letra = sb.charAt(i);
				if (Character.isAlphabetic(letra)) {
					if (letra== 'a') { letra ='y';} 
					else if (letra== 'b') { letra ='z';} 
					else {letra  =(char) (letra - 2);
					sb.setCharAt(i, letra);
					}
				}
			}
			return sb.toString();
		}
		
}
	
	
	
	
	

