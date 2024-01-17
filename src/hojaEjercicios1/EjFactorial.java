package hojaEjercicios1;

public class EjFactorial {

	public static void main(String[] args) {
		/*
		 * 4. Método factorial(), que calculará el factorial del número que se le pasa como
				parámetro. Retornará el resultado del calculo del factorial, o bien un -1 en caso
				de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro
				pasado sea cero.
		 */
		
		System.out.println(factorial(0));

	}


	//Metodo recursivo
	public static long factorial (int numero) {
		if (numero <0) return -1;
		if (numero == 0) return -2;
		//Filosofía de trabajo, el fácil lo resuelvo, lo complicado se lo dejo a la maquina
		if (numero ==1) {
			return 1;
		} else {
			return numero*factorial(numero-1);
		}
	}
	

	

}
