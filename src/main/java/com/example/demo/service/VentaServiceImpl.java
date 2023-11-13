package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaDAO;
import com.example.demo.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService {
	
	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVenta() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta curso) {
		return iVentaDAO.save(curso);
	}

	@Override
	public Venta VentaXID(Long id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta curso) {
		return iVentaDAO.save(curso);
	}

	@Override
	public void eliminarVenta(Long id) {
		iVentaDAO.deleteById(id);
	}

}