/*
Archivo: Ejercicio13Video22.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 13 - Video 22.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import javax.swing.JOptionPane;

public class Ejercicio13Video22
{
    public static void main(String[] args)
    {
    //Factorial de un numero
    long numero = Long.parseLong(JOptionPane.showInputDialog("Introduce un numero"));
    long resultado = 1;
    
    for(long i = numero; i > 0; i--) {
        resultado *= i;
    }
    System.out.println("¡El factorial de " + numero + " es " + resultado + "!");
}
}

    
