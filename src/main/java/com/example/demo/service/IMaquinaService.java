package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Maquina;


public interface IMaquinaService {
	
	//Metodos del CRUD
		public List<Maquina> listarMaquinas(); //Listar All 
		
		public Maquina guardarMaquina(Maquina Maquina);	//Guarda un cliente CREATE
		
		public Maquina MaquinaXID(Long id); //Leer datos de un cliente READ
		
		public Maquina actualizarMaquina(Maquina Maquina); //Actualiza datos del cliente UPDATE
		
		public void eliminarMaquina(Long id);// Elimina el cliente DELETE

}
