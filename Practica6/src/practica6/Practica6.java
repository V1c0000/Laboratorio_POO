/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

import componentes.Electronics;
import dispositivos.calculadora;
import dispositivos.computadora;
import dispositivos.radio;
import dispositivos.television;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author ivann
 */
public class Practica6 extends ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        calculadora cl = new calculadora();
        computadora cm = new computadora();
        television tl= new television();
        radio rd = new radio();
       // POLIMORFISMO
        Electronics elc = new calculadora();

        // USO NORMAL
        tl.powerOn();
        System.out.println(tl.newChannel(5));
        tl.volumeUp();
        tl.powerOff();

        System.out.println("-------------");

        // CALCULADORA
        cl.powerOn();
        System.out.println("Suma: " + cl.sumar(5, 3));
        System.out.println("Suma double: " + cl.sumar(2.5, 3.5));
        cl.subirVolumen();
        cl.powerOff();

        System.out.println("-------------");

        // ARRAYLIST
        ArrayList<Electronics> lista = new ArrayList<>();
        lista.add(cl);
        lista.add(cm);
        lista.add(tl);
        lista.add(rd);

        for (Electronics e : lista) {
            e.powerOn();
        }

        System.out.println("-------------");

        // LINKEDLIST
        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("TV");
        nombres.add("Radio");
        System.out.println(nombres);

        // HASHSET
        HashSet<String> dispositivos = new HashSet<>();
        dispositivos.add("TV");
        dispositivos.add("TV"); // no se repite
        dispositivos.add("Radio");
        System.out.println(dispositivos);

        // HASHMAP
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Television");
        mapa.put(2, "Radio");

        for (Integer key : mapa.keySet()) {
            System.out.println("Clave: " + key + " Valor: " + mapa.get(key));
        }
    }
    
    
   
}
