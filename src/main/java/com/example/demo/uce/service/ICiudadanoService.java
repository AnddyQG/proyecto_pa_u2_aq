package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoService {
public void agregar(Ciudadano ciudadano);
public void modificar(Ciudadano ciudadano);
public Ciudadano buscar(Integer id);
public void eliminar(Integer id);
}
