/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Quito");
        Ciudad c3 = new Ciudad("Cuenca");
        Persona per1 = new Persona("René", 39, c1);
        Persona per2 = new Persona("Santiago", 20, c2);
        Persona per3 = new Persona("Omer", 23, c3);
        Persona per4 = new Persona("Luis", 22, c1);
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(per1);
        miLista.add(per2);
        miLista.add(per3);
        miLista.add(per4);
        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        op1.establecerEstudiante(miLista);
        op1.establecerPromedioEdades();
        op1.establecerEdadminima();
        op1.establecerListaCiudadesEstudiantes();
        System.out.println("Edad promedio: " + op1.obtenerPromedioEdades());
        System.out.println("Edad minima: " + op1.obtenerEdadminima());
        System.out.println("Lista de Ciudades: \n"+op1.obtenerListaCiudadesEstudiantes());

    }
}
