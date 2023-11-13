package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cajero;


public interface ICajeroService {
	
	//Metodos del CRUD
		public List<Cajero> listarCajeros(); //Listar All 
		
		public Cajero guardarCajero(Cajero Cajero);	//Guarda un cliente CREATE
		
		public Cajero CajeroXID(Long id); //Leer datos de un cliente READ
		
		public Cajero actualizarCajero(Cajero Cajero); //Actualiza datos del cliente UPDATE
		
		public void eliminarCajero(Long id);// Elimina el cliente DELETE

}
