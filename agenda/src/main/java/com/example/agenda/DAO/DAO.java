package com.example.agenda.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.agenda.pojos.Personas;
@Repository
@Transactional
public class DAO implements CustomDao {

	 @PersistenceContext
	    EntityManager entityManager;

	@Override
	public List<Personas> getFirstNamesLike(String username) {
		// TODO Auto-generated method stub
		return null;
	}


}
