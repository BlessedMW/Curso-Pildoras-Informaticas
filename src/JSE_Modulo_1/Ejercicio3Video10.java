/*
Archivo: Ejercicio3Video10.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 3 - Video 10.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

public class Ejercicio3Video10 {
    public static void main(String[] args)
    {
        //Inicializacion de variables
        double numero1 = 169; //Variable tipo decimal
        double raizNumero1 = Math.sqrt(numero1); // Retorna la raiz de dicho numero 
        double mitadNumero1 = numero1/2;
        double numero2 = 4.8293; //Variable tipo decimal
        int numero2Redondeado = (int) Math.round(numero2); //Retorna el numero 2 redondeado  
        float numero3 = 2.345f; //Variable tipo decimal corto
        int numero3Redondeado = (int) Math.round(numero3); //Retorna el numero 3 redondeado    
        int cuadrado1 = (int) Math.pow(numero1, numero2); // Retorna el numero 1 elevado al numero 2
        int cuadrado2 = (int) Math.pow(numero2, numero1); // Retorna el numero 2 elevado al numero 1
        int cuadrado3 = (int) Math.pow(numero1, numero3Redondeado); //Retorna el numero 1 elevado al numero 3 redondeado
        int cuadrado4 = (int) Math.pow(raizNumero1, mitadNumero1); //Retorna la raiz del numero 1 elevado a la mitad del numero 1

        //Impresion en consola
        System.out.println("La raiz cuadrada del numero " + numero1 + " es: " + raizNumero1);
        System.out.println("La mitad del numero " + numero1 + " es: " + mitadNumero1);
        System.out.println("El numero " + numero2 + " redondeado es: " + numero2Redondeado);
        System.out.println("El numero " + numero3 + " redondeado es: " + numero3Redondeado);
        System.out.println("El numero " + numero1 + " elevado al numero " + numero2 + " es:" + cuadrado1);
        System.out.println("El numero " + numero2 + " elevado al numero " + numero1 + " es:" + cuadrado2);
        System.out.println("El numero " + numero1 + " elevado al numero " + numero3Redondeado + " es:" + cuadrado3);
        System.out.println("El numero " + raizNumero1 + " elevado al numero " + mitadNumero1 + " es:" + cuadrado4);
    }
}