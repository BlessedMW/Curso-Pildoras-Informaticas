/*
Archivo: Ejercicio17Video26.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 17 - Video 26.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

public class Ejercicio17Video26
{
    public static void main(String[] args)
    {   
        //Declaración de variables
        double cont = 25000; //Variable tipo double
        int interes; //Variable tipo entero
        double[][] pago = new double[5][6]; //MAtriz de 5*6
        
        for(int i = 0; i < 6; i++) {
            pago[0][i] = 25000;
        }
        
        for(int i = 1; i < 5; i++) { //Renglon inicial
            interes = 10;
            
            for(int j = 0; j < 6; j++) {
                cont = pago[i - 1][j];
                cont += cont * interes / 100;
                pago[i][j] = cont;               
                interes++;                
            }
        }

        for(double[] row:pago) { //Matriz
            for(double number:row) { 
                System.out.printf("%1.2f", number);
                System.out.print(" ");
            }         
            System.out.println("");
        }      
}
}

    
