package com.itcr.ce2103.resources;

public class Pobla {
	Enemy[] ene;
	
	public Pobla(){}
	
	public void genPobla(int cantidad){//Genera la poblacion incial
		this.ene=new Enemy[cantidad];
		for(int i=0;i<this.ene.length;i++){
			int especie=RandomNumbers.randInt(0,4); //Son las cuatro especies
			if (especie==0){//Si es ogro
				int vida=RandomNumbers.randInt(1,10);
				int resisArtilleria=RandomNumbers.randInt(1,5);
				int resisFlechas=RandomNumbers.randInt(5,10);
				int resisMagia=RandomNumbers.randInt(1,5);
				int velocidad=RandomNumbers.randInt(1,5);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
			else if(especie==1){//Si es elfo
				int vida=RandomNumbers.randInt(1,10);
				int resisArtilleria=RandomNumbers.randInt(1,5);
				int resisFlechas=RandomNumbers.randInt(1,5);
				int resisMagia=RandomNumbers.randInt(5,10);
				int velocidad=RandomNumbers.randInt(5,10);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
			else if(especie==2){//Si es daniela, digo arpía
				int vida=RandomNumbers.randInt(1,10);
				int resisArtilleria=RandomNumbers.randInt(5,10); //Dice que no pueden ser atacadas por artilleria
				int resisFlechas=RandomNumbers.randInt(1,10);
				int resisMagia=RandomNumbers.randInt(1,10);
				int velocidad=RandomNumbers.randInt(3,7);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
			else if(especie==3){//Si es mercenario
				int vida=RandomNumbers.randInt(1,10);
				int resisArtilleria=RandomNumbers.randInt(5,10);
				int resisFlechas=RandomNumbers.randInt(5,10);
				int resisMagia=RandomNumbers.randInt(1,5);
				int velocidad=RandomNumbers.randInt(1,10);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
		}	
	}
	
	public void genMutacion(Enemy enem1, Enemy enem2,Enemy enem3,Enemy enem4, int cantidad){ //Mejores fitness de cada especie
		this.ene=new Enemy[cantidad];
		for(int i=0;i<this.ene.length;i++){
			int especie=RandomNumbers.randInt(0,4); //Son las cuatro especies
			if (especie==0){//Si es ogro
				int vida=enem1.getVida()+RandomNumbers.randInt(1,10);
				int resisArtilleria=enem1.getResisArti()+RandomNumbers.randInt(1,5);
				int resisFlechas=enem1.getResisFlechas()+RandomNumbers.randInt(5,10);
				int resisMagia=enem1.getResisMagia()+RandomNumbers.randInt(1,5);
				int velocidad=enem1.getVelocidad()+RandomNumbers.randInt(1,5);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
			else if(especie==1){//Si es elfo
				int vida=enem2.getVida()+RandomNumbers.randInt(1,10);
				int resisArtilleria=enem2.getResisArti()+RandomNumbers.randInt(1,5);
				int resisFlechas=enem2.getResisFlechas()+RandomNumbers.randInt(1,5);
				int resisMagia=enem2.getResisMagia()+RandomNumbers.randInt(5,10);
				int velocidad=enem2.getVelocidad()+RandomNumbers.randInt(5,10);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
			else if(especie==2){//Si es daniela, digo arpía
				int vida=enem3.getVida()+RandomNumbers.randInt(1,10);
				int resisArtilleria=enem3.getResisArti()+RandomNumbers.randInt(1,10);//DIce que esto no 
				int resisFlechas=enem3.getResisFlechas()+RandomNumbers.randInt(1,10);
				int resisMagia=enem3.getResisMagia()+RandomNumbers.randInt(1,10);
				int velocidad=enem3.getVelocidad()+RandomNumbers.randInt(3,7);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
			else if(especie==3){//Si es mercenario
				int vida=enem4.getVida()+RandomNumbers.randInt(1,10);
				int resisArtilleria=enem4.getResisArti()+RandomNumbers.randInt(5,10);
				int resisFlechas=enem4.getResisFlechas()+RandomNumbers.randInt(5,10);
				int resisMagia=enem4.getResisMagia()+RandomNumbers.randInt(1,5);
				int velocidad=enem4.getVelocidad()+RandomNumbers.randInt(1,5);
				Enemy enetmp=new Enemy(vida,velocidad, resisFlechas, resisMagia, resisArtilleria, especie);
				this.ene[i]=enetmp;
			}
		}
	}
	
	public Enemy[] getEne(){
		for (int i = 0;i<this.ene.length;i++){
			if (this.ene[i]==null){
				this.ene[i]=new Enemy(8, 7, 5, 4, 8, 0);
			}
			else{
				continue;
			}
		}
		return this.ene;
		}
}
