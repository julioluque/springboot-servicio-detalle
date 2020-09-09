package com.jluque.springboot.app.detalle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootServicioDetalleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioDetalleApplication.class, args);
	}

}
