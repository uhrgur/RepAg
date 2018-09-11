package com.example.agenda.pojos;
// Generated 11-sep-2018 9:09:36 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Departamentos.
 * @see pojos.Departamentos
 * @author Hibernate Tools
 */
@Stateless
public class DepartamentosHome {

	private static final Log log = LogFactory.getLog(DepartamentosHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Departamentos transientInstance) {
		log.debug("persisting Departamentos instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Departamentos persistentInstance) {
		log.debug("removing Departamentos instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Departamentos merge(Departamentos detachedInstance) {
		log.debug("merging Departamentos instance");
		try {
			Departamentos result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Departamentos findById(Integer id) {
		log.debug("getting Departamentos instance with id: " + id);
		try {
			Departamentos instance = entityManager.find(Departamentos.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
