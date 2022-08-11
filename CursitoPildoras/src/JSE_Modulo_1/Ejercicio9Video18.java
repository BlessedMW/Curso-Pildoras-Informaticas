/*
Archivo: Ejercicio9Video18.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 9 - Video 18.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio9Video18
{
    public static void main(String[] args)
    {
        String contraseña = "123";
        String contraseñaIngresada = "";
        
        while(!contraseñaIngresada.equals(contraseña)) { 
            //Ciclo While para solicitar contraseña hasta que se ingrese la correcta
            contraseñaIngresada = JOptionPane.showInputDialog("Introduzca la contraseña");
            if(!contraseñaIngresada.equals(contraseña)) {
                System.out.println("Contraseña incorrecta...");
            }
        }       
        
        System.out.println("Contraseña correcta, bienvenido al sistema.");
}
}

    
