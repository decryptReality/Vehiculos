package vehiculos.tipos;

import vehiculos.*;
import interfaces.*;

public class Camioneta extends Vehiculo implements TransportarPersonas
{
    public Camioneta(boolean esDiesel, double galones, int pasajeros, double aceleracion) 
    {
        super(esDiesel, galones, pasajeros, aceleracion);
    }

    @Override
    public void trasportarPersonas(int personas, int metros) 
    {
        System.out.println("  [?] Recorrido: " + metros + " metros, personas: " + personas);
    }
}
