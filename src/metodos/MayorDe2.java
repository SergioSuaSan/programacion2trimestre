package metodos;

public class MayorDe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mayorde2(6,5));
		System.out.println(mayorde3(7,8,5));
		System.out.println(mayor(4,5,6,6,7,8,4,20,4,5,3));
	}
	
	
	public static int mayorde2 (int num1, int num2) {
		if (num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public static int mayorde3 (int num1, int num2, int num3) {
		return mayorde2 (mayorde2(num1,num2),num3);
	}
	
	public static int mayor(int...num) {
		int acumulador= Integer.MIN_VALUE;
		for (int d : num) {
			acumulador = mayorde2(d, acumulador);
		}
		return acumulador;
		
		
	}
}
