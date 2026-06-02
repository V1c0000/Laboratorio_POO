/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profesiones;

import personas.Persona;

/**
 *
 * @author ivann
 */
public class Medico extends Persona {
    
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void consultas(){
        System.out.println("El médico atiende en la especialidad de: " + especialidad);
    }
}
