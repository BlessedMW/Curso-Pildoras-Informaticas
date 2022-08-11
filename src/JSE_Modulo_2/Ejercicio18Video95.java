/*
Archivo: Ejercicio18Video95.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 18 - Video 95.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio18Video95 {
    public static void main(String[] args) {
        VentCB ejCB = new VentCB();      
    }
}

class VentCB extends JFrame {
    public VentCB() {
        //Ajuste de ventana
        setTitle("Ejercicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        //Declaracion
        ContenedorCB ccb = new ContenedorCB();       
        add(ccb);
        setVisible(true);
    }
}

class ContenedorCB extends JPanel {
    private JLabel lbl = new JLabel("¡Cristo Viene Pronto!");
    private JComboBox cb1 = new JComboBox();
    
    public ContenedorCB() {
        setLayout(new BorderLayout());

        lbl.setFont(new Font("Arial", Font.BOLD, 30));
        add(lbl, BorderLayout.CENTER);
        cb1.setEditable(true);
        cb1.addItem("Cristo Te Ama");
        cb1.addItem("Cristo Es La Verdad Y La Vida");
        cb1.addItem("Cristo Murió Por Ti");
        cb1.addItem("Cristo Es Tu Libertad");
        cb1.setBackground(Color.red);
        cb1.addActionListener(new actionListener());
        add(cb1, BorderLayout.NORTH);
        setBackground(Color.CYAN);
    }

    private class actionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            lbl.setText((String) cb1.getSelectedItem());
        }
    }

}