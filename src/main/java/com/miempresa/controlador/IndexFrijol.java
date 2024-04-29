package com.miempresa.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import com.miempresa.modelo.Estudiante;
import com.miempresa.servicio.IEstudianteServicio;
import com.miempresa.servicio.impl.consumo.ServicioWebService;

@Named
@RequestScoped
public class IndexFrijol implements Serializable {
	@Inject
	private IEstudianteServicio servicio;
	private List<Estudiante> estudiantes;
	private List<Estudiante> estudiantesFiltrados;
	private String titulo;
	//private Exporter<DataTable> exporter;
	
	
	public void listar() {
		try {
			this.estudiantes = this.servicio.buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void editarFila(RowEditEvent evento) {
		try {
			this.servicio.modificar((Estudiante) evento.getObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String eliminarEstudiante(Estudiante estudiante) {
		try {
			this.servicio.eliminar(estudiante);
			this.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index?faces-redirect=true";
	}
	
	
	@PostConstruct
	public void init() {
		try {
			titulo = this.servicio.obtenerTitulo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.listar();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Estudiante> getEstudiantesFiltrados() {
		return estudiantesFiltrados;
	}

	public void setEstudiantesFiltrados(List<Estudiante> estudiantesFiltrados) {
		this.estudiantesFiltrados = estudiantesFiltrados;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
}
