package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinaDAO;
import com.example.demo.dto.Maquina;

@Service
public class MaquinaServiceImpl implements IMaquinaService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IMaquinaDAO iMaquinaDAO;
	
	@Override
	public List<Maquina> listarMaquinas() {
		
		return iMaquinaDAO.findAll();
	}

	@Override
	public Maquina guardarMaquina(Maquina Maquina) {
		
		return iMaquinaDAO.save(Maquina);
	}

	@Override
	public Maquina MaquinaXID(Long id) {
		
		return iMaquinaDAO.findById(id).get();
	}

	@Override
	public Maquina actualizarMaquina(Maquina Maquina) {
		
		return iMaquinaDAO.save(Maquina);
	}

	@Override
	public void eliminarMaquina(Long id) {
		
		iMaquinaDAO.deleteById(id);
		
	}

}
