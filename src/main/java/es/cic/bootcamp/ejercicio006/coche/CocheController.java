package es.cic.bootcamp.ejercicio006.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocheController {
	@Autowired
	private CocheService cocheService;
	
	
	@GetMapping("/entrada")
	public String darBienvenida() {
		return cocheService.darBienvenida();	
	}
	
	@GetMapping("/salida")
	public String despedir() {
		return cocheService.despedir();
	}

	public void setCocheService(CocheService cocheService) {
		this.cocheService = cocheService;
	}
}
