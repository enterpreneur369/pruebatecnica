package com.miempresa.servicio;

import java.util.List;

import com.miempresa.modelo.Estudiante;

public interface IEstudianteServicio {
	
	public Integer registrar(Estudiante estudiante) throws Exception;
	public Integer modificar(Estudiante estudiante) throws Exception;
	public Integer eliminar(Estudiante estudiante) throws Exception;
	public Estudiante buscarUnoPorId(Estudiante estudiante) throws Exception;
	public List<Estudiante> buscarTodos() throws Exception;
	public List<Estudiante> buscarTodosPorCurso(String curso) throws Exception;
	public List<Estudiante> buscarTodosPorSede(String sede) throws Exception;
	public List<Estudiante> buscarTodosPorCiudad(String ciudad) throws Exception;
	public String obtenerTitulo() throws Exception;
}
