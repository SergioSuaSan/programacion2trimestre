package metodos;

public class DobleV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorResultado;
		valorResultado = doble(4);
		System.out.println(valorResultado);
		System.out.println(doble(10));
	}
	
	
	//Método que recibe un resultado y calcula el doble
	public static int doble (int dato) {
		int resultado = dato*2;
		//ahora vuelvo y ofrezco el resultado
		return resultado;
		
	}

}
