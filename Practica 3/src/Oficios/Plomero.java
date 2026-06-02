/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oficios;

import personas.Persona;

/**
 *
 * @author ivann
 */
public class Plomero extends Persona{
    
    private int añosExperiencia;

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        if(añosExperiencia >= 0){
            this.añosExperiencia = añosExperiencia;
        }
    }

    public void arreglaGotera(){
        System.out.println("El plomero tiene " + añosExperiencia + " años de experiencia.");
    }
}
 