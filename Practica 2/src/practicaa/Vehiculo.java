/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaa;

/**
 *
 * @author ivann
 */
public class Vehiculo {
    public String placa; 
    public String marca;
    public String color;
    public String modelo;
    public double gas;
    public boolean motorEncendido;
    
    public Vehiculo(String placa, String marca, String modelo, String color, double gas){
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.color= color;
        this.gas=gas;
        this.motorEncendido=false;
        
    }
    
    public void mostrarInfo(){
        System.out.println(
                "El automovil marca "+ marca +
                " con placa "+ placa +
                ", modelo " + modelo +
                ", color " + color +
                " y gasolina " + gas
        );
    }
    
    
    public String encenderMotor(){
       
        if(gas >= 1){
            motorEncendido=true;
            return "Motor Encendido";
        }
        else
            return "Motor NO encendido, poner Gas";
        
    }
    
    public void avanzar(){
        if(motorEncendido && gas > 1){
            gas--;
            System.out.println("Vehiculo avanzando");
        } else {
            System.out.println("El vehiculo no puede avanzar");
        }
        
    }
    
    public void apagarMotor(){
        motorEncendido=false;
        System.out.println("Vehiculo apagado");
    }
    
    public void acelerar(){
        if(motorEncendido){
            gas-=2;
            System.out.println("Acelerando");
        }else{
            System.out.println("El motor esta apagado");
        }
    }
    
    public void girar(String direccion){
        System.out.println("Girando a la " + direccion);
    }
    
}
