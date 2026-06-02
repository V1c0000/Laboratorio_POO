/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg5;
import java.util.Scanner;
/**
 *
 * @author ivann
 */
public class MainPractica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese marca del automovil: ");
        String marcaAuto = sc.nextLine();

        Automovil auto = new Automovil(marcaAuto, "ABC123", "Rojo");

        auto.encender();
        auto.abrirPuerta();
        auto.mostrarDatos();

        System.out.println("------------------");

        System.out.print("Ingrese marca del avion: ");
        String marcaAvion = sc.nextLine();

        Avion avion = new Avion(marcaAvion, "XYZ789", "Blanco");

        avion.encender();
        avion.abrirPuerta();
        avion.volar();
        avion.mostrarDatos();
        
        System.out.println("------------------");
        System.out.print("Ingrese marca de la moto: ");
        String marcaMoto = sc.nextLine();
        
        Moto moto = new Moto(marcaMoto, "MOT123", "Negra");

        moto.encender();
        moto.abrirPuerta();
        moto.acelerar();
        moto.mostrarDatos();
        
    }
    
}
