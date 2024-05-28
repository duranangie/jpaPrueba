package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;
import logica.Carrera;
import logica.Materia;
import persistencia.exceptions.NonexistentEntityException;

public class controllersPersistence {

    AlumnoJpaController alumnojpa = new AlumnoJpaController();
    CarreraJpaController carjpa = new CarreraJpaController();
    MateriaJpaController materjpa = new MateriaJpaController();

    public Alumno traerAlumno;

    public void crearAlumno(Alumno alu) {
        alumnojpa.create(alu);

    }

    public void eliminarAlumno(int id) {
        try {
            alumnojpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllersPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editarAlumno(Alumno alu) {

        try {
            alumnojpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(controllersPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Alumno traerAlumno(int id) {
        return alumnojpa.findAlumno(id);

    }

    public ArrayList<Alumno> traerAlumnos() {
        List<Alumno> listita = alumnojpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);
        return listaAlumnos;

    }

    /*CARRERA*/

    public void crearCarrera(Carrera car) {
        carjpa.create(car);

    }

    public void eliminarCarrera(int id) {
        try {
            carjpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllersPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editarCarrera(Carrera car) {

        try {
            carjpa.edit(car);
        } catch (Exception ex) {
            Logger.getLogger(controllersPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Carrera traerCarrera(int id) {

        return carjpa.findCarrera(id);

    }

    public ArrayList<Carrera> traerCarreras() {
        List<Carrera> lista = carjpa.findCarreraEntities();
        ArrayList<Carrera> listaCarrera = new ArrayList<Carrera>(lista);
        return listaCarrera;

    }

    public void crearMateria(Materia mat) {

        materjpa.create(mat);
    }

    public void eliminarMateria(int id) {
        try {
            materjpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllersPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mat) {
        try {
            materjpa.edit(mat);
        } catch (Exception ex) {
            Logger.getLogger(controllersPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
             return materjpa.findMateria(id);
      
        
       }

    public ArrayList<Materia> traerMaterias() {
        List<Materia> listaMateria = materjpa.findMateriaEntities();
        ArrayList<Materia> listMa = new ArrayList<Materia>(listaMateria);
        return listMa;
    }

}
