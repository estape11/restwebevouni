package com.itcr.ce2103.resources;

public class Enemigo {
	
	private int[] cromosoma;
	
	public int[] getCromosoma() {
		return cromosoma;
	}
	
	public void setCromosoma(int[] cromosoma) {
		this.cromosoma = cromosoma;
	}
	
	public Enemigo(){
		this.cromosoma=new int[5];
	}
	
	public Enemigo(int vida, int velocidad, int resisFlechas, int resisMagia, int resisArtilleria) {
		this.cromosoma=new int[5];
		this.cromosoma[0]=vida;
		this.cromosoma[1]=velocidad;
		this.cromosoma[2]=resisFlechas;
		this.cromosoma[3]=resisMagia;
		this.cromosoma[4]=resisArtilleria;
	}
	
	/*
	public int getVida() {
		return this.cromosoma[0];
	}
	public void setVida(int vida) {
		this.cromosoma[0] = vida;
	}
	public int getVelocidad() {
		return this.cromosoma[1];
	}
	public void setVelocidad(int velocidad) {
		this.cromosoma[1] = velocidad;
	}
	public int getResisFlechas() {
		return this.cromosoma[2];
	}
	public void setResisFlechas(int resisFlechas) {
		this.cromosoma[2] = resisFlechas;
	}
	public int getResisMagia() {
		return this.cromosoma[3];
	}
	public void setResisMagia(int resisMagia) {
		this.cromosoma[3] = resisMagia;
	}
	public int getResisArtilleria() {
		return this.cromosoma[4];
	}
	public void setResisArtilleria(int resisArtilleria) {
		this.cromosoma[4] = resisArtilleria;
	}
	*/
}
