package com.example.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.agenda.pojos.Personas;
import com.example.agenda.DAO.IDAO;

public class ServiceImpl implements IService{

	@Autowired
	private IDAO personaDAO;
	
	@Override
	public List<Personas> list() {
		return personaDAO.findAll();
	}

	@Override
	public Personas get(Integer id) {
		return personaDAO.findOne(id);
	}

	@Override
	public void update(Personas p) {
		personaDAO.save(p);
	}

	@Override
	public void add(Personas p) {
		personaDAO.save(p);
	}

	@Override
	public void delete(Personas p) {
		personaDAO.delete(p);
	}
}
