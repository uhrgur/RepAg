package com.example.agenda.service;

import com.example.agenda.DAO.DAO;

public class Service implements IService{

	@Override
	public void getContactos() {

		DAO.getContactos();
		
	}

	
	
}
