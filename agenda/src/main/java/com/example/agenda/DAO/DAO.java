package com.example.agenda.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.agenda.pojos.Personas;

@Repository
@Transactional
public class DAO implements PersonasRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;
}
