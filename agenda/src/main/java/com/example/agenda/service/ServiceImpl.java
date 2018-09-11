package com.example.agenda.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.DAO.DAO;
import com.example.agenda.DAO.IDAO;
import com.example.agenda.pojos.Personas;


@Service
@Transactional
public class ServiceImpl implements IService{

	
	@Autowired
	private IDAO DAO;
	
	
	@Override
	public List<Personas> list() {
		// TODO Auto-generated method stub
		return null;
		//return DAO.findAll();
	}	
	
}
