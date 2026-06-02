/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.universidad.hab.patrones.factory;

/**
 *
 * @author ivann
 */
import mx.universidad.hab.patrones.model.EmailNotification;
import mx.universidad.hab.patrones.model.Notification;
import mx.universidad.hab.patrones.model.PushNotification;
import mx.universidad.hab.patrones.model.SMSNotification;

public class NotificationFactory {

    public static Notification createNotification(String type) {

        switch (type.toUpperCase()) {

            case "EMAIL":
                return new EmailNotification();

            case "SMS":
                return new SMSNotification();

            case "PUSH":
                return new PushNotification();

            default:
                throw new IllegalArgumentException(
                        "Tipo de notificacion no valido: " + type);
        }
    }
}
