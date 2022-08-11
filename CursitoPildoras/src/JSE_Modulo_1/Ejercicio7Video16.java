/*
Archivo: Ejercicio7Video16.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 7 - Video 16.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import java.util.Scanner;

public class Ejercicio7Video16
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Scanner
        System.out.println("Introduce un numero");
        int num = input.nextInt(); //Variable tipo entero
        
        if((num%2)==0) {
            System.out.println("El numero ingresado es par");
        } else if((num%2)!=0) {
            System.out.println("El numero ingresado es impar");
        
    }
}
}

    
