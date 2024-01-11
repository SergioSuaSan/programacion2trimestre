package metodos;

public class Doble {

	public static void main(String[] args) {
		// Probar método que calcule el nombre de un numero
		
		//Al ser un método Público, puedes usar métodos de otras clases
		PruebaMetodos.saludar();
		int numero = 6;
		doble(numero);
		doble(7);
	}
	
	//Método que recibe un dato e imprime el doble
	public static void doble (int dato) {
		System.out.println("El doble es:  " + (dato*2));
	}
	

}
