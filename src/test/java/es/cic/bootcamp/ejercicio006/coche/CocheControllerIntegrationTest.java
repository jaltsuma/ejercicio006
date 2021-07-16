package es.cic.bootcamp.ejercicio006.coche;


import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CocheControllerIntegrationTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void testDarBienvenida() throws Exception {
		this.mockMvc
			.perform(get("/entrada"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string(containsString(CocheService.MENSAJE_BIENVENIDA)));
	}

	@Test
	void testDespedir() throws Exception {
		this.mockMvc
			.perform(get("/salida"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string(containsString(CocheService.MENSAJE_PARTIDA)));
	}
}
