package main;

/**
 * Clase que proporciona los libros
 * @author Mariano Criado Prados
 * @version 6.3.2025
 * @see <a href="https://github.com/MCRIADO99/T2_MarianoCriado">...</a>
 */
public class Libro {
    /**
     * Atributo que hace referencia al titulo del libro
      */
    private String titulo;
    /**
     * Atributo que hace referencia al autor del libro
     */
    private String autor;
    /**
     * Atributo que hace referencia al año de publicacion
     */
    private int anioPublicacion;

    /**
     * Metodo que reune los atributos y da la vision completa
     * @param titulo nombre del libro
     * @param autor creador del libro
     * @param anioPublicacion año de publicacion
     */

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Autor del libro
     * @return Autor libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Fecha en la que se publica
     * @return año de publicación
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
