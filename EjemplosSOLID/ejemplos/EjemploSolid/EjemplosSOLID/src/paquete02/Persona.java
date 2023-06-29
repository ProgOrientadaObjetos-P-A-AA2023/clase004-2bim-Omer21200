/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;


import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private int edad;
    private Ciudad ciu;
    
    public Persona(String n, int e,Ciudad ci){
        nombre = n;
        edad = e;
        ciu=ci;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }

    public void establecerCiu(Ciudad ci) {
        ciu = ci;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerEdad(){
        return edad;
    }

    public Ciudad obtenerCiu() {
        return ciu;
    }
    
    
}
