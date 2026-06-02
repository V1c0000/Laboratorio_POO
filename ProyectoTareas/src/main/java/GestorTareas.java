

import java.io.BufferedReader;   
import java.io.BufferedWriter;   
import java.io.File;             
import java.io.FileReader;       
import java.io.FileWriter;       
import java.io.IOException;      
import java.util.ArrayList;      
import java.util.HashMap;        
import java.util.HashSet;        
import java.util.Iterator;       
import java.util.LinkedList;     

public class GestorTareas {


    private ArrayList<Tarea> lista;

   
    private HashMap<Integer, Tarea> mapa;

    private HashSet<String> set;

    private LinkedList<Tarea> cola;

    private File archivo;

    public GestorTareas() {

        lista   = new ArrayList<>();
        mapa    = new HashMap<>();
        set     = new HashSet<>();
        cola    = new LinkedList<>();

        archivo = new File("tareas.txt");
    }

    public void agregarTarea(Tarea t) {

      
        if (set.contains(t.getNombre())) {
            System.out.println("   DUPLICADO rechazado: '" + t.getNombre() + "'");
            return; 
        }

        lista.add(t);

        mapa.put(t.getId(), t);

        set.add(t.getNombre());

        cola.offer(t);

        System.out.println("   Tarea agregada: " + t);
    }

    public void guardarArchivo() throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {

            for (Tarea t : lista) {

                bw.write(t.toFileString());
      
                bw.newLine();
            }
        }
        System.out.println("   Tareas guardadas en '" + archivo.getName() + "'");
    }

    public void leerArchivo() throws IOException {

        if (!archivo.exists()) {
            System.out.println("  El archivo no existe todavía.");
            return;
        }

        lista.clear();
        mapa.clear();
        set.clear();
        cola.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) continue;

                String[] partes = linea.split(",");

                if (partes.length == 3) {

                    int id = Integer.parseInt(partes[0].trim());

                    Tarea t = new Tarea(id, partes[1].trim(), partes[2].trim());

                    agregarTarea(t);
                }
            }
        }
        System.out.println("   Tareas cargadas desde '" + archivo.getName() + "'");
    }

    public void mostrarTareas() {

        System.out.println("         LISTA GENERAL (ArrayList)        ");

        if (lista.isEmpty()) {
            System.out.println("  (sin tareas)");
            return;
        }

        System.out.println("\n  [Iterator explicito]");
        Iterator<Tarea> it = lista.iterator();
        while (it.hasNext()) {
            
            Tarea t = it.next();
            System.out.println("   " + t);
        }

        System.out.println("\n  [HashMap  busqueda por ID]");
       
        for (Integer id : mapa.keySet()) {
            
            System.out.println("   Clave " + id + " → " + mapa.get(id));
        }

        System.out.println("\n  [HashSet nombres registrados (sin duplicados)]");
        for (String nombre : set) {
            System.out.println( nombre);
        }

        System.out.println("\n  [LinkedList  cola de procesamiento]");
        System.out.println("   Tareas en cola: " + cola.size());
        System.out.println();
    }

    public LinkedList<Tarea> getCola() {
        return cola;
    }
}
