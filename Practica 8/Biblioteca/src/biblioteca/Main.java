package biblioteca;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        GestorLibros gestor = new GestorLibros();


        try {
            gestor.crearCarpetaYArchivo();


            Libro libro1 = new Libro("L001", "Fundamentos de Java",    "Maria Lopez",   2021);
            Libro libro2 = new Libro("L002", "Estructuras de Datos",   "Carlos Rivera", 2019);
            Libro libro3 = new Libro("L003", "Algoritmos Avanzados",   "Ana Torres",    2023);
            Libro libro4 = new Libro("L004", "Programacion Orientada", "Pedro Saenz",   2020);
            Libro libro5 = new Libro("L005", "Bases de Datos",         "Laura Mendez",  2022);

            gestor.agregarLibro(libro1);
            gestor.agregarLibro(libro2);
            gestor.agregarLibro(libro3);
            gestor.agregarLibro(libro4);
            gestor.agregarLibro(libro5);

            System.out.println("\n>> Libros agregados en memoria.");


            gestor.guardarLibros();

            gestor.cargarLibros();


            gestor.mostrarLibros();


            System.out.println(">> DEMOSTRACIÓN DE GETTERS Y SETTERS:");

            Libro libroExtra = new Libro();

            libroExtra.setCodigo("L006");
            libroExtra.setTitulo("Redes de Computadoras");
            libroExtra.setAutor("Sofia Garza");
            libroExtra.setAnio(2024);

            System.out.println("Codigo leido con getCodigo(): " + libroExtra.getCodigo());
            System.out.println("Titulo leido con getTitulo(): " + libroExtra.getTitulo());
            System.out.println("Autor  leido con getAutor() : " + libroExtra.getAutor());
            System.out.println("Año    leido con getAnio()  : " + libroExtra.getAnio());
            System.out.println("toString()                  : " + libroExtra.toString());
            System.out.println("toFileString()              : " + libroExtra.toFileString());


        } catch (IOException e){
           
            System.out.println("ERROR de entrada/salida: " + e.getMessage());

            e.printStackTrace();
        }

        
        System.out.println("\nPrograma finalizado.");

    } 

} 


