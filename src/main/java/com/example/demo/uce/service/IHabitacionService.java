package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionService {

	public void insertar(Habitacion habitacion);
	public void modificar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void eliminar(Integer id);
	
}
