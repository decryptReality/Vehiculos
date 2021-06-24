package vehiculos.tipos;

import vehiculos.*;
import interfaces.*;

public class Carrera extends Vehiculo implements Turbo
{
    public Carrera(boolean esDiesel, double galones, int pasajeros, double aceleracion) 
    {
        super(esDiesel, galones, pasajeros, aceleracion);
    }

    @Override
    public void activarTurbo() 
    {
        System.out.println("  [?] Turbo activdo, aceleracion actual: " + (3 * aceleracion));        
    }
}
