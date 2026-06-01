package biblioteca;


public class Libro {

    private String codigo;  
    private String titulo;  
    private String autor;   
    private int    anio;    

    public Libro() {
        
    }


    public Libro(String codigo, String titulo, String autor, int anio) {
        this.codigo = codigo; 
        this.titulo = titulo;
        this.autor  = autor;
        this.anio   = anio;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

  
    public int getAnio() {
        return this.anio;
    }



    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public String toFileString() {
       
        return codigo + "," + titulo + "," + autor + "," + anio;
    }


    @Override
    public String toString() {
        
        return "Codigo: " + codigo +
               " | Titulo: " + titulo +
               " | Autor: " + autor +
               " | Año: " + anio;
    }

} 