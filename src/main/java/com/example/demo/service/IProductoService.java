package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Producto;


public interface IProductoService {
	
	//Metodos del CRUD
		public List<Producto> listarProductos(); //Listar All 
		
		public Producto guardarProducto(Producto Producto);	//Guarda un cliente CREATE
		
		public Producto ProductoXID(Long id); //Leer datos de un cliente READ
		
		public Producto actualizarProducto(Producto Producto); //Actualiza datos del cliente UPDATE
		
		public void eliminarProducto(Long id);// Elimina el cliente DELETE

}
