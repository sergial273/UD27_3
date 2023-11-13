package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajeroDAO;
import com.example.demo.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listarCajeros() {
		
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero Cajero) {
		
		return iCajeroDAO.save(Cajero);
	}

	@Override
	public Cajero CajeroXID(Long id) {
		
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero Cajero) {
		
		return iCajeroDAO.save(Cajero);
	}

	@Override
	public void eliminarCajero(Long id) {
		
		iCajeroDAO.deleteById(id);
		
	}

}
