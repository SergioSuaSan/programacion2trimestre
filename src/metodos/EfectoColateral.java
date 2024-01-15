package metodos;

public class EfectoColateral {

	public static void main(String[] args) {
		
		
		StringBuilder frase = new StringBuilder("Hola, buenos días");
		StringBuilder resultado;
		
		resultado = anadirPuntoFinal(frase);
		
		System.out.println(resultado);
		System.out.println(frase);
		
	}
	
	
	public static StringBuilder anadirPuntoFinal(StringBuilder texto) {
		StringBuilder clon = new StringBuilder(texto);
		clon.append(".");
		return clon;
	}
	
}
