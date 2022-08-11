/*
Archivo: Ejercicio18Video34.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 18 - Video 34.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

public class Ejercicio18Video34 {
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Arroz");
        producto1.setTipo("Alimento");
        System.out.println(producto1.getData());
        
        Producto producto2 = new Producto("Detergente");
        producto2.setTipo("Aseo");
        System.out.println(producto2.getData());
        
        Producto producto3 = new Producto("Paquete de Frituras");
        producto3.setTipo("Alimento");
        System.out.println(producto3.getData());
    }
}

class Producto {
    final   String nombre;
    private String tipo;
    
    public Producto(String nm){
        this.nombre = nm;
        tipo = "";
    }
    
    public void setTipo(String tp){
        this.tipo = tp;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getData(){
        return "El producto " + nombre + " es de tipo " + tipo + ".";
    }

}