package com.jluque.springboot.app.detalle.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicio-batch", url = "localhost:8004")
public interface BatchMasterClienteRest {

	@GetMapping("/echo-test")
	public String llamarBatch() throws Exception;

}
