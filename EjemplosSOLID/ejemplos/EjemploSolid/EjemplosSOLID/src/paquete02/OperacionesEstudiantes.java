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
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private String listaCiudadesEstudiantes = "";
    
    public void establecerEdadminima() {
        edadminima= obtenerEstudiante().get(0).obtenerEdad();
        for(Persona e: obtenerEstudiante()){
            if (e.obtenerEdad()<edadminima) {
                edadminima=e.obtenerEdad();
            }
        }
    }

    public void establecerListaCiudadesEstudiantes() {
        for(Persona e: obtenerEstudiante()){
            listaCiudadesEstudiantes=String.format("%sCiudada: %s\n", 
                    listaCiudadesEstudiantes,e.obtenerCiu().obtenerNomreC());
        }
    }
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }

    public int obtenerEdadminima() {
        return edadminima;
    }

    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }
    
    
}
