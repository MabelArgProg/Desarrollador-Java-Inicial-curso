package clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Test
	void testPrueba1() {
		double resultadoMultiplicar = Calculadora.multiplicar(80, 3);
		assertEquals(resultadoMultiplicar, 240);
	}
	
	@Test
	void testPrueba2() {
		double resultadoSumar = Calculadora.sumar(180, 150);
		double resultadoFinal = Calculadora.dividir(resultadoSumar, 3);
		assertEquals (resultadoFinal, 110);
    }
	
	@Test
	void testPrueba3() {
		double resultadoRestar = Calculadora.restar(90, 50);
		double resultadoFinal = Calculadora.multiplicar(resultadoRestar, 15);
		assertFalse (resultadoFinal == 605);
	}
	
	@Test
	void testPrueba4() {
		double resultadoSumar = Calculadora.sumar(70, 40);
		double resultadoFinal = Calculadora.multiplicar(resultadoSumar, 25);
		assertFalse (resultadoFinal == 2700);
	}
}

