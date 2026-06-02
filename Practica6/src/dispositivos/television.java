/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

import componentes.Electronics;
import componentes.IElectricComponent;

/**
 *
 * @author ivann
 */
public class television extends Electronics implements IElectricComponent{

    @Override
    public void powerOn() {
        System.out.println("Television prendida");
        
            
    }

    @Override
    public void powerOff() {
        System.out.println("Television apagada");
    }

    @Override
    public void channelUp() {
        System.out.println("Canal arriba");
    }

    @Override
    public void channelDown() {
       System.out.println("Canal abajo");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volumen arriba");
        
    }

    @Override
    public String newChannel(int chnl) {
        
        return "Estas viendo el canal:" + String.valueOf(chnl);
    }

    @Override
    public void volumeDown() {
        System.out.println("Volumen abajo");
    }    
    
}
