package com.sumset.biblioteca.modelos.servicios;

import java.util.List;

import com.sumset.biblioteca.modelos.entidades.Prestamo;

public interface IPrestamoServices {

	public Prestamo findById(Long id);

	public Prestamo save(Prestamo prestamo);
	
	public List<Prestamo> findAllPrestamos();
	
}
