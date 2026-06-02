/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logistica;

/**
 *
 * @author ivann
 */
public class Avion extends Vehiculo implements Volador{
    
    public int altitudMaxima;
    
    public Avion(String id, String modelo, int nivelCombustible, int altitudMaxima){
        super(id, modelo, nivelCombustible);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public void validarEstado() throws EstadoInvalidoException {
        if(getNivelCombustible()<30){
            throw new EstadoInvalidoException(
                    "Avion " + getId() + " no se puede despegar: combustible insuficiente ("
                    + getNivelCombustible() + "%)"
            
            );
        }
        System.out.println("Avion "+ getId()+ " listo para despegar");
        
    }

    @Override
    public void verificarPlanVuelo() {
        System.out.println("Plan de vuelo verificado a "+ altitudMaxima + "metros");
    }
    
}
