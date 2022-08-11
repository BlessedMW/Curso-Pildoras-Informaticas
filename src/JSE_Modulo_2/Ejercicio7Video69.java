/*
Archivo: Ejercicio7Video69.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 7 - Video 69.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio7Video69 {
    public static void main(String[] args) {
        //Ajuste Vent1
        VentCopy vtC1 = new VentCopy();
        vtC1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Esto cierra abruptamente el programa
        vtC1.setBounds(1920 / 2 - 200, 1080 / 2 - 100, 300, 200);
        //Ajuste Vent2
        VentCopy vtC2 = new VentCopy();
        vtC2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vtC2.setBounds(1920 / 2 + 200, 1080 / 2 - 100, 300, 200);
    }
}

class VentCopy extends JFrame {
    public VentCopy() {
        //Ajuste Ventana
        setTitle("Eventos de ventana");
        setVisible(true);
        setResizable(false);
        
        //Evento
        ventanaEvento listener = new ventanaEvento();
        addWindowListener(listener); // Va a escuchar a la ventana, también podemos addWindowListener(new MyWindowListener());
    }
}

class ventanaEvento extends WindowAdapter {
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Presente en la ventana...");
    }  
}