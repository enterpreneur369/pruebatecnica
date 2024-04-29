package com.miempresa.oad;

import java.util.List;

import javax.ejb.Local;

import com.miempresa.modelo.Estudiante;


@Local
public interface IEstudianteOAD extends ICLAB<Estudiante> {
	public List<Estudiante> buscarTodosPorCurso(String curso) throws Exception;
	public List<Estudiante> buscarTodosPorSede(String sede) throws Exception;
	public List<Estudiante> buscarTodosPorCiudad(String ciudad) throws Exception;	
}
