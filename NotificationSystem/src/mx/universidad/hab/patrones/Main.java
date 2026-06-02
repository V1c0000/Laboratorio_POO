/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mx.universidad.hab.patrones;

import mx.universidad.hab.patrones.singleton.NotificationLogger;
import mx.universidad.hab.patrones.thread.NotificationWorker;

public class Main {

    public static void main(String[] args) {

        NotificationWorker worker1 =
                new NotificationWorker(
                        "EMAIL",
                        "ivanna@gmail.com",
                        "Hola desde EMAIL");

        NotificationWorker worker2 =
                new NotificationWorker(
                        "SMS",
                        "8112345678",
                        "Hola desde SMS");

        NotificationWorker worker3 =
                new NotificationWorker(
                        "PUSH",
                        "UsuarioApp",
                        "Hola desde PUSH");

        NotificationWorker worker4 =
                new NotificationWorker(
                        "EMAIL",
                        "test@gmail.com",
                        "Segundo correo");

        NotificationWorker worker5 =
                new NotificationWorker(
                        "SMS",
                        "8188888888",
                        "Segundo SMS");

        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(worker2);
        Thread t3 = new Thread(worker3);
        Thread t4 = new Thread(worker4);
        Thread t5 = new Thread(worker5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {

            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();

        } catch (InterruptedException e) {

            System.out.println("Error en los hilos");
        }

        NotificationLogger logger =
                NotificationLogger.getInstance();

        logger.printLogs();
    }
}
