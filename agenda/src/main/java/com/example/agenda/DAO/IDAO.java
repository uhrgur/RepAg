package com.example.agenda.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.agenda.pojos.Personas;


	@Repository
	public interface IDAO extends JpaRepository<Personas,Integer>{
	}
