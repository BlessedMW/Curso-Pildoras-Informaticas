/*
Archivo: Ejercicio8Video189.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 8 - Video 189.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.util.*;

public class Ejercicio8Video189 {
    public static void main(String[] args) {
        HashMap<String, Producto> productos = new  HashMap<>();
        
        productos.put("001", new Producto("Papa",1300));
        productos.put("002", new Producto("Arroz",2200));
        productos.put("003", new Producto("Gaseosa",1800));
        productos.put("004", new Producto("Doritos",4500));
        
        System.out.println(productos);
        productos.remove("003");
        System.out.println(productos);
        
        productos.put("004", new Producto("Maiz",2500));
        //Metodo For Each Para Los Productos
        for(Map.Entry<String, Producto> input:productos.entrySet()) {
            //Declaraciones en estilo horizontal
            String key = input.getKey(); Producto value = input.getValue();
            //Impresion
            System.out.println("Ficha: " + key + " Valor: " + value);
        }
        System.out.println("--------------------------");
        System.out.println("Ejecucion Finalizada");
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "[Producto = " + nombre + ", Precio = $" + precio + "]";
    }
    
}