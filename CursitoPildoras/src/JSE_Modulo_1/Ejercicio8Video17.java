/*
Archivo: Ejercicio8Video17.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 8 - Video 17.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio8Video17
{
    public static void main(String[] args)
    {
        System.out.println("¿A que figura desea hallarle el area? : \n1. Cuadrado \n2. Triangulo \n3. Rectángulo \n4. Circulo"); 
        Scanner tec = new Scanner(System.in);       
        int teclado = tec.nextInt();
       
        switch(teclado) {
            case 1:
                //Area de cuadrado
                System.out.println("Introduzca el lado: "); 
                Scanner tec2 = new Scanner(System.in);
                int teclado2 = tec.nextInt();
                System.out.println("El area del cuadrado es " + Math.pow(teclado2, 2));
                break;
            case 2:
                //Area de triangulo
                System.out.println("Introduzca la base: ");     
                Scanner tec3 = new Scanner(System.in);
                int teclado3 = tec3.nextInt();
                System.out.println("Introduzca la altura: ");     
                Scanner tec4 = new Scanner(System.in);
                int teclado4 = tec4.nextInt();
                System.out.println("El area del triangulo es " + (teclado3 * teclado4 / 2));
                break;
            case 3: 
                //Area de rectangulo
                System.out.println("Introduzca la base: ");     
                Scanner tec5 = new Scanner(System.in);
                int teclado5 = tec5.nextInt();
                System.out.println("Introduzca la altura: ");     
                Scanner tec6 = new Scanner(System.in);
                int teclado6 = tec6.nextInt();
                System.out.println("El area del triangulo es " + (teclado5 * teclado6));
                break;

            case 4: 
                //Area de circulo
                System.out.println("Introduzca el radio: "); 
                Scanner tec7 = new Scanner(System.in);
                int teclado7 = tec.nextInt();
                System.out.println("El area del circulo es: " + Math.pow(teclado7, 2) * Math.PI);
                break;
            default:
                System.out.println("Lo sentimos, has digitado una opcion que no se encuentra en el menu.");
        }
        
        
    }
}
