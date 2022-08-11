/*
Archivo: Ejercicio5Video183.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 5 - Video 183.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.util.*;

public class Ejercicio5Video183 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Arroz", "0001", 2200);
        Producto producto2 = new Producto("Aceite de Girasol", "0002", 12000);
        Producto producto3 = new Producto("Insta Ramen", "0003", 1500);
        Producto producto4 = new Producto("Nissin Ramen", "0004", 1500);
        Producto producto5 = new Producto("Aceite de Girasol", "0002", 12000);
        Producto producto6 = new Producto("Cafe", "0005", 6400);
        Set<Producto> supermercadoProductos = new HashSet<Producto>();
        //Adiciones en estilo horizontal
        supermercadoProductos.add(producto1); supermercadoProductos.add(producto2); supermercadoProductos.add(producto3); supermercadoProductos.add(producto4); supermercadoProductos.add(producto5); supermercadoProductos.add(producto6);
        //Iterator
        Iterator<Producto> stockIt = supermercadoProductos.iterator();
        //Ciclo While
        System.out.println("---------------------\nLista de Productos\n---------------------\nNombre - ID - Precio\n---------------------");
        while(stockIt.hasNext()) {
            Producto currentClient = stockIt.next();
            //Declaraciones en estilo horizontal
            String nombre = currentClient.getNombre(); String id = currentClient.getId(); double precio = currentClient.getPrecio();
            //Impresiones
            System.out.println(nombre + " " + " " + id + " " + precio);
            
        }
        System.out.println("---------------------");
        //Comparamos dos pares de productos
        //Par 1
        System.out.println("Verificar si: " + producto3.getNombre() + " y " + producto4.getNombre() + " son los mismos productos:");
        if(producto3.equals(producto4)) {
            System.out.println("Estamos hablando del mismo producto.");
        } else {
            System.out.println("Son productos totalmente diferentes.");
        }
        System.out.println("HashCode Producto 3: " + producto3.hashCode());
        System.out.println("HashCode Producto 4: " + producto4.hashCode());
        //Par 2
        System.out.println("---------------------");
        System.out.println("Verificar si: " + producto2.getNombre() + " y " + producto5.getNombre() + " son los mismos productos:");
        if(producto2.equals(producto5)) {
            System.out.println("Estamos hablando del mismo producto.");
        } else {
            System.out.println("Son productos totalmente diferentes.");
        }
        System.out.println("HashCode Producto 2: " + producto2.hashCode());
        System.out.println("HashCode Producto 5: " + producto5.hashCode());
        
        
    }
}

class Producto {
    private String nombre;
    private String id;
    private double precio;
    
    public Producto(String nombre, String id, double precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        //Metodo HashCode en estilo horizontal
        int code = 5; code = 83 * code + Objects.hashCode(this.id); return code;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(obj==null) {
            return false;
        }
        if(getClass()!=obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj; return Objects.equals(this.id, other.id);
    }
    
    //Metodos setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}