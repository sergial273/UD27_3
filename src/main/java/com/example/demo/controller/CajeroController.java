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


import com.example.demo.dto.Cajero;
import com.example.demo.service.CajeroServiceImpl;



@RestController
@RequestMapping("/api")
public class CajeroController {
	
	@Autowired
	CajeroServiceImpl CajeroServideImpl;
	
	
	@GetMapping("/Cajeros")
	public List<Cajero> listarCajeros(){
		return CajeroServideImpl.listarCajeros();
	}
	
	@PostMapping("/Cajeros")
	public Cajero salvarCajero(@RequestBody Cajero Cajero) {
		
		return CajeroServideImpl.guardarCajero(Cajero);
	}
	
	@GetMapping("/Cajeros/{id}")
	public Cajero CajeroXID(@PathVariable(name="id") Long id) {
		
		Cajero Cajero_xid= new Cajero();
		
		Cajero_xid=CajeroServideImpl.CajeroXID(id);
		
		System.out.println("Cliente XID: " + Cajero_xid);
		
		return Cajero_xid;
	}
	
	@PutMapping("/Cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name="id")Long id,@RequestBody Cajero Cajero) {
		
		Cajero Cajero_seleccionado= new Cajero();
		Cajero Cajero_actualizado= new Cajero();
		
		Cajero_seleccionado= CajeroServideImpl.CajeroXID(id);
		
		Cajero_seleccionado.setNombre(Cajero.getNombre());
		
		Cajero_actualizado = CajeroServideImpl.actualizarCajero(Cajero_seleccionado);
		
		System.out.println("El Cajero actualizado es: "+ Cajero_actualizado);
		
		return Cajero_actualizado;
	}
	
	@DeleteMapping("/Cajeros/{id}")
	public void eleiminarCajero(@PathVariable(name="id")Long id) {
		CajeroServideImpl.eliminarCajero(id);
	}
	
	
}