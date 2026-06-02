
import java.util.LinkedList; 

public class ProcesadorTareas implements Runnable {

    private LinkedList<Tarea> cola;

    private String nombreHilo;

    public ProcesadorTareas(LinkedList<Tarea> cola, String nombreHilo) {
        this.cola       = cola;
        this.nombreHilo = nombreHilo;
    }


    @Override
    public void run() {

        System.out.println("\n  [Hilo '" + nombreHilo + "'] Iniciando procesamiento...");

        while (!cola.isEmpty()) {

            Tarea t = cola.poll();

            if (t == null) break; 

            System.out.println("  [Hilo '" + nombreHilo + "'] Procesando: " + t.getNombre() + "...");

            try {
                
                long duracion = 300 + (long)(Math.random() * 500);
                Thread.sleep(duracion);
            } catch (InterruptedException e) {
                
                Thread.currentThread().interrupt();
                System.out.println("  [Hilo '" + nombreHilo + "'] Interrumpido.");
                break;
            }

            t.setEstado("Completada");
            System.out.println("  [Hilo '" + nombreHilo + "']  Completada: " + t.getNombre());
        }

        System.out.println("  [Hilo '" + nombreHilo + "'] Cola vacia. Hilo terminado.\n");
    }
}
