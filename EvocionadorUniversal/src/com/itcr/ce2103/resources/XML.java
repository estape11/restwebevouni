package com.itcr.ce2103.resources;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XML{

	public static void writeFile(Object objeto, String file) throws FileNotFoundException{
		XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(file));
		xmlEncoder.writeObject(objeto);
		xmlEncoder.close();
	}

	public static Object readFile(String filename) throws FileNotFoundException{
		XMLDecoder decoder =new XMLDecoder(new FileInputStream(filename));
		Object contenedor=decoder.readObject();
		decoder.close();
		return contenedor;		
	}
}