/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

import Oficios.Plomero;
import Profesiones.Medico;
import personas.Maestro;
import personas.Persona;

/**
 *
 * @author ivann
 */
public class MainPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p = new Persona();
        
        p.setNombre("Juanito Alimana");
        p.setEdad(25);
        p.setDir("Calle falsa 123");
        
        
        System.out.println("La perona de nombre: "
                + p.getNombre()
                +" Tiene: "
                + p.getEdad()
                + " Años y vive en: "
                + p.getDir()
 
        );
        
        Maestro m = new Maestro();
        m.setNombre("Pedro Navajas");
        m.setEdad(25);
        m.setDir("Calle falsa 123");

        System.out.println("El Maestro de nombre: "
              + m.getNombre()
              + " Tiene: "
              + m.getEdad()
              + " años y vive en: "
              + m.getDir());
        
        Medico med = new Medico();
        med.setNombre("Juanito");
        med.setEdad(25);
        med.setDir("Calle falsa 123");
        med.setEspecialidad("Cardiología");

        System.out.println("El doctor de nombre: "
                + med.getNombre()
                + " Tiene: "
                + med.getEdad()
                + " años y vive en: "
                + med.getDir());

        Plomero pl = new Plomero();
        pl.setNombre("Juan Alimaña");
        pl.setEdad(25);
        pl.setDir("Calle falsa 123");
        pl.setAñosExperiencia(10);

        System.out.println("El Plomero de nombre: "
                + pl.getNombre()
                + " Tiene: "
                + pl.getEdad()
                + " años y vive en: "
                + pl.getDir());
    }
    
    
    
}
