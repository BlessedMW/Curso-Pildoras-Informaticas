/*
Archivo: Ejercicio14Video85.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 14 - Video 85.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;

public class Ejercicio14Video85 {
    public static void main(String[] args) {
        Calculadora window = new Calculadora();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Calculadora extends JFrame {
    public Calculadora() {
        //Ajuste y declaracion
        setTitle("Calculadora Univalle");
        setSize(700,700);
        setLocationRelativeTo(null);
        setResizable(false);
        ContenedorCalculadora contenedorClc = new ContenedorCalculadora();       
        add(contenedorClc);
        setVisible(true);
    }  
}

class ContenedorCalculadora extends JPanel {
    //Declaracion
    String uOperacion = "Resultado";
    JButton pantalla = new JButton("0");
    JButton mostrarResultado = new JButton("Resultado");
    private JPanel botones;
    private boolean start = true;
    private JPanel bar;
    private double resultado = 0;
    
    
    public ContenedorCalculadora() {
        //Declaracion y ajuste
        setLayout(new BorderLayout());
        pantalla.setEnabled(false);
        mostrarResultado.addActionListener(new acEvento2());
        bar = new JPanel();
        bar.setLayout(new GridLayout(2, 1));
        bar.add(pantalla);
        bar.add(mostrarResultado);
        add(bar, BorderLayout.NORTH);
        botones = new JPanel();
        botones.setLayout(new GridLayout(4, 4));
        //Botones de la calculadora
        addButton("7"); addButton("8"); addButton("9"); addButton("/"); addButton("4"); addButton("5"); addButton("6"); addButton("*"); addButton("1"); addButton("2"); addButton("3"); addButton("-"); addButton("C"); addButton("0"); addButton("."); addButton("+");        
        add(botones, BorderLayout.CENTER);  
    }
    
    private void addButton(String label) {
        //Declaraciones
        String formato = "^\\d+$";
        JButton boton = new JButton(label);
        Pattern pattern = Pattern.compile(formato);
        Matcher mch = pattern.matcher(label);
        //Metodo de botones y operaciones
        if(!mch.matches() && !label.equals(".")) {
            boton.addActionListener(new acEvento2());
        } else {
            boton.addActionListener(new acEvento());
        }
        //Agregado
        botones.add(boton);
    }

    private class acEvento implements ActionListener {
        @Override 
        public void actionPerformed(ActionEvent evento) { //Evento
            if(start) {
                pantalla.setText("");
                start = false;
            }
            String strEntrada = evento.getActionCommand();
            pantalla.setText(pantalla.getText() + strEntrada);
        }
    }
    
    private class acEvento2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {         
            String operator = evento.getActionCommand();
            if(operator.equals("C")) {
                resultado = 0;
                pantalla.setText("0");               
            } else {
                operar(Double.parseDouble(pantalla.getText()));
                uOperacion = operator;                
            }
            start = true; 
        }       
    }
    
    private void operar(double number) {
        switch (uOperacion) {
            //Casos de operaciones 
            case "Resultado" -> resultado = number; case "+" -> resultado += number; case "-" -> resultado -= number; case "*" -> resultado *= number; case "/" -> resultado /= number; default -> {
            }
        }
        //Impresion opcional (si se desean colocar las operaciones en la consola)
        //System.out.println("Numero: " + number + " \nResultado: " + resultado);   //Impresion en pantalla del resultado
        pantalla.setText(Double.toString(resultado));
    }
}