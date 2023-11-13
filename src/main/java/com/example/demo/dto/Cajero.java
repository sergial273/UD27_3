package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cajeros")
public class Cajero {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany
    @JoinColumn(name="id")
    private List<Venta> ventas;

    
    // Constructores
	public Cajero() {
		
	}

	public Cajero(Long id, String nombre, List<Venta> ventas) {
		this.id = id;
		this.nombre = nombre;
		this.ventas = ventas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the registroCurso
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getMaquinas() {
		return ventas;
	}

	public void setMaquinas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", nombre=" + nombre + "]";
	}



}