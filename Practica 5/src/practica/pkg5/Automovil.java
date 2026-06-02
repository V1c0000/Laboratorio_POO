/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg5;

/**
 *
 * @author ivann
 */
public class Automovil extends Vehiculo implements SistemaAceleracion{
    public Automovil(String marca, String placa, String color) {
        super(marca, placa, color);
    }

    @Override
    public void encender() {
        System.out.println("Automovil encendido");
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Automovil Abriendo las puertas");
    }

    @Override
    public void acelerar() {
        System.out.println("Automovil acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Automovil frenando");
    }
    
    
}
