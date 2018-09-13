package com.example.agenda.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.agenda.pojos.Direccion;

@Repository
public interface DireccionDao extends JpaRepository<Direccion, Integer>{

}
