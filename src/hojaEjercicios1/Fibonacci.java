package hojaEjercicios1;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * Escribe un método recursivo Fibonacci() que calcule el valor de la serie para un
valor dado, siendo:
		 */

		
		System.out.println(fibonacci(7));
		
	}
	
	public static int fibonacci( int num) {
		if (num == 1) return 0;
		if (num == 2) return 1;
		else  {
			return fibonacci(num-1) + fibonacci(num-2);
		}
		
	}

}
