package com.jluque.springboot.app.detalle.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicio-batch-credit-card", url = "localhost:8005")
public interface BatchCreditCardClienteRest {

	@GetMapping("/batch")
	public String getBatch() throws Exception;
}
