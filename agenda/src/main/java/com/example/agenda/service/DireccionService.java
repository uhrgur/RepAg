package com.example.agenda.service;

import java.util.List;

import com.example.agenda.pojos.Direccion;

public interface DireccionService {

	public List<Direccion> list();

	public Direccion get(Integer id);

	public void update(Direccion d);

	public void add(Direccion d);

	public void delete(Direccion d);
}
