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
public class computadora extends Electronics  {
     @Override
    public void powerOn() {
        System.out.println("Computadora prendida");
        
            
    }

    @Override
    public void powerOff() {
        System.out.println("Computadora apagada");
    }
}
