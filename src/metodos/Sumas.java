package metodos;

public class Sumas {

	public static void main(String[] args) {
		System.out.println( suma ( 2.6 , 5, 34.2 ) );
	}
	
	
	//método que sumados números que le paso por parámetro
	public static int suma (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	public static double suma (double num1, double num2) {
		double resultado = num1 + num2;
		return resultado;
	}
	public static double suma (double num1, double num2, double num3) {
		double resultado = num1 + num2 + num3;
		return resultado;
	}

}
