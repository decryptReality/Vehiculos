package vehiculos.tipos;

import vehiculos.*;
import interfaces.*;

public class Carga extends Vehiculo implements TransportarMaterial
{
    public Carga(boolean esDiesel, double galones, int pasajeros, double aceleracion) 
    {
        super(esDiesel, galones, pasajeros, aceleracion);
    }

    @Override
    public void transportarMaterial(String material, int kilogramos, int metros) 
    {
        System.out.println("  [?] Recorrido: " + metros + ", material: " + material + ", " + kilogramos + " kg");
    }
}
