/*
Archivo: Ejercicio19Video97.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 19 - Video 97.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Ejercicio19Video97 {
    public static void main(String[] args) {
        VentSL ejSL = new VentSL();
        
    }
}

class VentSL extends JFrame {
    public VentSL() {
        //Ajuste
        setTitle("Ejercicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420,420);
        setLocationRelativeTo(null); // Centrarlo en la pantalla
        //Declaracion
        ContenedorSL ej = new ContenedorSL();       
        add(ej);
        setVisible(true);
    }
}

class ContenedorSL extends JPanel {
    JSlider tamFuente = new JSlider(1 , 4, 1);
    private JLabel lbl = new JLabel("Cristo Viene Pronto");
    
    public ContenedorSL() {
        //Ajuste
        setLayout(new BorderLayout());
        lbl.setFont(new Font("Arial", Font.BOLD, 20));
        add(lbl, BorderLayout.CENTER);
        setBackground(Color.BLUE);
        lbl.setForeground(Color.YELLOW);
        //Ajustes de Slider
        tamFuente.setOrientation(SwingConstants.VERTICAL);
        tamFuente.setMajorTickSpacing(1);
        tamFuente.setMinorTickSpacing(1);
        tamFuente.setFont(new Font("Arial", Font.BOLD, 12));
        tamFuente.setPaintTicks(true);
        tamFuente.setPaintLabels(true);
        tamFuente.setSnapToTicks(true);
        tamFuente.addChangeListener(new cambiador());
        add(tamFuente, BorderLayout.NORTH);
        tamFuente.setBackground(Color.red);
    }

    private class cambiador implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            //Switch
            switch (tamFuente.getValue()) {
                case 1:
                    lbl.setText("Cristo Viene Pronto");
                    break;
                case 2:
                    lbl.setText("Cristo Te Ama");
                    break;
                case 3:
                    lbl.setText("Cristo Es La Verdad Y La Vida");
                    break;
                case 4:
                    lbl.setText("Cristo Es Tu Libertad");
                    break;
                default:
                    break;
            }
        }
    }

}