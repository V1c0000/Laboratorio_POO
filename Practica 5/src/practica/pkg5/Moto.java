/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg5;

/**
 *
 * @author ivann
 */
public class Moto extends Vehiculo implements SistemaAceleracion {
    public Moto(String marca, String placa, String color) {
        super(marca, placa, color);
    }

    @Override
    public void encender() {
        System.out.println("Moto Encendida");
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Moto no tiene puertas");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Moto frenando");
    }
}
