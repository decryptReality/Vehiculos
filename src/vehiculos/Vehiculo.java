package vehiculos;

import interfaces.*;
 
public abstract class Vehiculo implements Girar
{
    protected boolean esDiesel;
    protected double galones;
    protected int pasajeros;
    protected double aceleracion;

    public Vehiculo(boolean esDiesel, double galones, int pasajeros, double aceleracion) 
    {
        this.esDiesel = esDiesel;
        this.galones = galones;
        this.pasajeros = pasajeros;
        this.aceleracion = aceleracion;
    }

    public void getInformacion()
    {
        System.err.println("  esDisel: " + esDiesel + ", " + galones + " gal, aceleracion: " + aceleracion + ", pasajeros: " + pasajeros);
    }


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