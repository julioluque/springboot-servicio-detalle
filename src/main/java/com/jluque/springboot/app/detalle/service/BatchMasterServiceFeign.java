package com.jluque.springboot.app.detalle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jluque.springboot.app.detalle.cliente.BatchMasterClienteRest;

@Service("batchMasterFeign")
public class BatchMasterServiceFeign implements BatchMasterService {

	@Autowired
	private BatchMasterClienteRest clienteFeign;

	@Override
	public String llamarBatch() throws Exception {
		clienteFeign.llamarBatch();
		return "El batch con controlador, fue llamado por microservicio";
	}

}
