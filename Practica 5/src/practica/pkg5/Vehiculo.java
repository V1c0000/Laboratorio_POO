/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg5;

/**
 *
 * @author ivann
 */
public abstract class Vehiculo {
    protected String marca;
    protected String placa;
    protected String color;

    public Vehiculo(String marca, String placa, String color) {
        this.marca = marca;
        this.placa = placa;
        this.color = color;
    }

    
    public abstract void encender();
    public abstract void abrirPuerta();

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
    }
}
