/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

import componentes.Electronics;

/**
 *
 * @author ivann
 */
public class calculadora extends Electronics {
     @Override
    public void powerOn() {
        System.out.println("Calculadora prendida");
    }

    @Override
    public void powerOff() {
        System.out.println("Calculadora apagada");
    }

    // IMPLEMENTACIÓN
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    // SOBRECARGA
    public double sumar(double a, double b) {
        return a + b;
    }

    // EXTRA 
    public void subirVolumen() {
        System.out.println("Subiendo volumen... (sí, es una calculadora rara 😆)");
    }
}
