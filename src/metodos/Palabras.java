package metodos;


import java.util.StringTokenizer;


public class Palabras {
	
	public static void main(String[] args) {
		String frase = "Hola, buenos días";
		
		System.out.println("La última palabra es: " + ultimaPalabra(frase));
		System.out.println("Total de vocales: "+ cuentaVocales(frase));
	}

	
	public static String ultimaPalabra (String frase) {
		StringTokenizer st = new StringTokenizer(frase, ". , : ;");
		String trozo = null;
		while (st.hasMoreTokens()) {
			 trozo = st.nextToken();
		}
		return trozo;
	}
	
	public static int cuentaVocales(String frase) {
		frase.toLowerCase();
		int vocal = 0;
		String vocales ="aeiouáéíóúäëïöüàèìòùâêûîô";
		for (int i = 0; i < frase.length(); i++) {
			if (vocales.indexOf ( frase.charAt(i) ) != -1 ) {
				vocal ++;			
			}
		}
		return vocal;
	}

	
}
