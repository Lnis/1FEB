package edu.femxa.val.ejernavi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		ListaPersonas lista1= new ListaPersonas();
		
		Scanner scaner = null;
		String name=null;
		int age=0;
		Persona persona_aux = null;
		
		for(int i=0; i<2; i++){
			System.out.println("Introduce nueva persona");
			System.out.println("Introduce nombre:");
			scaner = new Scanner(System.in);
			name = scaner.next();
			System.out.println("Introduce edad:");
			scaner = new Scanner(System.in);
			age = scaner.nextInt();
			persona_aux=new Persona(name, age);
			lista1.insertarPersona(persona_aux);
		}
		lista1.listarPersonas();
	}
}
