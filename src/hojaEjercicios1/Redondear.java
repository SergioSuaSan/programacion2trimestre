package hojaEjercicios1;

public class Redondear {

	public static void main(String[] args) {
		/*
		 * Realiza un método redondear() al que se le pasa como parámetro un numero float
y los decimales que deben quedar después de redondear, y retorna el numero
redondeado.
		 */

		
		System.out.println(redondear(123.45678 ,3));
		
		
	}
	
	public static String redondear (double num1, int num2) {
		String texto =String.valueOf(num1);
		int punto = texto.indexOf('.');
		if (texto.indexOf(punto+num2+2)>=5) {
		}
		return texto.substring(0,punto+num2+1);
	}

}
