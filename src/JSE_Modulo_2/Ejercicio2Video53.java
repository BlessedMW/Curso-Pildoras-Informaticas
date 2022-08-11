/*
Archivo: Ejercicio2Video53.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 2 - Video 53.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Ejercicio2Video53 {
    public static void main(String[] args) {
        //Igual que el ejercicio anterior, solo que de manera distinta
        //Declaracion
        Clock tiempo = new Clock();
        tiempo.running(1000, true);
        
        //Ventana Emergente
        JOptionPane.showMessageDialog(null, "Se esta imprimiendo en consola la hora actual cada segundo, click en OK para detener");
        System.exit(0); //Detener programa
    }
}

class Clock {
    public void running(int intervalo, final boolean sonido) {
        class getTimeAux implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date tiempo = new Date(); // Constructor
                System.out.println("Hora:" + tiempo);
                if(sonido) Toolkit.getDefaultToolkit().beep();//HYP
            }
        }
        
        //Creacion
        getTimeAux actionListener = new getTimeAux();
        Timer tiempito = new Timer(intervalo, actionListener);
        tiempito.start();
    }
}