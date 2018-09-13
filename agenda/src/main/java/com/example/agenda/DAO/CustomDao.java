package com.example.agenda.DAO;

import java.util.List;

import com.example.agenda.pojos.Personas;

public interface CustomDao {
	
	List<Personas> find(String nombre);
		
	
}
