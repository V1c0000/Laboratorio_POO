/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logistica;

/**
 *
 * @author ivann
 */
public class Camion extends Vehiculo{
    
    private double capacidadCarga;
    
    public Camion(String id, String modelo, int nivelCombustible, double capacidadCarga){
        super(id, modelo, nivelCombustible);
        this.capacidadCarga=capacidadCarga;
    }
    

    @Override
    public void validarEstado() throws EstadoInvalidoException {
        if(getNivelCombustible()<10){
            throw new EstadoInvalidoException(
                    "Camion "+ getId() + "no puede salir: combustible insuficiente ("
                    + getNivelCombustible() + "%)"
            );
        }
        System.out.println("Camion " + getId() + " listo para salir");
    }
    
    
}
