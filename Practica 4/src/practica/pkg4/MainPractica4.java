/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg4;
/**
 *
 * @author ivann
 */
public class MainPractica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aereo boing = new Aereo("Boing", 365);
        boing.mostrarDatos();
        boing.avanzar();

        Terrestre dina = new Terrestre("Dina", 67);
        dina.mostrarDatos();
        dina.avanzar();

        Aereo aeromexico = new Aereo("Aeromexico", 95);
        aeromexico.mostrarDatos();
        aeromexico.avanzar();

        Aereo mexicana = new Aereo("Mexicana", 90);
        mexicana.mostrarDatos();
        mexicana.avanzar();

        Avion avion = new Avion("Boing 747", 400);
        avion.volar();
    }
    
    
}