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

import com.example.demo.dto.Maquina;
import com.example.demo.service.MaquinaServiceImpl;


@RestController
@RequestMapping("/api")
public class MaquinaController {
	
	@Autowired
	MaquinaServiceImpl MaquinaServideImpl;
	
	@GetMapping("/Maquinas")
	public List<Maquina> listarMaquinas(){
		return MaquinaServideImpl.listarMaquinas();
	}
	
	@PostMapping("/Maquinas")
	public Maquina salvarMaquina(@RequestBody Maquina Maquina) {
		
		return MaquinaServideImpl.guardarMaquina(Maquina);
	}
	
	@GetMapping("/Maquinas/{id}")
	public Maquina MaquinaXID(@PathVariable(name="id") Long id) {
		
		Maquina Maquina_xid= new Maquina();
		
		Maquina_xid=MaquinaServideImpl.MaquinaXID(id);
		
		System.out.println("Cliente XID: " + Maquina_xid);
		
		return Maquina_xid;
	}
	
	@PutMapping("/Maquinas/{id}")
	public Maquina actualizarMaquina(@PathVariable(name="id")Long id,@RequestBody Maquina Maquina) {
		
		Maquina Maquina_seleccionado= new Maquina();
		Maquina Maquina_actualizado= new Maquina();
		
		Maquina_seleccionado= MaquinaServideImpl.MaquinaXID(id);
		
		Maquina_seleccionado.setPiso(Maquina.getPiso());
		
		Maquina_actualizado = MaquinaServideImpl.actualizarMaquina(Maquina_seleccionado);
		
		System.out.println("El Maquina actualizado es: "+ Maquina_actualizado);
		
		return Maquina_actualizado;
	}
	
	@DeleteMapping("/Maquinas/{id}")
	public void eleiminarMaquina(@PathVariable(name="id")Long id) {
		MaquinaServideImpl.eliminarMaquina(id);
	}
	
	
}