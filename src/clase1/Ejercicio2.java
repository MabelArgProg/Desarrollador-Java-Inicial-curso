package clase1;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		float IngresosM = 489083;
		int Vehiculos = 3;
		int Antiguedad = 5;
		int Inmueble = 3;
		boolean EmbarcacionesDeLujo = true;
		
		if (IngresosM >= 489083 || (Vehiculos >= 3) && (Antiguedad <=5) || (Inmueble >= 3) || (EmbarcacionesDeLujo == true)){
			  System.out.println ("Corresponde a ALTOS INGRESOS");
		  }else{
			  System.out.println ("NO corresponde a ALTOS INGRESOS");
		}
	}
}
