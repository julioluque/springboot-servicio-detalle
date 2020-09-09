package com.jluque.springboot.app.detalle.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.jluque.springboot.app.detalle.model.Detalle;

public interface DetalleService {

	public List<Detalle> findAll();

	public Detalle findById(@PathVariable Long id, @PathVariable Integer cantidad, @PathVariable String detalle);

}
