package recursividad;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial2(5));

	}

	//método iterativo que calcula el factorial de un numero

	
	public static long factorial (int numero) {
		long resultado = 1;
		 for (int i = 1; i<= numero; i++) {
			 resultado*=i;
		 }
		 return resultado;
	}
	
	//Metodo recursivo
	public static long factorial2 (int numero) {
		//Filosofía de trabajo, el fácil lo resuelvo, lo complicado se lo dejo a la maquina
		if (numero ==1) {
			return 1;
		} else {
			return numero*factorial2(numero-1);
		}
	}
	
}
