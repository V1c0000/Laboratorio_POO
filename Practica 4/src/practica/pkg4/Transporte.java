/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg4;

/**
 *
 * @author ivann
 */
public class Transporte {
    protected String marca;
    protected int capacidad;

    public Transporte(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public void avanzar() {
        System.out.println("Transporte avanzando");
    }

    public void mostrarDatos() {
        System.out.println("marca: " + marca);
        System.out.println("capacidad: " + capacidad);
    }
}
