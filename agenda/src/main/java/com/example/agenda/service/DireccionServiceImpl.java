package com.example.agenda.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.DAO.DireccionDao;
import com.example.agenda.pojos.Direccion;

@Service
@Transactional
public class DireccionServiceImpl implements DireccionService{

	@Autowired
	private DireccionDao dao;
	
	@Override
	public List<Direccion> list() {
		return dao.findAll();
	}

	@Override
	public Direccion get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void update(Direccion d) {
		dao.save(d);
	}

	@Override
	public void add(Direccion d) {
		dao.save(d);
	}

	@Override
	public void delete(Direccion d) {
		dao.delete(d);
	}

}
