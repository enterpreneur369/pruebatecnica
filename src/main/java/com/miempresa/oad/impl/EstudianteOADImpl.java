package com.miempresa.oad.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.miempresa.modelo.Estudiante;
import com.miempresa.oad.IEstudianteOAD;

//@Named
@Stateless
public class EstudianteOADImpl implements IEstudianteOAD, Serializable {
	
	@PersistenceContext(unitName = "asistenciaUP")
	private EntityManager em;
	//private EntityManagerFactory emf;
	//private EntityManager em;
	
	/*
	@PostConstruct
	public void init() {
		emf = Persistence.createEntityManagerFactory("asistenciaUP");
		em = emf.createEntityManager();
	}*/

	@Override
	public Integer registrar(Estudiante estudiante) throws Exception {
		/*try {
			em.getTransaction().begin();
			em.persist(estudiante);
			em.getTransaction().commit();
	
		} catch (Exception ex) {
			em.getTransaction().rollback();
		}*/
		em.persist(estudiante);
		return estudiante.getId();
	}

	@Override
	public Integer modificar(Estudiante estudiante) throws Exception {
		em.merge(estudiante);
		return estudiante.getId();
	}

	@Override
	public Integer eliminar(Estudiante estudiante) throws Exception {
		em.remove(em.merge(estudiante));
		return 1;
	}

	@Override
	public Estudiante buscarPorId(Estudiante t) throws Exception {
		Query q = em.createQuery("FROM Estudiante e WHERE e.id = ?1");
		q.setParameter(1, t.getId());
		List<Estudiante> lista = (List<Estudiante>) q.getResultList();
		return lista != null && !lista.isEmpty() ? lista.get(0) : new Estudiante();
	}

	@Override
	public List<Estudiante> buscarTodosPorCurso(String curso) throws Exception {
		Query q = em.createQuery("FROM Estudiante e WHERE e.curso = ?1");
		q.setParameter(1, curso);
		List<Estudiante> lista =  (List<Estudiante>) q.getResultList();
		return lista != null && !lista.isEmpty() ? lista : new ArrayList<Estudiante>();
	}

	@Override
	public List<Estudiante> buscarTodosPorSede(String sede) throws Exception {
		Query q = em.createQuery("FROM Estudiante e WHERE e.sede = ?1");
		q.setParameter(1, sede);
		List<Estudiante> lista =  (List<Estudiante>) q.getResultList();
		return lista != null && !lista.isEmpty() ? lista : new ArrayList<Estudiante>();
	}

	@Override
	public List<Estudiante> buscarTodosPorCiudad(String ciudad) throws Exception {
		Query q = em.createQuery("FROM Estudiante e WHERE e.ciudad = ?1");
		q.setParameter(1, ciudad);
		List<Estudiante> lista =  (List<Estudiante>) q.getResultList();
		return lista != null && !lista.isEmpty() ? lista : new ArrayList<Estudiante>();
	}

	@Override
	public List<Estudiante> buscarTodos() throws Exception {
		Query q = em.createQuery("FROM Estudiante e");
		return (List<Estudiante>) q.getResultList();
	}
}
