/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logistica;

/**
 *
 * @author ivann
 */
public abstract class Vehiculo {
    
    private String id;
    private String modelo;
    private int nivelCombustible;
    
    public Vehiculo(String id, String modelo, int nivelCombustible){
        this.id=id;
        this.modelo=modelo;
        this.nivelCombustible= nivelCombustible;
    }
    
    
    public String getId(){
        return id;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getNivelCombustible(){
        return nivelCombustible;
    }
    
    public void setNivelCombustible(int nivelCombustible){
        this.nivelCombustible=nivelCombustible;
    }
    
    public abstract void validarEstado() throws EstadoInvalidoException;
}
