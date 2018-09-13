package com.example.agenda.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.example.agenda.pojos.Personas;

@Repository
@Transactional
public class DAO implements CustomDao {

	 @PersistenceContext
	    EntityManager entityManager;

	/*@Override
	public List<Personas> find(String nombre) {
		Query query = entityManager.createNativeQuery("SELECT * FROM personas p WHERE p.nombre LIKE ?", Personas.class);
		query.setParamater(1, nombre+"%");
		return query.getReturnList();
	}*/

}
