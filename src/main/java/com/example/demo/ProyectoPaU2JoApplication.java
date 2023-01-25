package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private IHabitacionService habitacionService;
	@Autowired
	private IHotelService hotelService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
		
		


	
	//List<Habitacion> habitaciones= new ArrayList<>();
	
		Hotel hotel= new Hotel();
	hotel.setNombre("Hotel Palacios");
	hotel.setDireccion("Bellavista Calderon");
	//this.hotelService.insertar(hotel);
	
	/*	
	Habitacion habitacion= new Habitacion();
	
	habitacion.setNumero("AA5478");

	habitacion.setHotel(hotel);
	*/
	
//	this.habitacionService.insertar(habitacion);

/*	
	Habitacion habitacion2= new Habitacion();
	
	habitacion2.setNumero("EE1578");

	habitacion2.setHotel(hotel);
	
	*/
	//this.habitacionService.insertar(habitacion2);
	
Habitacion habitacion9= new Habitacion();
	
	habitacion9.setNumero("JPLS");

	habitacion9.setHotel(hotel);
	
	
	//this.habitacionService.insertar(habitacion9);
	
	
	

	Hotel hotelbuscar= this.hotelService.buscar(28);
	System.out.println(hotelbuscar.getNombre());
	hotelbuscar.getHabitaciones().forEach(t ->System.out.println(t.getNumero()+ " " + t.getId()));



	

	
	
	
	}

}
