/*
Archivo: Ejercicio1Video52.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 1 - Video 52.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

class getTime implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        //Declaracion
        Date now = new Date();
        System.out.println("Hora:" + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

public class Ejercicio1Video52{
    public static void main(String[] args) {
        //Declaracion
        getTime evento = new getTime();
        Timer time = new Timer(1000, evento);
        time.start();
        
        //Ventana Emergente
        JOptionPane.showMessageDialog(null, "Se esta imprimiendo en consola la hora actual cada segundo, click en OK para detener");
        System.exit(0); // Detener programa
    }
}