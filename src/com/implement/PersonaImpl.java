package com.implement;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.dao.PersonaDAO;
import com.modelo.Persona;

public class PersonaImpl  implements PersonaDAO{

	@Override
	public Persona getById(int id) {
		List<Persona> listaPersonas = new ArrayList<>();
		Persona p1 = new Persona(1, "Jesus", "Vazquez", new Date(), 55443322);
		Persona p2 = new Persona(2, "Alicia", "Perez", new Date(), 55443344);
		Persona p3 = new Persona(3, "Marco", "Baez", new Date(), 55443311);
		Persona p4 = new Persona(4, "Alan", "Sanchez", new Date(), 55446622);
		Persona p5 = new Persona(5, "Maria", "Lopez", new Date(), 55443412);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		listaPersonas.add(p5);
		
		Persona p = new Persona();
		for(Persona l: listaPersonas) {
			if(l.getId()==id) {
				p = l;
			}
			
		}
		return p;	
	}

}
