package com.miempresa.controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.miempresa.modelo.Estudiante;
import com.miempresa.servicio.IEstudianteServicio;

@Named
@ViewScoped
public class RegistroFrijol implements Serializable {
	
	@Inject
	private IEstudianteServicio estudianteServicio;
	private Estudiante estudiante;
	
	@PostConstruct
	public void init() {
		this.estudiante = new Estudiante();
	}

	public String registrar() {
		try {
			this.estudianteServicio.registrar(estudiante);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "index?faces-redirect=true";
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	
	
}
