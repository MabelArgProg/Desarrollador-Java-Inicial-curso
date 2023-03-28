package clase3;

public class Ejercicio2 {

	public static void main(String[] args) {
		mensajeCodificado("Hola que tal", 1); // desplazamiento 1
        mensajeCodificado("Hola que tal", 2); //desplazamiento 2
	}

    public static void mensajeCodificado(String mensaje, int desplazamiento) {
        System.out.println("Mensaje Original: " + mensaje);
        char[] abecedario = mensaje.toCharArray();
        for (int i = 0; i < abecedario.length; i++) { // codifica mensaje
            if (desplazamiento == 1) {
                abecedario[i] = (char) (abecedario[i] + (char) 1); // con desplazamiento de 1
            } else if (desplazamiento == 2) {
                abecedario[i] = (char) (abecedario[i] + (char) 2); //con desplazamiento de 2
            }
        }
        String codificado = String.valueOf(abecedario);
        System.out.println("Mensaje Codificado: " + codificado);

        char[] abecedarioDecodificado = codificado.toCharArray();
        for (int i = 0; i < abecedarioDecodificado.length; i++) { // decodifica el mensaje
            if (desplazamiento == 1) {
                abecedarioDecodificado[i] = (char) (abecedarioDecodificado[i] - (char) 1); // con desplazamiento
            } else if (desplazamiento == 2) {                                              // de 1
                abecedarioDecodificado[i] = (char) (abecedarioDecodificado[i] - (char) 2); // con desplazamiento
            }                                                                              // de 2
        }
        String decodificado = String.valueOf(abecedarioDecodificado);
        System.out.println("Mensaje Decodificado: " + decodificado);
    }
}
	

