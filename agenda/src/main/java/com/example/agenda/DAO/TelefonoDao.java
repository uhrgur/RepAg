package com.example.agenda.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.agenda.pojos.Telefonos;

@Repository
public interface TelefonoDao extends JpaRepository<Telefonos, Integer> {

}
