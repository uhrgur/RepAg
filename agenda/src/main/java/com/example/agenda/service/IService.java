package com.example.agenda.service;

import java.util.List;

import com.example.agenda.pojos.Personas;

public interface IService {

	public List<Personas> list();
	
	public Personas get(Integer id);
	
	public void update(Personas p);
	
	public void add(Personas p);
	
	public void delete(Personas p) ;
}
