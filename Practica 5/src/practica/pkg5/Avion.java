/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg5;

/**
 *
 * @author ivann
 */
public class Avion extends Vehiculo implements SistemaAceleracion {
    public Avion(String marca, String placa, String color) {
        super(marca, placa, color);
    }

    @Override
    public void encender() {
        System.out.println("Avion Encendido");
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Avion Abriendo la puerta");
    }

    public void volar() {
        System.out.println("Avion Volando");
    }

    @Override
    public void acelerar() {
        System.out.println("Avion acelerando");
    }
    @Override
    public void frenar() {
        System.out.println("Avion frenando");
    }
}
