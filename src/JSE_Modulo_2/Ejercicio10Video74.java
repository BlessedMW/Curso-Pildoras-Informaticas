/*
Archivo: Ejercicio10Video74.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 10 - Video 74.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;


public class Ejercicio10Video74 {
    public static void main(String[] args) {
        VentFoc ej = new VentFoc();
        ej.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentFoc extends JFrame {
    public VentFoc() {
        setTitle("EF");
        setSize(400,400);
        setVisible(true);
        setResizable(false);
        ContenedorFoc CF = new ContenedorFoc();       
        add(CF);   
    }
}

class ContenedorFoc extends JPanel {
    JTextField txt1;
    JTextField txt2;
    
    @Override
    public void paintComponent(Graphics arg) {
        
        //Declaracion inicial
        super.paintComponent(arg);
        setLayout(null);
        
        //Caja de texto 1
        txt1 = new JTextField();
        txt1.setBounds(125, 0, 60, 30);
        add(txt1);
        txt1.addFocusListener(new eventoFoco());
        //Caja de texto 2
        txt2 = new JTextField();
        txt2.setBounds(125,120, 60, 30);
        add(txt2);
    }
    
    private class eventoFoco implements FocusListener { 
        @Override
        public void focusGained(FocusEvent e) { //Gana
            System.out.println("La caja de texto 1 ha ganado el foco. Recuerda que en ella debes colocar algun caracter para que retorne true");
        }

        @Override
        public void focusLost(FocusEvent e) { //Pierde
            System.out.println("La caja de texto 1 ha perdido el foco. Recuerda que en ella debes colocar algun caracter para que retorne true");
            
            String str = txt1.getText();
            
            boolean tieneCar = false;

            if(str.length()>=1){
                tieneCar = true;
            }
            else if(str.length()==0){
                tieneCar = false;
            }
            System.out.println(tieneCar);   
        }     
    }
}