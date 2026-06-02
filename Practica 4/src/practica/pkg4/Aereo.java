/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg4;

/**
 *
 * @author ivann
 */
public class Aereo extends Transporte{
    public Aereo(String marca, int capacidad) {
        super(marca, capacidad); // llama al constructor padre
    }

    @Override
    public void avanzar() {
        System.out.println("Transporte Aereo avanzando");
    }
}
