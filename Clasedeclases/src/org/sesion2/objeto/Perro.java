package org.sesion2.objeto;

public class Perro extends Mascota{

	private String breed;
	private double size;
	private boolean gender;
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String toString() {
		if (gender == true) {
		return  petname + " es una perra con " + petage +" a�os, de raza "+ breed + 
				 " y mide "+ size + " cent�metros.";
		}else {
			return  petname + " es un perro que tiene " + petage +" a�os, es de raza "+ breed + 
					 " y mide "+ size + " cent�metros.";
		}
	}
	
	

}
