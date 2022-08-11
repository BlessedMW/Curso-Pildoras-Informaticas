/*
Archivo: Ejercicio6Video15.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 6 - Video 15.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio6Video15
{
    public static void main(String[] args)
    {
        //Entradas de teclado por el usuario
        String nombre = JOptionPane.showInputDialog("Introduzca su nombre"); //Para ingresar nombre desde ventana emergente
        
        String edadStr = JOptionPane.showInputDialog("Ingrese su edad"); //Para ingresar edad desde ventana emergente
        int edad = Integer.parseInt(edadStr); //Pasamos la edad recibida como string en la ventana emergente a un dato tipo entero
        System.out.println("Hola " + nombre + " naciste en el año " + (2022-edad) + " o " + (2021-edad));
        
        System.out.println("Introduzca un numero, para imprimir su raiz cuadrada:"); 
        Scanner teclado = new Scanner(System.in); //Entrada de teclado
        float number = (float) teclado.nextDouble();
        System.out.printf("La raiz cuadrada de " + number + " es: %1.2f",Math.sqrt(number));
        
    }
}
