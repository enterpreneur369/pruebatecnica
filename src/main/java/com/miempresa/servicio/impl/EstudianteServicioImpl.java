package com.miempresa.servicio.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.xml.ws.BindingProvider;

import com.miempresa.modelo.Estudiante;
import com.miempresa.oad.IEstudianteOAD;
import com.miempresa.servicio.IEstudianteServicio;
import com.miempresa.servicio.impl.consumo.ServicioWeb;
import com.miempresa.servicio.impl.consumo.ServicioWebService;

@Named
public class EstudianteServicioImpl implements IEstudianteServicio, Serializable {
	
	//@Inject
	@EJB
	private IEstudianteOAD oad;
	
	@Override
	public Integer registrar(Estudiante estudiante) throws Exception {
		return oad.registrar(estudiante);
	}

	@Override
	public Integer modificar(Estudiante estudiante) throws Exception {
		return oad.modificar(estudiante);
	}

	@Override
	public Integer eliminar(Estudiante estudiante) throws Exception {
		return oad.eliminar(estudiante);
	}

	@Override
	public List<Estudiante> buscarTodos() throws Exception {
		return oad.buscarTodos();
	}

	@Override
	public List<Estudiante> buscarTodosPorCurso(String curso) throws Exception {
		return oad.buscarTodosPorCurso(curso);
	}

	@Override
	public List<Estudiante> buscarTodosPorSede(String sede) throws Exception {
		return oad.buscarTodosPorSede(sede);
	}

	@Override
	public List<Estudiante> buscarTodosPorCiudad(String ciudad) throws Exception {
		return oad.buscarTodosPorCiudad(ciudad);
	}

	@Override
	public Estudiante buscarUnoPorId(Estudiante estudiante) throws Exception {
		return oad.buscarPorId(estudiante);
	}
	
	@Override
	public String obtenerTitulo() {
		String titulo = "";
		try {
			ServicioWebService servicioWebServicio = new ServicioWebService();
			ServicioWeb servicioWeb = servicioWebServicio.getServicioWebPort();
			
			Map<String, Object> mapaRequerido = ((BindingProvider) servicioWeb).getRequestContext();
			mapaRequerido.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/ProyectoAsistenciaColegio/ServicioWeb?wsdl");
			
			titulo = servicioWeb.saludar();
		} catch(Exception ex) {
			
		}
		return titulo;
	}

}
