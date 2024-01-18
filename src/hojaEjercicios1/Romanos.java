package hojaEjercicios1;

public class Romanos {

	public static void main(String[] args) {
		/*
		 * Escribe un método romano(), que pasa un numero entero positivo entre 1 y 99 a
números romanos. Los caracteres romanos son:
		 */

		
		int num = 88;
		System.out.println(romano(num));
		
		
		
	}

	public static String romano(int num) {
		int  decena = num/10, unidad = num%10;
		String[] unidades = {"", "I", "II", "III","IV","V","VI","VII","VIII","IX"};
		String[]  decenas = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String resultado = decenas[decena] + unidades[unidad];
		return resultado;
	}
	
	
}
