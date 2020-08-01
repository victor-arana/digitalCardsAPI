package com.digital.cards.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.cards.api.model.Tarjeta;

@RestController
@RequestMapping("/api/v1/tarjeta")
public class TarjetaAPI {
	
	private static List<Tarjeta> tarjetas = new ArrayList<>();
	
	static {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setId(1);
		tarjeta.setNombreTitular("Victor Jose Arana Rodriguez");
		tarjeta.setNombreEntidad("City Banamex");
		tarjeta.setNumeroTarjeta("1234-1234-2143-2344");
		tarjeta.setMarca("Space VISA");
		tarjeta.setFechaCaducidad("10/12");
		
		tarjetas.add(tarjeta);
	}

	@PostMapping
	public Tarjeta crearTarjeta(@RequestBody Tarjeta tarjeta) {
		tarjetas.add(tarjeta);
		return tarjeta;
	}
	
	@GetMapping
	public List<Tarjeta> obtenerTarjetas() {
		return tarjetas;
	}
	
	@PutMapping
	public void actualizarTarjeta() {
		System.out.println("Actualizar tarjeta");
	}
	
	@DeleteMapping
	public void eliminarTarjeta() {
		System.out.println("Eliminar tarjeta");
	}
}
