package es.cic.bootcamp.ejercicio006.coche;

import org.springframework.stereotype.Service;

@Service
public class CocheService {
	public static final String MENSAJE_BIENVENIDA = "Hola mundo";
	public static final String MENSAJE_PARTIDA = "Adios mundo cruel";

	public String darBienvenida() {
		return MENSAJE_BIENVENIDA;	
	}
	
	public String despedir() {
		return MENSAJE_PARTIDA;
	}
}
