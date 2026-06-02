/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.universidad.hab.patrones.model;

/**
 *
 * @author ivann
 */
public class SMSNotification implements Notification {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviando SMS a " + recipient +
                ": " + message);
    }
    
}
