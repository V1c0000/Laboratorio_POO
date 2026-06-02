/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package componentes;

/**
 *
 * @author ivann
 */
public interface IElectricComponent {
    
    public void channelUp();
    public void channelDown();
    public void volumeUp();
    public void volumeDown();
    public String newChannel(int chnl);
}
