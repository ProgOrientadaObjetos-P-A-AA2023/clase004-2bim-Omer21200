/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;  

import java.util.ArrayList;

/**
 *
 * @author omerb
 */
public class Principal {
    public static void main(String[] args) {
        Persona per1= new Persona("René", 39);
        Persona per2=new Persona("Santiago", 20);
        System.out.println(per1.obtenerEdad());
        System.out.println(per2.obtenerEdad());
        
        ArrayList<Persona> miLista=new ArrayList<>();
        miLista.add(per1);
        miLista.add(per2);
        double promedio= per1.promedioEdades(miLista);
        System.out.println(promedio);
    }
    
}
