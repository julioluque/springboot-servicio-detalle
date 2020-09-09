package com.jluque.springboot.app.detalle.model;

/**
 * @author luque.julio.alfredo
 *
 */
public class Item {
	private Producto producto;
	private Integer cantidad;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Producto producto, Integer cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
