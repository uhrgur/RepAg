package com.example.agenda.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DAO implements CustomDao {

	 @PersistenceContext
	    EntityManager entityManager;

}
