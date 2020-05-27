package com.sumset.biblioteca.modelos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sumset.biblioteca.modelos.entidades.Prestamo;

public interface IPrestamoDao extends JpaRepository<Prestamo,Long>{

	@Query("from Prestamo")
	public List<Prestamo> findAllPrestamos();
	
}
