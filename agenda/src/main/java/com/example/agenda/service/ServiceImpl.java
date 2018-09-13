package com.example.agenda.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.pojos.Personas;
import com.example.agenda.DAO.IDAO;

@Service
@Transactional
public class ServiceImpl implements IService{

	@Autowired
	private IDAO personaDAO;

	@Override
	public List<Personas> list() {
		return personaDAO.findAll();
	}

	@Override
	public Personas get(Integer id) {
		return personaDAO.findById(id).get();
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
	
	@Override
	public List<Personas> getPersona(String nombre){
		return personaDAO.find(nombre);
	}
}
