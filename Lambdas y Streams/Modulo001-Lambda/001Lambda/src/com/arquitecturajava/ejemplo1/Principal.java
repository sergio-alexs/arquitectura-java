package com.arquitecturajava.ejemplo1;

import java.util.ArrayList;
import java.util.Collections;

import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		
		Collections.sort(listaPersonas);
		
		for (Persona p: listaPersonas) {
			
			System.out.printf("persona : %s %s %s %n",p.getNombre(),p.getApellidos(),p.getEdad());
		}
	}

}
