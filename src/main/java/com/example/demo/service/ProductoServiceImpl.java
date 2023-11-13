package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDAO;
import com.example.demo.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IProductoDAO iProductoDAO;
	
	@Override
	public List<Producto> listarProductos() {
		
		return iProductoDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto Producto) {
		
		return iProductoDAO.save(Producto);
	}

	@Override
	public Producto ProductoXID(Long id) {
		
		return iProductoDAO.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto Producto) {
		
		return iProductoDAO.save(Producto);
	}

	@Override
	public void eliminarProducto(Long id) {
		
		iProductoDAO.deleteById(id);
		
	}

}
