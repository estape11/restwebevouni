package com.itcr.ce2103.resources;

import java.util.Random;

public class Poblacion {
	Enemigo[] ene;
	
	public Poblacion(){}
	
	public void setCantidad(int num){
		ene=new Enemigo[num];
	}
	
	public void genPobla(){
		Random rand = new Random();
		for(int i=0;i<this.ene.length;i++){
			int vida=rand.nextInt(10)+1;
			int resisArtilleria=rand.nextInt(10)+1;
			int resisFlechas=rand.nextInt(10)+1;
			int resisMagia=rand.nextInt(10)+1;
			int velocidad=rand.nextInt(10)+1;
			Enemigo enetmp=new Enemigo(vida,velocidad, resisFlechas, resisMagia, resisArtilleria);
			this.ene[i]=enetmp;
		}
	}
	
	public Enemigo[] getEne(){return this.ene;}
}
