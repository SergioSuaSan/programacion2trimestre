package hojaEjercicios1;

public class DiaDelAño {

	public static void main(String[] args) {
		/*
		 * 5. Método fecha() que calculará el día del año al que corresponde una fecha en
				formato día, mes.
				fecha(1,1)=1
				fecha(11,3)=70
				fecha(31,12)=365
		 */
		System.out.println(fecha(4,1));

	}
	
	public static int fecha (int dia, int mes) {
		if (mes<1||mes>12||dia<1||dia>31) return -1;
		int total = 0;
		if (mes==1) return dia;
		for (int i = 1; i < mes; i++) {
			switch (i) {
			case 2: total += 28; break;
			case 4,6,9,11: total += 30; break;
			default: total += 31; break;
			}
		}
		return total+dia;
		
	}
	
	

}
