package hojaEjercicios1;
public class Cifrarcgpt {
	

	    public static void main(String[] args) {
	        String mensajeOriginal = "Hola, Mundo!";
	        
	        // Cifrar el mensaje
	        String mensajeCifrado = cifrar(mensajeOriginal);
	        System.out.println("Mensaje cifrado: " + mensajeCifrado);

	        // Descifrar el mensaje
	        String mensajeDescifrado = descifrar(mensajeCifrado);
	        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
	    }

	    public static String cifrar(String mensaje) {
	        StringBuilder mensajeCifrado = new StringBuilder();

	        for (int i = 0; i < mensaje.length(); i++) {
	            char caracter = mensaje.charAt(i);

	            if (Character.isLetter(caracter)) {
	                char nuevoCaracter = cifrarCaracter(caracter);
	                mensajeCifrado.append(nuevoCaracter);
	            } else {
	                // Mantener caracteres no alfabéticos sin cambios
	                mensajeCifrado.append(caracter);
	            }
	        }

	        return mensajeCifrado.toString();
	    }

	    public static String descifrar(String mensajeCifrado) {
	        StringBuilder mensajeDescifrado = new StringBuilder();

	        for (int i = 0; i < mensajeCifrado.length(); i++) {
	            char caracter = mensajeCifrado.charAt(i);

	            if (Character.isLetter(caracter)) {
	                char nuevoCaracter = descifrarCaracter(caracter);
	                mensajeDescifrado.append(nuevoCaracter);
	            } else {
	                // Mantener caracteres no alfabéticos sin cambios
	                mensajeDescifrado.append(caracter);
	            }
	        }

	        return mensajeDescifrado.toString();
	    }

	    private static char cifrarCaracter(char original) {
	        int desplazamiento = 2;
	        char base = Character.isUpperCase(original) ? 'A' : 'a';

	        return (char) (((original - base + desplazamiento) % 26) + base);
	    }

	    private static char descifrarCaracter(char cifrado) {
	        int desplazamiento = 2;
	        char base = Character.isUpperCase(cifrado) ? 'A' : 'a';

	        int resultado = (cifrado - base - desplazamiento) % 26;
	        if (resultado < 0) {
	            resultado += 26;
	        }

	        return (char) (resultado + base);
	    }
	
	
	
	
	

}
