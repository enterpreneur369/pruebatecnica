package com.miempresa.oad;

import java.util.List;

public interface ICLAB<T> {
	Integer registrar(T t) throws Exception; 
	Integer modificar(T t) throws Exception; 
	Integer eliminar(T t) throws Exception; 
	T buscarPorId(T t) throws Exception;  	
	List<T> buscarTodos() throws Exception;
}
