package es.cic.bootcamp.ejercicio006.coche;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocheController {
	public static final String MENSAJE_PARTIDA = "Adios mundo cruel";
	public static final String MENSAJE_BIENVENIDA = "Hola mundo";

	@GetMapping("/entrada")
	public String entrada() {
		return MENSAJE_BIENVENIDA;	
	}
	
	@GetMapping("/salida")
	public String adios() {
		return MENSAJE_PARTIDA;
	}
}
