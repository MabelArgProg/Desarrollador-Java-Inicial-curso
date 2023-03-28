package clase1;

public class Ejercicio1c {

	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFinal = 14;
		int contador = numeroInicio;
		boolean numeroPar = true;
		
		while (contador <= numeroFinal) {
			
			if (numeroPar == true && contador % 2 == 0) {
				
					System.out.println (contador);
				}else {
					if (numeroPar == false && contador % 2 != 0 ) {
					System.out.println (contador);
					}

				}
				contador = contador +1;
			}
			
		}
	}

