package com.jluque.springboot.app.detalle.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jluque.springboot.app.detalle.model.Item;

@FeignClient(name = "servicio-items", url = "localhost:8002")
public interface DetalleClienteRest {

	@GetMapping("/listar")
	public List<Item> listar();

	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad);
}
