package metodos;

public class PruebaMetodos {
		
	
	
	//Se pueden tener métodos ilimitados, y no tienen un orden concreto. Pero el que tiene todo el peso es el main
	
	public static void saludar() {
		System.out.println("Hola");
	}
	

	public static void main(String[] args) {
		
		saludar();
		despedirse();
		
	}
		
	public static void despedirse() {
		System.out.println("Adiós");
	}

	
	
}
