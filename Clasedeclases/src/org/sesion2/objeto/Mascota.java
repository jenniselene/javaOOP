package org.sesion2.objeto;

public class Mascota {

	protected String petname;
	protected int petage;
	protected boolean doggie;
	
	public String getPetname() {
		return petname;
	}
	public boolean isDoggie() {
		return doggie;
	}
	public void setDoggie(boolean doggie) {
		this.doggie = doggie;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public int getPetage() {
		return petage;
	}
	public void setPetage(int petage) {
		this.petage = petage;
	}
	
	public String toString() {
		return petname + " no es un perro y tiene " + petage + " años de edad.";
	}
	
}
