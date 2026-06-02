/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.universidad.hab.patrones.thread;

/**
 *
 * @author ivann
 */
import mx.universidad.hab.patrones.factory.NotificationFactory;
import mx.universidad.hab.patrones.model.Notification;
import mx.universidad.hab.patrones.singleton.NotificationLogger;

public class NotificationWorker implements Runnable {

    private String type;
    private String recipient;
    private String message;

    public NotificationWorker(String type,
                              String recipient,
                              String message) {

        this.type = type;
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public void run() {

        try {

            Notification notification =
                    NotificationFactory.createNotification(type);

            notification.send(recipient, message);

            NotificationLogger logger =
                    NotificationLogger.getInstance();

            logger.log("[" + type + "] enviado a "
                    + recipient);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
