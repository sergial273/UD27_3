package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="maquinas")
public class Maquina {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int piso;

    @OneToMany
    @JoinColumn(name="id")
    private List<Venta> ventas;

    

    // Constructores
	public Maquina() {
		
	}

	public Maquina(Long id, int piso, List<Venta> ventas) {
		this.id = id;
		this.piso = piso;
		this.ventas = ventas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getProductos() {
		return ventas;
	}

	public void setProductos(List<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Maquina [id=" + id + ", piso=" + piso + "]";
	}


}
