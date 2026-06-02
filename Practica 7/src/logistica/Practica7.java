/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logistica;

/**
 *
 * @author ivann
 */
public class Practica7 {
    
    public static void main(String[]args){
        
        GestionLogistica sistema =new GestionLogistica();
        Avion avion1= new Avion("A1", "Boeing 737", 15, 10000);
        
        Camion camion1 = new Camion("C1", "Volvo", 50, 2000);
        
        sistema.registrarVehiculo(avion1);
        sistema.registrarVehiculo(camion1);
        
        System.out.println("=== DESPACHO DE FLOTA ===");
        sistema.despacharFlota();
        
        
    }

    
}
