package com.miempresa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false, length = 50)
	private String nombres;
	@Column(nullable = false, length = 50)
	private String apellidos;
	@Column(nullable = false, length = 50)
	private String ciudad;
	@Column(nullable = false, length = 1)
	private String sede;
	@Column(nullable = false, length = 50)
	private String curso;
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getSede() {
		return sede;
	}
	public String getCurso() {
		return curso;
	}
	
	
	
}
