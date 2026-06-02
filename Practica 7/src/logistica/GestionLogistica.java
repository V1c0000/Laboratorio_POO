/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logistica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivann
 */
public class GestionLogistica {
    
    private List<Vehiculo> flota = new ArrayList<>();
    
    public void registrarVehiculo(Vehiculo v){
        flota.add(v);
    }
    
    public void despacharFlota(){
        
        for(Vehiculo v: flota){
            try {
                v.validarEstado();
            } catch(EstadoInvalidoException e){
                System.out.println("ERROR: "+ e.getMessage());
            }
        }
    }
    
    
    
}
