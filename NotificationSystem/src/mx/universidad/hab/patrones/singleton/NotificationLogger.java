/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.universidad.hab.patrones.singleton;

/**
 *
 * @author ivann
 */
import java.util.ArrayList;
import java.util.List;

public class NotificationLogger {

    
    private static NotificationLogger instance;

    
    private final List<String> logs;

    
    private NotificationLogger() {
        logs = new ArrayList<>();
    }

    
    public static synchronized NotificationLogger getInstance() {

        if (instance == null) {
            instance = new NotificationLogger();
        }

        return instance;
    }

    
    public synchronized void log(String message) {
        logs.add(message);
    }

   
    public synchronized void printLogs() {

        System.out.println("\n===== HISTORIAL DE LOGS =====");

        for (String log : logs) {
            System.out.println(log);
        }
    }
}
