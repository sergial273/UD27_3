package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Venta;


public interface IVentaService {

	//Metodos del CRUD
		public List<Venta> listarVenta(); //Listar All 
		
		public Venta guardarVenta(Venta Venta);	//Guarda un Venta CREATE
		
		public Venta VentaXID(Long id); //Leer datos de un Venta READ
		
		public Venta actualizarVenta(Venta Venta); //Actualiza datos del Venta UPDATE
		
		public void eliminarVenta(Long id);// Elimina el Venta DELETE
	
}
