package com.mycompany.jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logica.Alumno;
import logica.Carrera;
import logica.Controller;
import logica.Materia;

public class JpaPrueba {

    public static void main(String[] args) {

        Controller controlar = new Controller();
        
         LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
         Carrera car = new Carrera(1, "sistemas", listaMaterias);
        controlar.crearCarrera(car);

         

        //creacion Materia
        Materia mat = new Materia(1, "base Datos", "Semestral", car);
        controlar.crearMateria(mat);

        Materia mat1 = new Materia(2, "programacion", "semestral", car);
        controlar.crearMateria(mat1);

        
        //lista 
       
        listaMaterias.add(mat);
        listaMaterias.add(mat1);
        
        
        car.setListaMaterias(listaMaterias);
        controlar.editarCarrera(car);
        
        //creacion carrera
        
        Alumno alum = new Alumno(2, "luis", "grimaldi", new Date(), car);
        controlar.crearAlumno(alum);

        System.out.println("datos alumnos");
        Alumno alumno = controlar.traerAlumno(2);
        System.out.println(alumno.getNombre() + alumno.getApellido());
        System.out.println("cursa la carrera de: " + alumno.getCarrera().getNombre());
    }
}
