package es.cic.bootcamp.ejercicio006.coche;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheServiceTest {

	private CocheService cut;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cut = new CocheService();
	}

	@Test
	void testDarBienvenida() {
		String resultado = cut.darBienvenida();
		
		assertEquals(CocheService.MENSAJE_BIENVENIDA, resultado, "El mensaje de bienvenida no es correcto");	}

	@Test
	void testDespedir() {
		String resultado = cut.despedir();
		
		assertEquals(CocheService.MENSAJE_PARTIDA, resultado, "El mensaje de partida no es correcto");	}

}
