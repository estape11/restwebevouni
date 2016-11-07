package com.itcr.ce2103.resources;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private Enemy ene;
	public Persona(){
		this.ene=new Enemy();
		ene.setEspecie(2);
		ene.setResisArti(3);
		ene.setResisFlechas(22);
		ene.setResisMagia(33);
		ene.setVelocidad(33);
		ene.setVida(3);
	};
	public Enemy getEne() {
		return ene;
	}
	public void setEne(Enemy ene) {
		this.ene = ene;
	}
	public Persona(String nombre,String ape,int edad){
		this.nombre=nombre;
		this.apellido=ape;
		this.edad=edad;
		this.ene=new Enemy();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
