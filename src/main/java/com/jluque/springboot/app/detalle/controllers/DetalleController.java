package com.jluque.springboot.app.detalle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jluque.springboot.app.detalle.model.Detalle;
import com.jluque.springboot.app.detalle.service.BatchCreditCardService;
import com.jluque.springboot.app.detalle.service.BatchMasterService;
import com.jluque.springboot.app.detalle.service.DetalleService;

@RestController
public class DetalleController {

	@Autowired
	@Qualifier("serviceFeign")
	private DetalleService detalleService;

	@Autowired
	@Qualifier("batchMasterFeign")
	private BatchMasterService batchMasterService;

	@Autowired
	@Qualifier("batchCreditCardFeign")
	private BatchCreditCardService batchCreditCardService;

	@GetMapping("/listar")
	public List<Detalle> listar() {
		return detalleService.findAll();
	}

	@GetMapping("/ver/{id}/cantidad/{cantidad}/detalle/{detalle}")
	public Detalle ver(@PathVariable Long id, @PathVariable Integer cantidad, @PathVariable String detalle) {
		return detalleService.findById(id, cantidad, detalle);
	}

	@GetMapping("/batchMaster")
	public void llamarBatchMaster() throws Exception {
		batchMasterService.llamarBatch();
	}

	@GetMapping("/batchExample")
	public void llamarSpringBatchExample2() throws Exception {
		batchCreditCardService.llamarBatch();
	}

}
