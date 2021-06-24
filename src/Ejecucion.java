import java.util.Random;
import java.util.Scanner;
import vehiculos.Vehiculo;
import vehiculos.tipos.Camioneta;
import vehiculos.tipos.Carga;
import vehiculos.tipos.Carrera;

public class Ejecucion 
{ 
    public static void main(String[] args) 
    {
        ingresarVehiculos();
        menu();
    }
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static Vehiculo[] vehiculos = new Vehiculo[20];

    static void menu()
    {
        boolean salir = false;
        while(!salir)
        {
            System.out.println("\nV E H I C U L O S");
            System.out.println("Para salir ingrese -1");
            System.out.println("[1] Mostrar vehiculos");
            System.out.println("[2] Interactuar con carros");
            int res = scanner.nextInt();
            salir = res == -1;
            if(!salir)
            {
                if(res == 1)
                {
                    mostrarVehiculos();
                }
                if(res == 2)
                {
                    System.out.println("Ingrese el indice de algun vehiculo");
                    int i = scanner.nextInt();
                    interactuar(vehiculos[i]);
                }
            }
        }
    }

    static void interactuar(Vehiculo vehiculo)
    {
        if(vehiculo instanceof Camioneta)
        {
            System.out.println("[1] Transportar personas");
        }
        if(vehiculo instanceof Carga)
        {
            System.out.println("[1] Transportar material");
        }
        if(vehiculo instanceof Carrera)
        {
            System.out.println("[1] Activar turbo");
        }
        System.out.println("[2] Mover a la izquierda");
        System.out.println("[3] Mover a la derecha");
        int res = scanner.nextInt();
        if(res == 1)
        {
            if (vehiculo instanceof Camioneta) 
            {
                System.out.print("Ingrese cantidad de personas: ");
                int personas = scanner.nextInt();
                System.out.print("Ingrese la distancia en metros: ");
                int metros = scanner.nextInt();
                ((Camioneta) vehiculo).trasportarPersonas(personas, metros);;
            }
            if (vehiculo instanceof Carga) 
            {
                System.out.print("Ingrese el nombre del material: ");
                String material = scanner.next();
                System.out.print("Ingrese cantidad en kilogramos: ");
                int kilogramos = scanner.nextInt();
                System.out.print("Ingrese la distancia en metros: ");
                int metros = scanner.nextInt();
                ((Carga) vehiculo).transportarMaterial(material, kilogramos, metros);
            }
            if (vehiculo instanceof Carrera) 
            {
                ((Carrera) vehiculo).activarTurbo();
            }
        }
        if(res == 2)
        {
            vehiculo.girarDerecha();
        }
        if(res == 3)
        {
            vehiculo.girarIzquierda();
        }
    }

    static void ingresarVehiculos()
    {
        for(int i = 0; i < vehiculos.length; i = i + 1)
        {
            vehiculos[i] = generarVehiculo();
        }
    }

    // todo es en metros y segundos
    static Vehiculo generarVehiculo()
    {
        int caso = dado(2);
        if(caso == 0)
        {
            return new Camioneta(moneda(), dado(100, 150), dado(30, 60), dado(0.20, 0.98));
        }
        if(caso == 1)
        {
            return new Carga(moneda(), dado(100, 150), dado(2, 10), dado(0.12, 0.60));
        }
        if(caso == 2)
        {
            return new Carrera(moneda(), dado(10, 14), dado(1, 2), dado(2.0, 3.5));
        }
        return null;
    }

    static void mostrarVehiculos()
    {
        for(int i = 0; i < vehiculos.length; i = i + 1)
        {
            System.out.print("[" + i + "]");
            verificarTipo(vehiculos[i]);
        }
    }

    static void verificarTipo(Vehiculo vehiculo)
    {
        if(vehiculo instanceof Camioneta)
        {
            System.out.println("  tipo: camioneta");
        }
        if(vehiculo instanceof Carga)
        {
            System.out.println("  tipo: de carga");
        }
        if(vehiculo instanceof Carrera)
        {
            System.out.println("  tipo: carrera");
        }
        vehiculo.getInformacion();
    }

    static int dado(int sup)
    {
        return random.nextInt(sup + 1);
    }

    static int dado(int inf, int sup)
    {
        return inf + random.nextInt(sup + 1 - inf);
    }

    static double dado(double inf, double sup)
    {
        return inf + (sup - inf) * random.nextDouble();
    }

    static boolean moneda()
    {
        return random.nextBoolean();
    }
}
