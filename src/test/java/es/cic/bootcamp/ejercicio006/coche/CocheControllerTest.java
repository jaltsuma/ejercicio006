package es.cic.bootcamp.ejercicio006.coche;

import static org.junit.jupiter.api.Assertions.*;

import static es.cic.bootcamp.ejercicio006.coche.CocheController.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheControllerTest {

	private CocheController cut;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new CocheController();
	}

	@Test
	void testEntrada() {
		String resultado = cut.entrada();

		assertEquals(MENSAJE_BIENVENIDA, resultado, "El mensaje de bienvenida no es correcto");
	}

	@Test
	void testAdios() {
		String resultado = cut.adios();
		
		assertEquals(MENSAJE_PARTIDA, resultado, "El mensaje de partida no es correcto");
	}

}
