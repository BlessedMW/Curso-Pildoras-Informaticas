/*
Archivo: Ejercicio5Video14.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 5 - Video 14.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import java.util.Scanner;

public class Ejercicio5Video14
{
    public static void main(String[] args)
    {
        //Inicializacion de variables y/u objetos
        Scanner teclado = new Scanner(System.in); // Objeto de la clase Scanner
        String nombre;
        int edad;
        
        //Entrada del usuario por teclado   
        System.out.println("Introduzca su nombre");    
        nombre = teclado.nextLine();
        System.out.println("Introduzca su edad");        
        edad = teclado.nextInt();        
        
        //Impresion final
        System.out.println("Hola " + nombre + ", El año pasado tenias " + (edad - 1) + " años, el proximo año tendrás " + (edad +1) + " años" + " y dentro de 10 años tendrás " + (edad + 10) + " años.");
    }    
}
