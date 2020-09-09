package com.jluque.springboot.app.detalle.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.jluque.springboot.app.detalle.cliente.DetalleClienteRest;
import com.jluque.springboot.app.detalle.model.Detalle;

@Service("serviceFeign")
@Primary
public class DetalleServiceFeign implements DetalleService {

	@Autowired
	private DetalleClienteRest clienteFeign;

	@Override
	public List<Detalle> findAll() {
		return clienteFeign.listar().stream().map(p -> new Detalle(p, "Detalle por defecto..."))
				.collect(Collectors.toList());
	}

	@Override
	public Detalle findById(Long id, Integer cantidad, String detalle) {

		return new Detalle(clienteFeign.detalle(id, cantidad), detalle);
	}

}
