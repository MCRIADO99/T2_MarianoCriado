package Test;
import main.*;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void agregarLibro() {
        Libro Libro1 = new Libro("1984", "George Orwell", 1984);
        System.out.println("Libro 1: " + Libro1.toString());
    }

    @org.junit.jupiter.api.Test
    void eliminarLibro() {
        System.out.println("Libro eliminado");
    }

    @org.junit.jupiter.api.Test
    void getLibros() {
    }

    @org.junit.jupiter.api.Test
    void encuentraLibroPorTitulo() {

    }

    @org.junit.jupiter.api.Test
    void encuentaLibroPorAutor() {
    }

    @org.junit.jupiter.api.Test
    void encuentraLibrosPorAutor() {
    }
}