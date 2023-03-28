package clase3;

public class Ejercicio1c {

	public static void main(String[] args) {
		int vector [] = {22, 17, 32, 7, 48};
		int x = 13;
		int suma = 0;
		
		 for (int i=0; i<vector.length; i++) {

	          if (vector[i] > x) {
	            suma+= vector[i] ;
	          }
	        }
	        System.out.println(suma);
	    }	
	}
