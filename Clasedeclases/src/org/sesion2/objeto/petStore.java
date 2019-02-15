package org.sesion2.objeto;

import java.util.Scanner;


public class petStore {

	public static void main(String[] args) {
		
		String buffer = "";
		Scanner scan = new Scanner(System.in);
		
		Mascota pet = new Mascota();

		System.out.print("Introduzca el nombre de la mascota: ");
		pet.setPetname(scan.nextLine());
		
		System.out.print("Edad: ");
		pet.setPetage(scan.nextInt());
		scan.nextLine();
				
		System.out.print("Es la mascota un perro? (S/N) ");
		
		
		if (scan.nextLine().equalsIgnoreCase("s")) {
			pet.setDoggie(true);
		
			Perro dog = new Perro();
			dog.setPetname(pet.getPetname());
			dog.setPetage(pet.getPetage());
						
			System.out.print("Raza: ");
			dog.setBreed(scan.nextLine());
			
			System.out.print("Tamaño en centimetros: ");
			dog.setSize(scan.nextDouble());
			scan.nextLine();
			
			System.out.print("Sexo (F/M): ");
			
			if (scan.nextLine().equalsIgnoreCase("f")) {
				dog.setGender(true);
			}
			
			else {
				dog.setGender(false);
			}
			
			System.out.println("\n\n*****************************************************************\n");
			System.out.println(dog.toString());
					
		}
		
		else {
			pet.setDoggie(false);
			System.out.println("\n\n*****************************************************************\n");
			System.out.println(pet.toString());
		}
		
	}

}
