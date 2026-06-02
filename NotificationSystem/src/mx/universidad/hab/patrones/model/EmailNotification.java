/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.universidad.hab.patrones.model;

public class EmailNotification implements Notification {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviando EMAIL a " + recipient +
                ": " + message);
    }
    
}
