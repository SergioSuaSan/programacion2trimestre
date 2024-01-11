package metodos;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(media(5,43,3,5,6,4,56,4,6,4));
		
		
	}

	
	//Método para calcular la media de todos los valores que le pasemos por parámetros
	
	public static double media(double... num) {
		double contador= 0, suma = 0;
		for (double i : num) {
			suma+= i;
			contador++;
		}
		double resultado = suma/contador;
		return resultado;
	}
	
	
}
