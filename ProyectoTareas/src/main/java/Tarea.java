
public class Tarea {

    private int    id;     
    private String nombre;  
    private String estado; 


    public Tarea() {}


    public Tarea(int id, String nombre, String estado) {
        this.id     = id;
        this.nombre = nombre;
        this.estado = estado;
    }


    public int    getId()     { return this.id;     }
    public String getNombre() { return this.nombre; }
    public String getEstado() { return this.estado; }


    public void setId(int id)          { this.id     = id;     }
    public void setNombre(String n)    { this.nombre = n;      }
    public void setEstado(String e)    { this.estado = e;      }


    public String toFileString() {
        return id + "," + nombre + "," + estado;
    }


    @Override
    public String toString() {
        return "[ID: " + id + "] " + nombre + "  Estado: " + estado;
    }
}
