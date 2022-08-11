/*
Archivo: Ejercicio15Video24.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 15 - Video 24.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import javax.swing.JOptionPane;

public class Ejercicio15Video24
{
    public static void main(String[] args)
    {
        int contador = 5;
        String [] productos = new String[5];
        for(int i = 0; i < contador; i++) {
            productos[i] = JOptionPane.showInputDialog("Introduce el producto " + (i + 1) + ":");
        }
        for (String producto:productos) {
            System.out.println("Producto: " + producto);
        }
}
}

    
