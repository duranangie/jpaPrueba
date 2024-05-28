package logica;

import java.util.ArrayList;
import persistencia.controllersPersistence;

public class Controller {

    controllersPersistence control = new controllersPersistence();

    public void crearAlumno(Alumno alu) {

        control.crearAlumno(alu);

    }

    public void eliminarAlumno(int id) {

        control.eliminarAlumno(id);
    }

    public void editarAlumno(Alumno alu) {
        control.editarAlumno(alu);
    }

    public Alumno traerAlumno(int id) {
        return control.traerAlumno(id);
    }

    public ArrayList<Alumno> traerAlumnos() {
        return control.traerAlumnos();
    }

    /*carrera*/
    public void crearCarrera(Carrera car) {

        control.crearCarrera(car);

    }

    public void eliminarCarrera(int id) {

        control.eliminarCarrera(id);
    }

    public void editarCarrera(Carrera car) {
        control.editarCarrera(car);
    }

    public Carrera traerCarrera(int id) {
        return control.traerCarrera(id);
    }

    public ArrayList<Carrera> traerCarreras() {
        return control.traerCarreras();
    }

    // MATERIA
    
     public void crearMateria(Materia mat) {

        control.crearMateria(mat);

    }

    public void eliminarMateria(int id) {

        control.eliminarMateria(id);
    }

    public void editarMateria(Materia mat) {
        control.editarMateria(mat);
    }

    public Materia traerMateria(int id) {
        return control.traerMateria(id);
    }

    public ArrayList<Materia> traerMaterias() {
        return control.traerMaterias();
    }
}
