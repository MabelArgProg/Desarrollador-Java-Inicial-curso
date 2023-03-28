package clase1;

public class Ejercicio1b {

	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFinal = 14;
		
		int contador = numeroInicio;
		
		while (contador <= numeroFinal) {
			if (contador % 2 == 0) {
				System.out.println (contador);
			}
			contador = contador +1;
		}
	}
}
