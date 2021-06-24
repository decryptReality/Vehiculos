package vehiculos.tipos;

import vehiculos.*;
import interfaces.*;

public class Camioneta extends Vehiculo implements TransportarPersonas
{
    @Override
    public void trasportarPersonas(int personas, int metros) 
    {
        System.out.println("  [?] Recorrido: " + metros + " metros, personas: " + personas);
    }
}
