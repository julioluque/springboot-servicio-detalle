package com.jluque.springboot.app.detalle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jluque.springboot.app.detalle.cliente.BatchCreditCardClienteRest;

@Service("batchCreditCardFeign")
public class BatchCreditCardServiceFeign implements BatchCreditCardService{

	@Autowired
	private BatchCreditCardClienteRest clienteFeign;

	@Override
	public String llamarBatch() throws Exception {
		clienteFeign.getBatch();
		return "El batch con controlador, fue llamado por microservicio";
	}

}
