package com.itcr.ce2103.resources;
import java.util.Random;
public class RandomNumbers {
	public static int randInt(int min, int max) { 
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
