package vehiculos;

import interfaces.*;
 
public abstract class Vehiculo implements Girar
{
    protected boolean esDiesel;
    protected double galones;
    protected int pasajeros;
    protected double aceleracion;

    @Override
    public void girarIzquierda() 
    {
        System.out.println("  [?] Se giro a la izquierda");
    }

    @Override
    public void girarDerecha() 
    {
        System.out.println("  [?] Se giro a la derecha");
    }
}