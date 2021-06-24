package vehiculos.tipos;

import vehiculos.*;
import interfaces.*;

public class Carrera extends Vehiculo implements Turbo
{
    @Override
    public void activarTurbo() 
    {
        System.out.println("  [?] Turbo activdo, aceleracion actual: " + (3 * aceleracion));        
    }
}
