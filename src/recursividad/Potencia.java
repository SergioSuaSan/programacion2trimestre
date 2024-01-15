package recursividad;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base, exp;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Base: ");
		base = teclado.nextInt();
				System.out.println("Exp: ");
		exp = teclado.nextInt();

		System.out.println("Potencia: " + potencia(base,exp));
	}
	
	
	
	public static int potencia (int num1, int num2) {
		if (num2 ==0) {
			return 1;
		} else {
			return num1*potencia(num1,num2-1);
		}
	}

}
