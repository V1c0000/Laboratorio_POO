package biblioteca;



import java.io.File;           
import java.io.FileReader;     
import java.io.FileWriter;     
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.IOException;    
import java.util.ArrayList;    

public class GestorLibros {

    
    private ArrayList<Libro> libros;

    private File carpeta;
    private File archivo;


    
    public GestorLibros() {

       
        libros = new ArrayList<>();

        
        carpeta = new File("biblioteca");

        
        archivo = new File(carpeta, "libros.txt");
    }


    public void crearCarpetaYArchivo() throws IOException {

        if (!carpeta.exists()) {

            carpeta.mkdir();
            System.out.println("Carpeta 'biblioteca' creada.");

        } else {
            System.out.println("La carpeta 'biblioteca' ya existe.");
        }

        if (!archivo.exists()) {

            archivo.createNewFile();
            System.out.println("Archivo 'libros.txt' creado.");
        } else {
            System.out.println("El archivo 'libros.txt' ya existe.");
        }
    }


    public void agregarLibro(Libro libro) {

        libros.add(libro);
    }

    public void guardarLibros() throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {

          
          
            for (Libro libro : libros) {

                
                bw.write(libro.toFileString());

                
                bw.newLine();
            }

            

            System.out.println("Libros guardados en el archivo.");
        }
       
       
    }


    public void cargarLibros() throws IOException {

        
        libros.clear();

        if (!archivo.exists()) {
            System.out.println("El archivo no existe todavía.");
            return; 
        }

     
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {


            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) {

                    continue; 
                }

                String[] partes = linea.split(",");

               
                if (partes.length == 4) {

                    int anio = Integer.parseInt(partes[3].trim());

                   
                    Libro libro = new Libro(
                        partes[0].trim(), 
                        partes[1].trim(), 
                        partes[2].trim(), 
                        anio              
                    );

                    
                    libros.add(libro);
                }
            }
            
            System.out.println("Libros cargados desde el archivo.");
        }
    }

    public void mostrarLibros() {

        if (libros.isEmpty()) {
            System.out.println("No hay libros en la lista.");
            return;
        }

        System.out.println("\n===== CATÁLOGO DE LIBROS =====");

        for (int i = 0; i < libros.size(); i++) {

            Libro libro = libros.get(i);

            System.out.println((i + 1) + ". " + libro);
        }

        System.out.println("==============================\n");
    }

} 
