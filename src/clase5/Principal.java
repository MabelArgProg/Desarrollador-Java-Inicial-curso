package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		String archivoEntrada = "Compras.txt";
		List<String> lista = new ArrayList<String>();
		Carrito carrito = new Carrito(LocalDateTime.parse("2023-03-19T18:10:00"));
		Persona persona1 = new Persona("Lunita", "Perez", LocalDateTime.parse("2020-04-19T18:10:00"), carrito);
		Carrito unCarrito = persona1.getCarrito();
		
		try {
			lista = Files.readAllLines(Paths.get(archivoEntrada));
			lista.remove(0); //es el titulo y no lo necesito
			//lista ={"40 jabón 123f", "10 esponja 124f", "100 chocolates 125f", "200 chocolates2 126f", "300 chocolates3 127f"}
			for (String linea : lista) {
				System.out.println(linea );
				String[] datosDeProducto = linea.split(" ");
				System.out.println("la longitud de datosDeProducto es: " + datosDeProducto.length);
				System.out.println(Arrays.toString(datosDeProducto));
				
				//agrego un producto
				Producto p = new Producto (datosDeProducto[1], datosDeProducto[2], Float.parseFloat(datosDeProducto[0]));
				unCarrito.agregarProducto(p);
				}
			}catch (IOException e) {
				System.out.println("Ocurrió un error " + e);
			}
					
			Descuento desFijo = new DescuentoFijo(150);
			Descuento desPorcentaje = new DescuentoPorcentaje(0.10F);
			Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.30F);
			
			desPorcentajeConTope.setValorDesc(0.20f);
			
			try {
				double resultado = unCarrito.costoFinal(desFijo);
				System.out.println("El costo final es " + resultado);
			}catch (ValorCeroException | TotalNegativoException e) {
				System.out.println(e);
			}			
	}
}
