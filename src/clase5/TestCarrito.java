package clase5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

	class TestCarrito{
		private Persona persona;
		private Carrito carrito;
	
	void setup(String ruta) {
		String archivoEntrada = ruta;
		List<String> lista = new ArrayList<String>();
		Carrito carrito = new Carrito(LocalDateTime.parse("2023-03-19T18:10:00"));
		persona = new Persona ("Lunita", "Perez", LocalDateTime.parse("2020-04-19T18:10:00"), carrito);
		this.carrito = persona.getCarrito();
			
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
				carrito.agregarProducto(p);
				}
			}catch (IOException e) {
				System.out.println("Ocurrió un error " + e);
			}
	}
		
	@Test
	void testValorCeroException() {
		setup ("comprasTotalCero.txt");
		Descuento desFijo = new DescuentoFijo(3000);
		Assertions.assertThrows(ValorCeroException.class, () -> {this.carrito.costoFinal(desFijo);});
	}
		
	@Test
	void TotalNegativoException() {
		setup ("comprasResultadoNegativo.txt");
		Descuento desFijo = new DescuentoFijo(3000);
		Assertions.assertThrows(TotalNegativoException.class, () -> {this.carrito.costoFinal(desFijo);});
	}
  }
	

//Test de clase anteriores
//import static org.junit.jupiter.api.Assertions.*;

//import java.time.LocalDateTime;

//import org.junit.jupiter.api.Test;

//class TestCarrito {

	//@Test
	//void testCostoFinalDescuentoFijo() {
	//	Producto producto1 = new Producto("arroz", "17125", 300);
	//	Producto producto2 = new Producto("pollo", "417p", 2500);
	//	Producto producto3 = new Producto("salsa", "9567s", 250);
	//	Carrito miCarrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-03-19T18:10:00"));
	//	Descuento desFijo = new DescuentoFijo(50);
		
	//	float valorFinal = miCarrito.costoFinal(desFijo);
	//	assertEquals(valorFinal, 3000);
	//}

	//@Test
	//void testCostoFinalDescuentoPorcentaje() {
	//	Producto producto1 = new Producto("arroz", "17125", 300);
	//	Producto producto2 = new Producto("pollo", "417p", 2500);
	//	Producto producto3 = new Producto("salsa", "9567s", 200);
	//	Carrito miCarrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-03-19T18:10:00"));
	//	Descuento desPorcentaje = new DescuentoPorcentaje(0.10f);
		
	//	float valorFinal = miCarrito.costoFinal(desPorcentaje);
	//	assertEquals(valorFinal, 2700);
	//}
	
//	@Test
//	void testCostoFinalDescuentoPorcentajeConTope() {
//		Producto producto1 = new Producto("arroz", "17125", 300);
//		Producto producto2 = new Producto("pollo", "417p", 2500);
//		Producto producto3 = new Producto("salsa", "9567s", 200);
//		Carrito miCarrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-03-19T18:10:00"));
//		Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.50f);
//		desPorcentajeConTope.setValorDesc(0.10f);
		
//		float valorFinal = miCarrito.costoFinal(desPorcentajeConTope);
//		assertEquals(valorFinal, 2700);
//	}
//}



