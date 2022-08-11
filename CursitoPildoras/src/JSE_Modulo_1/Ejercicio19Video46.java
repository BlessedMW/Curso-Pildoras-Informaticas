/*
Archivo: Ejercicio19Video46.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 19 - Video 46.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

public class Ejercicio19Video46 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        
        vehiculos[0] = new Avion("Avion","Combate","Lanzamisiles");
        vehiculos[1] = new Auto("Auto", "Carreras","8");
        
        for(Vehiculo vehiculoss:vehiculos) {
            System.out.println(vehiculoss.getInfo());
        }
    }
}

abstract class Vehiculo {  
    private String tipo;
    
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    } 
    
    public abstract String getInfo();
}

class Avion extends Vehiculo { // Ya tenemos un archivo con una clase empleado en "19"
    private String tipoAvion;
    private String accesorio;
    
    public Avion(String nm, String tipoAvion, String accesorio) {
        super(nm);
        this.tipoAvion = tipoAvion;
        this.accesorio = accesorio;
    }
    
    @Override
    public String getInfo() {
        return "Este " + super.getTipo() + " es de tipo " + tipoAvion + " y su accesorio es un/a " + accesorio;
    }
}

class Auto extends Vehiculo {
    private String tipoAuto;
    private String caballosMotor;
    
    public Auto(String nm, String tipoAuto, String caballosMotor) {
        super(nm);
        this.tipoAuto = tipoAuto;
        this.caballosMotor = caballosMotor;
    }
    
    @Override
    public String getInfo() { 
        return "Este " + super.getTipo() + " es de tipo " + tipoAuto + " y los caballos de su motor son " + caballosMotor;
    }
}