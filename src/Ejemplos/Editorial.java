package Ejemplos;

import java.util.HashSet;
import java.util.Set;

public class Editorial{
    private String nombre;
    private Set<Libro> libros;

    public Editorial(String nombre){
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    //Además del setter por defecto, creamos otro para poder añadir un EjerciciosAcabados.Libro
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }
    //Se omiten getters y setters

}
