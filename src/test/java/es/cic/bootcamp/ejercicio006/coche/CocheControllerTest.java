package es.cic.bootcamp.ejercicio006.coche;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheControllerTest {

	private CocheController cut;
	
	private CocheService dependencia;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new CocheController();
		dependencia = mock(CocheService.class);

		cut.setCocheService(dependencia);
	}

	@Test
	void testDarBienvenida() {
		when(dependencia.darBienvenida()).thenReturn("bienvenida");	
		
		String resultado = cut.darBienvenida();
		
		assertEquals("bienvenida", resultado, "El mensaje de bienvenida no es correcto");
		verify(dependencia, times(1)).darBienvenida();	
	}

	@Test
	void testDespedir() {
		when(dependencia.despedir()).thenReturn("despedida");	

		String resultado = cut.despedir();
		
		assertEquals("despedida", resultado, "El mensaje de partida no es correcto");
		verify(dependencia, times(1)).despedir();
	}

}
