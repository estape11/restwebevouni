package com.itcr.ce2103.resources;
public class Enemy {
	private int vida;
	private int velocidad;
	private int resisFlechas;
	private int resisMagia;
	private int resisArti;
	private int especie;
	public Enemy(){}
	public Enemy(int vida, int velocidad, int resisFlechas, int resisMagia, int resisArti, int especie) {
		super();
		this.vida = vida;
		this.velocidad = velocidad;
		this.resisFlechas = resisFlechas;
		this.resisMagia = resisMagia;
		this.resisArti = resisArti;
		this.especie = especie;
	}
	public int getEspecie() {
		return especie;
	}
	public void setEspecie(int especie) {
		this.especie = especie;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getResisFlechas() {
		return resisFlechas;
	}
	public void setResisFlechas(int resisFlechas) {
		this.resisFlechas = resisFlechas;
	}
	public int getResisMagia() {
		return resisMagia;
	}
	public void setResisMagia(int resisMagia) {
		this.resisMagia = resisMagia;
	}
	public int getResisArti() {
		return resisArti;
	}
	public void setResisArti(int resisArti) {
		this.resisArti = resisArti;
	}
}
