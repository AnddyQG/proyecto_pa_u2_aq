package com.example.demo.uce.service;



import com.example.demo.uce.modelo.Estudiante;


public interface IEstudianteService {


	public void agregar(Estudiante estudiante);
    public void modificar(Estudiante estudiante);

    //CRUD siempre por PK
    public Estudiante buscar(Integer id);
    //CRUD siempre por PK
    public void eliminar(Integer id );

}
