package com.example.agenda.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.DAO.TelefonoDao;
import com.example.agenda.pojos.Telefonos;

@Service
@Transactional
public class TelefonoServiceImpl implements TelefonoService {

	@Autowired
	private TelefonoDao dao;

	@Override
	public List<Telefonos> list() {
		return dao.findAll();
	}

	@Override
	public Telefonos get(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void update(Telefonos t) {
		dao.save(t);
	}

	@Override
	public void add(Telefonos t) {
		dao.save(t);
	}

	@Override
	public void delete(Telefonos t) {
		dao.delete(t);
	}
	
	
}
