/*
Archivo: Ejercicio8Video148.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 8 - Video 148.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import javax.swing.JOptionPane;

public class Ejercicio8Video148 {
    public static void main(String[] args) {
        //Excepcion
        try {
            division();
        } catch(ArithmeticException excepcion) {
            System.out.println("Indeterminacion: el divisor es 0.");
        } catch(NumberFormatException excepcion) {
            System.out.println("No se ha introducido un numero entero.");
            System.out.println(excepcion.getMessage());
            System.out.println("Se ha generado un error del tipo " + excepcion.getClass().getName() + ".");
        }
    }
    
    static void division() {
        //Declaracion
        int a = Integer.parseInt(JOptionPane.showInputDialog("Dividendo:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Divisor:"));
        //Impresion
        System.out.println(a + "/" + b + " = " + a / b);
        
    }
}