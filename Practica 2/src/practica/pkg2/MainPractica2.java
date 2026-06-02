/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg2;

import java.util.Scanner;
import practicaa.Vehiculo;
/**
 *
 * @author ivann
 */
public class MainPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc =new Scanner(System.in);
       
       System.out.print("Placa: ");
       String placa= sc.nextLine();
       
       System.out.print("Marca: ");
       String marca= sc.nextLine();
       
       System.out.print("Modelo: ");
       String modelo= sc.nextLine();
       
       System.out.print("Color: ");
       String color= sc.nextLine();
       
       System.out.print("Gasolina: ");
       double gas= sc.nextDouble();
       
       Vehiculo taurus= new Vehiculo(placa, marca, modelo, color, gas);
       
       taurus.mostrarInfo();
       System.out.println(taurus.encenderMotor());
       taurus.avanzar();
       taurus.acelerar();
       taurus.girar("derecha");
       taurus.apagarMotor();
    }
    
}
