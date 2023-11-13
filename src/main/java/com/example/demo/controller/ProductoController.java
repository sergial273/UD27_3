package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Producto;
import com.example.demo.service.ProductoServiceImpl;


@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl ProductoServideImpl;
	
	@GetMapping("/Productos")
	public List<Producto> listarProductos(){
		return ProductoServideImpl.listarProductos();
	}
	
	@PostMapping("/Productos")
	public Producto salvarProducto(@RequestBody Producto Producto) {
		
		return ProductoServideImpl.guardarProducto(Producto);
	}
	
	@GetMapping("/Productos/{id}")
	public Producto ProductoXID(@PathVariable(name="id") Long id) {
		
		Producto Producto_xid= new Producto();
		
		Producto_xid=ProductoServideImpl.ProductoXID(id);
		
		System.out.println("Cliente XID: " + Producto_xid);
		
		return Producto_xid;
	}
	
	@PutMapping("/Productos/{id}")
	public Producto actualizarProducto(@PathVariable(name="id")Long id,@RequestBody Producto Producto) {
		
		Producto Producto_seleccionado= new Producto();
		Producto Producto_actualizado= new Producto();
		
		Producto_seleccionado= ProductoServideImpl.ProductoXID(id);
		
		Producto_seleccionado.setNombre(Producto.getNombre());
		Producto_seleccionado.setPrecio(Producto.getPrecio());
		
		Producto_actualizado = ProductoServideImpl.actualizarProducto(Producto_seleccionado);
		
		System.out.println("El Producto actualizado es: "+ Producto_actualizado);
		
		return Producto_actualizado;
	}
	
	@DeleteMapping("/Productos/{id}")
	public void eleiminarProducto(@PathVariable(name="id")Long id) {
		ProductoServideImpl.eliminarProducto(id);
	}
	
	
}
