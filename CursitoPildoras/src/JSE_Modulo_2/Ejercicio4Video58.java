/*
Archivo: Ejercicio4Video58.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 4 - Video 58.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import java.awt.*;
import javax.swing.*;

public class Ejercicio4Video58 {
    public static void main(String[] args) {
        //Ajuste de ventana
        VentanaVt ventanita = new VentanaVt();
        ventanita.setResizable(false);
        ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentanaVt extends JFrame {
    public VentanaVt() {
        this.setVisible(true);
        this.setSize(600, 400);
        
        ContenedorVt contenedor = new ContenedorVt();
        add(contenedor); //Agregamos el panel contenedor a la ventana
    }
}

class ContenedorVt extends JPanel {
    @Override
    public void paintComponent(Graphics arg) {
        super.paintComponents(arg);
        arg.drawString("Pildoras Informaticas", 200, 200);
        arg.drawString("Univalle", 200, 300);
    }
}