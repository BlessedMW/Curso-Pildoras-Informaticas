/*
Archivo: Ejercicio2Video115.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 2 - Video 115.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import java.awt.Color;
import javax.swing.*;

public class Ejercicio2Video115 {
    public static void main(String[] args) {
        VentLog miVentanita = new VentLog();
        
    }
}

class VentLog extends JFrame {
    public VentLog() {
        //Ajustes
        setTitle("Ejercicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setResizable(true); //Se puede redimensionar para poder apreciar la disposicion en caso de que asi se desee
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.orange);
        //Declaracion
        JLabel lblEmail = new JLabel("Email:");
        JTextField emailIngresado = new JTextField(10);
        emailIngresado.setMaximumSize(emailIngresado.getPreferredSize());
        //Cajas
        Box caja1 = Box.createHorizontalBox();
        Box caja2 = Box.createHorizontalBox();
        Box caja3 = Box.createHorizontalBox();
        Box caja4 = Box.createVerticalBox();
        //Adiciones en estilo horizontal
        caja1.add(lblEmail); caja1.add(Box.createHorizontalStrut(10)); caja1.add(emailIngresado);
        //Password
        JLabel password = new JLabel("Password:");
        JTextField passwordIngresada = new JTextField(10);
        passwordIngresada.setMaximumSize(emailIngresado.getPreferredSize());
        //Adiciones en estilo horizontal
        caja2.add(password); caja2.add(Box.createHorizontalStrut(10)); caja2.add(passwordIngresada);
        //Botones
        JButton boton1 = new JButton("Ok");
        JButton boton2 = new JButton("Cancelar");
        //Adiciones en estilo horizontal
        caja3.add(boton1); caja3.add(Box.createGlue()); caja3.add(boton2);
        caja4.add(caja1); caja4.add(caja2); caja4.add(caja3);
        //Ajustes
        add(caja4);
        setVisible(true);
    }
}