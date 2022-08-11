/*
Archivo: Ejercicio15Video87.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 15 - Video 87.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejercicio15Video87 {
    public static void main(String[] args) {
        //Checker de email
        VentEmailCheck checker = new VentEmailCheck();
        checker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para detener al cerrar la ventana
    }
}

class VentEmailCheck extends JFrame {
    public VentEmailCheck() {
        //Declaracion y ajuste de ventana
        setTitle("Email Format Checker");
        setResizable(false);        
        setSize(300, 100);
        setLocationRelativeTo(null);
        ContenedorEmailCheck contChecker = new ContenedorEmailCheck();       
        add(contChecker);
        setVisible(true);
        setBackground(Color.red);
    }
}

class ContenedorEmailCheck extends JPanel {
    //Declaraciones
    private JTextField cajaTxt = new JTextField(20);
    private JButton boton = new JButton("Comprobar");
    private JLabel check = new JLabel("", JLabel.CENTER);
    //Constructor
    public ContenedorEmailCheck() {
        //Ajuste y declaracion
        setLayout(new BorderLayout());
        JPanel contEC = new JPanel(new FlowLayout());
        contEC.setSize(300,100);
        JLabel email = new JLabel("Email:");
        contEC.add(email);
        boton.addActionListener(new checkEvento());
        contEC.add(cajaTxt);     
        contEC.add(boton);
        add(contEC);
        contEC.add(check);
        contEC.setBackground(Color.red);
    }
    
    private class checkEvento implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Declaracion
            String emailIngresado = cajaTxt.getText().trim();
            boolean Arr = false;
            boolean Punt = false;
            //Metodo con ciclo for
            for(int i = 0; i < emailIngresado.length(); i++) {
                //Declaracion
                char ltr = emailIngresado.charAt(i);
                //Metodo con condicionales
                if(ltr=='@') {
                    if(!Arr) {
                        Arr = true;
                    } else {
                        Arr = false;
                        break;
                    } 
                } else if(ltr=='.') {
                    if(!Punt) {
                        Punt = true;        
                    }               
}
            } 
            //Metodo con condicionales
            if(Arr && Punt) {
                check.setText("Valido");
            } else {
                check.setText("Invalido");
            }            
        }
        
    }
}