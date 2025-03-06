package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que agrupa los libros
 * @see Libro para ver el metodo de libro
 * @author Mariano Criado Prados
 * @version 6.3.2025
 * @see <a href="https://github.com/MCRIADO99/T2_MarianoCriado">...</a>
 */
public class Biblioteca {
    /**
     * Lista de libros
     * @see Libro para ver el metodo de libro
     */
    private final List<Libro> libros;

    /**
     * Metodo de creacion de la lista de Libros
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Conjunto de libros
     * @param libros lista de libros previamente añadidos
     */
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Metodo para obtener los libros que hay en la biblitoeca
     * @return libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busqueda de libro por titulo
     * @param titulo Titulo que se desea buscar
     * @return Si lo encuentra lo devuelve, sino no
     */
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Metodo de busqueda por autor
     * @deprecated Version actualizada posteriormente
     * @version 1.0
     * @link encuentraLibrosPorAutor
     * @param autor Nombre autor
     * @return Si encuentra un libro con ese autor lo muestra
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Metodo sustitutivo de busqueda de libros por autor
     * @version 2.0
     * @param autor Nombre del autor del libro que se busca
     * @return Libros coincidentes con ese autor
     */

    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
