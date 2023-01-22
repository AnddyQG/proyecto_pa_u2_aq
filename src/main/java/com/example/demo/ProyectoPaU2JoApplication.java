package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu= new Estudiante();
		//estu.setId(1);
		estu.setNombre("Anddy");
		estu.setApellido("Quisilema");
		estu.setCedula("1721483814");
		estu.setCiudad("Guayaquil");
		estu.setGenero("Masculino");
		
	
		estu.setCedula("09854321");
		
	
		this.estudianteService.agregar(estu);
		Estudiante estub= this.estudianteService.buscar(1);
		System.out.println("Cedula del estudiante buscado "+estub.getCedula());
		System.out.println("-----------------");
		
		
		//ciudadano
		Ciudadano ciu= new Ciudadano();
		ciu.setNombre("Anddy");
		ciu.setApellido("Quisilema");
		this.ciudadanoService.agregar(ciu);
		System.out.println("Actualizando el nombre del ciudadano 1");
		ciu.setNombre("Rafael");
		this.ciudadanoService.modificar(ciu);
		Ciudadano ciudadanob=this.ciudadanoService.buscar(1);
		System.out.println("Apellido del ciudadano buscado "+ciudadanob.getApellido());
		System.out.println("Nuevo ciudadano");
		
		Ciudadano ciu2= new Ciudadano();
		ciu2.setNombre("Eddy");
		ciu2.setApellido("Guacollante");
		this.ciudadanoService.agregar(ciu2);
		
		System.out.println("------------------");
		//empleado
		
		Empleado empl= new Empleado();
		empl.setCiudadano(ciu);
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		this.empleadoService.agregar(empl);
		Empleado empleadob=  this.empleadoService.buscar(1);
	System.out.println("Salario del empleado buscado " + empleadob.getSalario());
		
	
	
	
	
	}

}
