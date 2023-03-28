package clase4;

import java.util.Arrays;

public class Ejercicio1a {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		String orden = (args[3]);
		
		System.out.println(Arrays.toString(numerosAOrdenar(num1, num2, num3, orden)));
	}
	
	public static int[]numerosAOrdenar ( int num1, int num2, int num3, String orden){
		int [] vector = new int[] {num1, num2, num3};
		
		for ( int i = 0; i < vector.length; i++) {	
		for ( int j = i +1; j < vector.length; j++) {
			if (orden.equals("ascendente")) {
			if (vector[i]>vector[j]) {
				System.out.println("El mayor es " + vector[i]);
				int temp  = vector[i];
				vector[i] = vector[j];
				vector[j] = temp;
			}
			}
			else if (orden.equals("descendente")) {
				if (vector[i]<vector[j]) {
					System.out.println("El menor es " + vector[i]);
					int temp  = vector[i];
					vector[i] = vector[j];
					vector[j] = temp;
				}
			}
		  }
		}
	return vector;
	}
}


