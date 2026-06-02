import java.io.IOException;


public class Main {

   
    public static void main(String[] args) {

        
        System.out.println("     MINI GESTOR DE TAREAS  POO + I/O     ");
        System.out.println("    Colecciones + Threads (Java)           ");
        
        GestorTareas gestor = new GestorTareas();

        try {
  
            System.out.println("PASO 1: Agregar tareas ");

            gestor.agregarTarea(new Tarea(1, "Estudiar Java",          "Pendiente"));
            gestor.agregarTarea(new Tarea(2, "Completar laboratorio",  "Pendiente"));
            gestor.agregarTarea(new Tarea(3, "Revisar colecciones",    "Pendiente"));
            gestor.agregarTarea(new Tarea(4, "Implementar Threads",    "Pendiente"));
            gestor.agregarTarea(new Tarea(5, "Documentar proyecto",    "Pendiente"));

            
            System.out.println("\n  Intentando agregar tarea duplicada:");
            gestor.agregarTarea(new Tarea(6, "Estudiar Java", "Pendiente")); // ← duplicado

          
            System.out.println("\n PASO 2: Mostrar tareas en colecciones ");
            gestor.mostrarTareas();

            
            System.out.println("PASO 3: Guardar en archivo ");
            gestor.guardarArchivo();

            System.out.println("\n PASO 4: Leer desde archivo (nuevo gestor) ");
            GestorTareas gestorRecargado = new GestorTareas();
            gestorRecargado.leerArchivo();

            System.out.println("\n  Tareas reconstruidas desde archivo:");
            gestorRecargado.mostrarTareas();

            System.out.println("PASO 5: Procesamiento con Threads");

            ProcesadorTareas procesador = new ProcesadorTareas(
                gestorRecargado.getCola(),
                "Trabajador-1"
            );

            Thread hilo1 = new Thread(procesador);

            hilo1.start();

            hilo1.join();

            System.out.println("PASO 5b: Dos hilos procesando en paralelo");

            GestorTareas gestorParalelo = new GestorTareas();
            gestorParalelo.agregarTarea(new Tarea(10, "Tarea Alpha",   "Pendiente"));
            gestorParalelo.agregarTarea(new Tarea(11, "Tarea Beta",    "Pendiente"));
            gestorParalelo.agregarTarea(new Tarea(12, "Tarea Gamma",   "Pendiente"));
            gestorParalelo.agregarTarea(new Tarea(13, "Tarea Delta",   "Pendiente"));
            gestorParalelo.agregarTarea(new Tarea(14, "Tarea Epsilon", "Pendiente"));
            gestorParalelo.agregarTarea(new Tarea(15, "Tarea Zeta",    "Pendiente"));

            ProcesadorTareas p1 = new ProcesadorTareas(gestorParalelo.getCola(), "Trabajador-A");
            ProcesadorTareas p2 = new ProcesadorTareas(gestorParalelo.getCola(), "Trabajador-B");

            Thread hiloA = new Thread(p1);
            Thread hiloB = new Thread(p2);

            hiloA.start();
            hiloB.start();

            hiloA.join();
            hiloB.join();

            System.out.println(" Todas las tareas procesadas. FIN.");

        } catch (IOException e) {
        
            System.out.println("ERROR de archivo: " + e.getMessage());
            e.printStackTrace();

        } catch (InterruptedException e) {
            
            System.out.println("ERROR de hilo: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}

