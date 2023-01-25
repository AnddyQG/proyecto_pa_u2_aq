package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel=this.entityManager.find(Hotel.class, id);
		hotel.getHabitaciones().size();
		return hotel;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel=this.buscar(id);
		this.entityManager.remove(hotel);
		
	}

	@Override
	public Hotel buscarligero(Integer id) {
		return this.entityManager.find(Hotel.class, id);
		
	
	}
	
	

}
