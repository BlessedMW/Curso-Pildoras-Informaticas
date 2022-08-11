/*
Archivo: Ejercicio3Video116.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 3 - Video 116.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import java.awt.Color;
import javax.swing.*;

public class Ejercicio3Video116 {
    public static void main(String[] args) {
        VentDs pD = new VentDs();
    }
}

class VentDs extends JFrame {
    public VentDs() {
        //Ajustes
        setTitle("Ejercicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,80);
        setResizable(false);
        setLocationRelativeTo(null);
        //Declaraciones
        ContenedorDs myPanel = new ContenedorDs();       
        add(myPanel);
        setVisible(true);
    }
}

class ContenedorDs extends JPanel {
    
    public ContenedorDs() {
        //Ajuste
        setBackground(Color.PINK);
        //SpringLayout
        SpringLayout layout = new SpringLayout();
        setLayout(layout); //Colocamos el layout creado arriba
        //Declaracion en estilo horizontal
        JButton boton1 = new JButton("Boton 1"); JButton boton2 = new JButton("Boton 2"); JButton boton3 = new JButton("Boton 3");
        //Adiciones en estilo horizontal
        add(boton1); add(boton2); add(boton3);
        //Ajustes Spring
        Spring spring = Spring.constant(0, 10, 100); Spring staticSpring = Spring.constant(80);
        layout.putConstraint(SpringLayout.WEST, boton1, spring, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.WEST, boton2, staticSpring, SpringLayout.EAST, boton1);
        layout.putConstraint(SpringLayout.WEST, boton3, staticSpring, SpringLayout.EAST, boton2);
        layout.putConstraint(SpringLayout.EAST, this, spring, SpringLayout.EAST, boton3);
    }
}