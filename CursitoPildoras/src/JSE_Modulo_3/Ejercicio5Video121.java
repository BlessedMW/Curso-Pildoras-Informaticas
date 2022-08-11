/*
Archivo: Ejercicio5Video121.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 5 - Video 121.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Ejercicio5Video121 {
    public static void main(String[] args) {		
        MyFrame32 window = new MyFrame32();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					
    }
}

class MyFrame32  extends JFrame{		
    public MyFrame32 () {
        //Ajustes
        setTitle("Ejercicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,110);
        setResizable(false);
        setLocationRelativeTo(null);
        //Declaracion
        ContenedorOP cop = new ContenedorOP();       
        add(cop);
        setVisible(true);		
    }		
}

class ContenedorOP  extends JPanel {
    //Declaraciones
    private JButton boton1 = new JButton("Boton1");;
    private JButton boton2 = new JButton("Boton2");;
    private JButton boton3 = new JButton("Boton3");;
    private JButton boton4 = new JButton("Boton4");;
        
    public ContenedorOP() {					
        //Adicion de eventos en estilo horizontal
        boton1.addActionListener(new alEventos()); boton2.addActionListener(new alEventos()); boton3.addActionListener(new alEventos()); boton4.addActionListener(new alEventos());
        //Adicion en estilo horizontal
        add(boton1); add(boton2); add(boton3); add(boton4);
    }
			
    private class alEventos implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent evento) {
            JButton pressedButton = (JButton) evento.getSource();
            
            if (pressedButton==boton1) {
		JOptionPane.showMessageDialog(ContenedorOP.this, "Boton 1", "Ventana Boton 1", 2);
                System.out.println("Usado: Boton 1");
            } else if(pressedButton==boton2) {
		JOptionPane.showInputDialog(ContenedorOP.this, "Email", "Email Getter", 3);
                System.out.println("Usado: Boton 2");
            } else if(pressedButton==boton3) {
		JOptionPane.showConfirmDialog(ContenedorOP.this, "¡Cristo Te Ama!", "Cristo Te Ama", 2);
                System.out.println("Usado: Boton 3");
            } else if(pressedButton==boton4){
		JOptionPane.showOptionDialog(ContenedorOP.this, "¿Despues de eliminar el contacto desea bloquearlo?", "Eliminar contacto", 1, 1, null, null,null);
                System.out.println("Usado: Boton 4");
            }
        }	
    }
	
}