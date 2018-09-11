package com.example.agenda.pojos;
// Generated 11-sep-2018 9:09:36 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Categorias.
 * @see pojos.Categorias
 * @author Hibernate Tools
 */
@Stateless
public class CategoriasHome {

	private static final Log log = LogFactory.getLog(CategoriasHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Categorias transientInstance) {
		log.debug("persisting Categorias instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Categorias persistentInstance) {
		log.debug("removing Categorias instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Categorias merge(Categorias detachedInstance) {
		log.debug("merging Categorias instance");
		try {
			Categorias result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Categorias findById(Integer id) {
		log.debug("getting Categorias instance with id: " + id);
		try {
			Categorias instance = entityManager.find(Categorias.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
