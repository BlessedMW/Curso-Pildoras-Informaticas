/*
Archivo: Ejercicio2Video7y8.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 2 - Video 7 y 8.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

public class Ejercicio2Video7y8
{
    public static void main(String[] args)
    {
        //Inicializacion de variables solicitadas
        final double dolar = 1.137; // Variable constante tipo decimal equivalente al precio del dolar en la otra moneda
        final double salario = 2125.70; //Variable constante tipo decimal equivalente al salario en la otra moneda
        double salarioEnDolares = salario * dolar; //Variable tipo decimal encargada de hacer la conversion del salario en dolares
        String nombre = "Manuel"; //Variable tipo texto
        
        //Impresion en consola
        System.out.println("El salario en dolares de " + nombre + " es: " + salarioEnDolares);
    }        
}