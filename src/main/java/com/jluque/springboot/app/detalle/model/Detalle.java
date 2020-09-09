package com.jluque.springboot.app.detalle.model;

public class Detalle {
	private Item item;
	private String detalle;

	public Detalle() {
		// TODO Auto-generated constructor stub
	}

	public Detalle(Item item, String detalle) {
		super();
		this.item = item;
		this.detalle = detalle;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
