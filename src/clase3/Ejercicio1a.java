package clase3;

public class Ejercicio1a {

	public static void main(String[] args) {
		int sumaLetras = apariciones ("agradecimiento" , 'e' );
			System.out.println(sumaLetras);
	}
	
	public static int apariciones (String palabra, char letra) {
		int cantidadLetras = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i)== letra) {
				cantidadLetras++;
			}
		}
		return cantidadLetras;
	}
}


