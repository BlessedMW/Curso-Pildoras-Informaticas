/*
Archivo: Ejercicio7Video188.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 7 - Video 188.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.util.*;

public class Ejercicio7Video188 {
    public static void main(String[] args) {
        //Declaracion
        TreeSet<Nombre> nombres = new TreeSet<>(); 
        //Adiciones en estilo horizontal
        nombres.add(new Nombre("Carlos", 1)); nombres.add(new Nombre("Ariana", 20)); nombres.add(new Nombre("Bonifacio", 3)); nombres.add(new Nombre("David", 12));
        //Ciclo For Each
        for (Nombre nombre:nombres) {
            System.out.println(nombre.getDetalles());
        }
        //Declaracion
        TreeSet<Nombre> nombres2 = new TreeSet<>((Nombre nombre1, Nombre nombre2) -> {
        //Declaraciones en estilo horizontal
        String nombreDetalles1 = nombre1.getDetalles(); String nombreDetalles2 = nombre2.getDetalles();
        return nombreDetalles1.compareTo(nombreDetalles2);
        });
        //Adiciones en estilo horizontal
        nombres2.add(new Nombre("Carlos", 1)); nombres2.add(new Nombre("Ariana", 20)); nombres2.add(new Nombre("Bonifacio", 3)); nombres2.add(new Nombre("David", 12));
        //Impresiones
        System.out.println("----------------");
        System.out.println("Ordenados alfabeticamente");
        System.out.println("----------------");
        //Ciclo For Each
        for (Nombre nombre:nombres2) {
            System.out.println(nombre.getDetalles());
        }        
    }
}

//Clase Implementando -> Comparable <>
class Nombre implements Comparable<Nombre> { 
    private String detalles;
    private int id;
     
    public Nombre() {
        
    }
    
    public Nombre(String description, int ID) {
        this.detalles = description;
        this.id = ID;
    }

    public String getDetalles() {
        return detalles;
    }
            
    @Override
    public int compareTo(Nombre o) {     
        return id - o.id;       
    }
}

//Clase Implementando -> Comparator <>
class comparadorNombres implements Comparator<Nombre> {
    public int compare(Nombre nombre1, Nombre nombre2) {
        //Declaracion en estilo horizontal
        String nombreDetalles1 = nombre1.getDetalles(); String nombreDetalles2 = nombre2.getDetalles();
        return nombreDetalles1.compareTo(nombreDetalles2);
    }    
}