package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.IAutorService;
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
	
	@Autowired
	private IAutorService autorService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
		Autor autor1 = new Autor();
		 Autor autor2 = new Autor();
		 Autor autor3 = new Autor();
		 Autor autor4 = new Autor();
		 Autor autor5 = new Autor();
		 autor1.setNombre("WS");
	 autor2.setNombre("fran");
		autor3.setNombre("WS");
		 autor4.setNombre("luis");
	autor5.setNombre("Julio");
		 Set<Libro> libros1 = new HashSet<>();
	 Set<Libro> libros2 = new HashSet<>();
		Libro libro1 = new Libro();
		 libro1.setNombre("P. Web");
		 libro1.setEditorial("Pqq");
		 Set<Autor> autors1 = new HashSet<>();
		 autors1.add(autor1);
		 autors1.add(autor3);
		 libro1.setAutores(autors1);
		libros1.add(libro1);
		 Libro libro2 = new Libro();
		libro2.setNombre("Redes");
		 libro2.setEditorial("Patito");
		Set<Autor> autors2 = new HashSet<>();
		 autors2.add(autor1);
		autors2.add(autor4);
		 autors2.add(autor5);
		 libro2.setAutores(autors1);
		 libros2.add(libro2);
		 autor1.setLibros(libros2);
	 this.autorService.insertar(autor1);
		

		
		
		
		
	
		
		
	
	
	}

}
