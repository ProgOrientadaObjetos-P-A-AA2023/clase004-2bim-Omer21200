/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        TransporteTransvia trnasvia=new TransporteTransvia();
        trnasvia.establecerCooperativaTransvia("Loja");
        trnasvia.establecerTarifa();
        ArrayList<Transporte> lis=new ArrayList<>();
        lis.add(bus);
        lis.add(taxi);
        lis.add(trnasvia);
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lis);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
