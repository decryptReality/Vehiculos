package vehiculos.tipos;

import vehiculos.*;
import interfaces.*;

public class Carga extends Vehiculo implements TransportarMaterial
{
    @Override
    public void transportarMaterial(String material, int kilogramos, int metros) 
    {
        System.out.println("  [?] Recorrido: " + metros + ", material: " + material + ", " + kilogramos + " kg");
    }
}
