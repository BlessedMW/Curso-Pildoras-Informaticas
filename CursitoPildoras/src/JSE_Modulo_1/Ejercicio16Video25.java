/*
Archivo: Ejercicio16Video25.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 16 - Video 25.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

public class Ejercicio16Video25
{
    public static void main(String[] args)
    {    
        int[][] arrayEn2D = {
        {1, 2, 3},
        {4, 5, 6}
        };
        
        for(int[] columna:arrayEn2D) { 
            for(int number:columna) { 
                System.out.print(number + " "); 
            }
            System.out.println("");
        }        
}
}

    
