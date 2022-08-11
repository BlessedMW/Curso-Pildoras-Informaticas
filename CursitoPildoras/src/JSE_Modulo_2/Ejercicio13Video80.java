/*
Archivo: Ejercicio13Video80.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 13 - Video 80.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import java.awt.event.*;
import javax.swing.*;


public class Ejercicio13Video80 {
    public static void main(String[] args) {
        VentanaMlVn window = new VentanaMlVn();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

class VentanaMlVn extends JFrame {
    public VentanaMlVn() {
        //Inicializacion
        setTitle("Creador de ventanas");
        setResizable(false);
        ContMlVn contenedor = new ContMlVn();
        setBounds(500,200, 200, 100);
        add(contenedor);
    }
    
}

class ContMlVn extends JPanel {
    JButton btnCerrar;
    
    public ContMlVn() {
        //Inicializacion
        JButton btnCrear = new JButton("Nuevo");
        btnCerrar = new JButton("Cerrar todo");
        add(btnCrear);
        add(btnCerrar);
        btnCrear.addActionListener(new cerrarVent());
    }

    //Cerrar Vent
    private class cerrarVent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VentAjst vtnn = new VentAjst(btnCerrar);
        }
    }
}

    //Vent Ajuste
class VentAjst extends JFrame {
    private static int i = 0; // # ventanas
    
    public VentAjst(JButton botonCerrar) {
        //Declaracion e inicializacion
        i++;
        setTitle("Ventanta #" + i);
        setBounds(40*i,40*i,300,150);
        setVisible(true);
        botonCerrar.addActionListener(new cerrarTodo());
    }

    //Cerrar todas las vent
    private class cerrarTodo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose(); //Cerrar
        }
    }
}