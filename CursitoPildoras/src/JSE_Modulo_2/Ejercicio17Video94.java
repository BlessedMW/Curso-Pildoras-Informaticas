/*
Archivo: Ejercicio17Video94.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 17 - Video 94.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Ejercicio17Video94 {
    public static void main(String[] args) {
        //Ejercicio
        VentRB ejercicio = new VentRB();
        ejercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentRB extends JFrame {
    public VentRB() {
        setTitle("Ejercicio 17 - Video 94");
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        ContenedorRB vRB = new ContenedorRB();       
        add(vRB);
        setVisible(true);
    }
}

class ContenedorRB extends JPanel {
    //Declaracion
    private JLabel lbl = new JLabel("¡Cristo viene pronto!");
    private JRadioButton btn1 = new JRadioButton("Pequeño"), btn2 = new JRadioButton("Mediano"), btn3 = new JRadioButton("Grande"), btn4 = new JRadioButton("Muy grande");
    ButtonGroup grupo = new ButtonGroup();
    JPanel contenedor = new JPanel();
    //Constructor
    public ContenedorRB() {
        setLayout(new BorderLayout());
        lbl.setFont(new Font("Arial", Font.BOLD, 10));
        add(lbl, BorderLayout.CENTER);
        JRadioButton[] botones = {btn1, btn2, btn3, btn4}; //Array de botones
        ajBotones(botones); //Agregarlos al contenedor
        setBackground(Color.CYAN);
        contenedor.setBackground(Color.red);
        btn1.setBackground(Color.yellow);
        btn2.setBackground(Color.yellow);
        btn3.setBackground(Color.yellow);
        btn4.setBackground(Color.yellow);
        
    }

    private void ajBotones(JRadioButton[] botones) {
        //Declaracion
        int tamañoFuente = 18;        
        //Ciclo for
        for(JRadioButton boton:botones) {
            //Declaracion
            tamañoFuente += 4;
            final int tamañoFuenteAux = tamañoFuente;
            //Evento
            boton.addActionListener((ActionEvent evento) -> {                               
                lbl.setFont(new Font("Arial", Font.BOLD, tamañoFuenteAux));
            });
            //Ajustes
            grupo.add(boton);
            contenedor.add(boton);         
        }
        add(contenedor, BorderLayout.SOUTH);
    }
}