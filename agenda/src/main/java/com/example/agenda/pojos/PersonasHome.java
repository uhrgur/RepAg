package com.example.agenda.pojos;
// Generated 11-sep-2018 9:09:36 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Personas.
 * @see pojos.Personas
 * @author Hibernate Tools
 */
@Stateless
public class PersonasHome {

	private static final Log log = LogFactory.getLog(PersonasHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Personas transientInstance) {
		log.debug("persisting Personas instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Personas persistentInstance) {
		log.debug("removing Personas instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Personas merge(Personas detachedInstance) {
		log.debug("merging Personas instance");
		try {
			Personas result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Personas findById(Integer id) {
		log.debug("getting Personas instance with id: " + id);
		try {
			Personas instance = entityManager.find(Personas.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
