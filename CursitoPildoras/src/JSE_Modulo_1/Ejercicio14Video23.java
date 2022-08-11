/*
Archivo: Ejercicio14Video23.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 14 - Video 23.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import javax.swing.JOptionPane;

public class Ejercicio14Video23
{
    public static void main(String[] args)
    {
        int[] lista = {1, 2, 3 , 4, 5};
        String[] lista2 = {"A","B","C","D","E"};
        
        for(int i = 0; i < lista.length; i++) {
            System.out.println("El valor de la posicion "+ i + " de la primera lista es: " + lista[i]);
            System.out.println("El valor de la posicion "+ i + " de la segunda lista es: " + lista2[i]);
            System.out.println("------------------");
        } 
}
}

    
