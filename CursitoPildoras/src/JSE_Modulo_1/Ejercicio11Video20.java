/*
Archivo: Ejercicio11Video20.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 11 - Video 20.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio11Video20
{
    public static void main(String[] args)
    {
        //Guess my number con Do While
        int numeroIngresado = 0;
        
        System.out.println("Ingrese un numero"); 
        Scanner tec = new Scanner(System.in);       
        int numero = tec.nextInt();
        System.out.println("-----------------"); 
        System.out.println("¡Vamos a intentar adivinar el numero!"); 
        Scanner tec2 = new Scanner(System.in);       
        numeroIngresado = tec.nextInt();
        
        do{
            tec2 = new Scanner(System.in);
            numeroIngresado = tec.nextInt();
            if(numeroIngresado>numero){
                System.out.println("¡El numero es mas pequeño!"); 
                System.out.println("\n-----------------"); 
            }
            else if(numeroIngresado<numero){
                System.out.println("¡El numero es mas grande!"); 
                System.out.println("\n-----------------"); 
            }
        }
        while(numeroIngresado!=numero);
        
        System.out.println("¡Felicidades, has adivinado el numero!");
        
}
}

    
