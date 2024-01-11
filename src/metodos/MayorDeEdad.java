package metodos;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int edad;
		System.out.println("Teclea tu edad: ");
		edad = teclado.nextInt();
		
		if (esMayorDeEdad(edad)) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}

	}

	public static boolean esMayorDeEdad ( int edad) {
		if( edad >=18) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
