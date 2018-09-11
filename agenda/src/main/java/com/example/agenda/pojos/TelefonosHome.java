package com.example.agenda.pojos;
// Generated 11-sep-2018 9:09:36 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Telefonos.
 * @see pojos.Telefonos
 * @author Hibernate Tools
 */
@Stateless
public class TelefonosHome {

	private static final Log log = LogFactory.getLog(TelefonosHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Telefonos transientInstance) {
		log.debug("persisting Telefonos instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Telefonos persistentInstance) {
		log.debug("removing Telefonos instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Telefonos merge(Telefonos detachedInstance) {
		log.debug("merging Telefonos instance");
		try {
			Telefonos result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Telefonos findById(Integer id) {
		log.debug("getting Telefonos instance with id: " + id);
		try {
			Telefonos instance = entityManager.find(Telefonos.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
