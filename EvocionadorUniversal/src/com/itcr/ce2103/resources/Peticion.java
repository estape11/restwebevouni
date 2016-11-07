package com.itcr.ce2103.resources;

public class Peticion {
	private int cantidad;
	private Enemy enem1;
	private Enemy enem2;
	private Enemy enem3;
	private Enemy enem4;
	public Enemy getEnem3() {
		return enem3;
	}
	public void setEnem3(Enemy enem3) {
		this.enem3 = enem3;
	}
	public Enemy getEnem4() {
		return enem4;
	}
	public void setEnem4(Enemy enem4) {
		this.enem4 = enem4;
	}
	private boolean inicial;
	public Peticion(){
		this.inicial=true;
	}
	public Peticion(int cantidad, Enemy enem1, Enemy enem2,Enemy enem3,Enemy enem4, boolean inicial) {
		super();
		this.cantidad = cantidad;
		this.enem1 = enem1;
		this.enem2 = enem2;
		this.enem3 = enem3;
		this.enem4 = enem4;
		this.inicial = inicial;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isInicial() {
		return inicial;
	}
	public void setInicial(boolean inicial) {
		this.inicial = inicial;
	}
	public Enemy getEnem1() {
		this.inicial=false;
		return enem1;
	}
	public void setEnem1(Enemy enem1) {
		this.enem1 = enem1;
	}
	public Enemy getEnem2() {
		return enem2;
	}
	public void setEnem2(Enemy enem2) {
		this.enem2 = enem2;
	}
}
