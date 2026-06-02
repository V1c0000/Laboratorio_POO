/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author ivann
 */
import componentes.Electronics;
import componentes.IElectricComponent;

public class radio extends Electronics implements IElectricComponent {

    @Override
    public void powerOn() {
        System.out.println("Radio encendido");
    }

    @Override
    public void powerOff() {
        System.out.println("Radio apagado");
    }

    @Override
    public void channelUp() {
        System.out.println("Estación siguiente");
    }

    @Override
    public void channelDown() {
        System.out.println("Estación anterior");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volumen subió");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volumen bajó");
    }

    @Override
    public String newChannel(int chnl) {
        return "Sintonizando estación: " + chnl;
    }
}
