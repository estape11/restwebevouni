package com.itcr.ce2103.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("/main")
public class Main {
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String main() {
		return "Hello";
	}
	@GET
	@Path("/persona")
	@Produces(MediaType.APPLICATION_JSON)
	public Persona persona(@Context HttpHeaders httpheaders) {
		Persona per=new Persona("pedro","alvarez",3);
		return per;
	}
	@PUT
	@Path("/come")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Persona come(@Context HttpHeaders httpheaders, Persona persona){
		System.out.println(persona.getNombre());
		Persona per=new Persona("juan","alvarez",3);
		return per;	
	}
	@PUT
	@Path("/enemy")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Enemigo getEnemy(Enemigo ene1){
		Enemigo ene=new Enemigo(11,13,141,151,16);
		return ene;
	}
	@POST
	@Path("/enemy2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Enemigo getEnemy2(Enemigo ene1){
		Enemigo ene=new Enemigo(11,13,141,151,16);
		return ene;
	}
	@POST
	@Path("/pobla")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Poblacion getPobla(Poblacion pobla){
		pobla.genPobla();
		return pobla;
	}
	
	@POST
	@Path("/jeje")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Enemy thing(Enemy ene){
		Enemy ene2=new Enemy(11,13,141,151,16,0);
		return ene2;
	}
	
	//Este metodo hace la mutacion y así
	@POST
	@Path("/poblacion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pobla getPoblacion(Peticion peticion){
		if(peticion.isInicial()){
			Pobla temp=new Pobla();
			temp.genPobla(peticion.getCantidad());
			return temp;
		}
		else{
			Pobla muta=new Pobla();
			muta.genMutacion(peticion.getEnem1(), peticion.getEnem2(), peticion.getEnem3(), peticion.getEnem4(), peticion.getCantidad());
			return muta;
		}
	}
}
