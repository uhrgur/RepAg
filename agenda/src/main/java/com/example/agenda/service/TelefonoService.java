package com.example.agenda.service;

import java.util.List;

import com.example.agenda.pojos.Telefonos;

public interface TelefonoService {

	public List<Telefonos> list();

	public Telefonos get(Integer id);

	public void update(Telefonos t);

	public void add(Telefonos t);

	public void delete(Telefonos t);
}
