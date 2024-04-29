package com.miempresa.servicio.impl;

import java.io.Serializable;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.miempresa.servicio.IServicioWeb;

@WebService
public class ServicioWeb implements IServicioWeb, Serializable {

	@WebMethod
	@Override
	public String saludar() {
		return "Estudiantes";
	}

}
