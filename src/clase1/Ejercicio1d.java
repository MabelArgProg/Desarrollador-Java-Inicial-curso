package clase1;

public class Ejercicio1d {

	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFinal = 14;
		
		for (int i = numeroFinal; i >= numeroInicio; i = i -1 ) {
			if (i % 2 == 0) {
				System.out.println (i);
			}
		
		}
	}
}
