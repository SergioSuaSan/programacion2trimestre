package hojaEjercicios1;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * Escribe un método recursivo Fibonacci() que calcule el valor de la serie para un
valor dado, siendo:
		 */

		
		System.out.println(Fibonacci(45));
		
	}
	
	public static int Fibonacci( int num) {
		if (num == 1) return 0;
		if (num == 2) return 1;
		else  {
			return Fibonacci(num-1) + Fibonacci(num-2);
		}
		
	}

}
