package hojaEjercicios1;

public class Redondear {

	public static void main(String[] args) {
		/*
		 * Realiza un método redondear() al que se le pasa como parámetro un numero float
y los decimales que deben quedar después de redondear, y retorna el numero
redondeado.
		 */

		
		System.out.println(redondear(123.45678 ,3));
		System.out.println(truncar(123.45678 ,3));
		
		
	}
	
	public static String truncar (double num1, int num2) {
		String texto =String.valueOf(num1);
		int punto = texto.indexOf('.');
		if (punto + num2 <=texto.length()-1) {
			return texto.substring(0,punto+num2+1);			
		} else {
			return String.valueOf(num1);
		}
	}
	public static double redondear (double num1, int num2) {
		num1 *= Math.pow(10, num2);
		num1 = Math.round(num1);
		num1/= Math.pow(10, num2);
		return num1;
		
		
	}
	
	

}
