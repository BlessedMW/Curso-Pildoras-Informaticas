/*
Archivo: Ejercicio12Video79.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 12 - Video 79.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio12Video79 {

    public static void main(String[] args) {
        //Declaracion y ajuste
        VentAcc vtn = new VentAcc();
        vtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class VentAcc extends JFrame {

    public VentAcc() {
        //Ajuste de ventana
        setTitle("Testing");
        setVisible(true);
        //setBounds(1920 / 2 - 150, 1080 / 2 - 100, 900, 900);
        setBounds(getHeight(), getWidth(), 700, 600);

        //Contenedor
        ContenedorAcc ContAcc = new ContenedorAcc();
        add(ContAcc);
        
    }
}

class ContenedorAcc extends JPanel {

    public ContenedorAcc() {
        //Inicializacion
        Accion agua = new Accion("Agua", new ImageIcon("src/JSE_Modulo_2/agua.png"), Color.BLUE);
        Accion soda = new Accion("Soda", new ImageIcon("src/JSE_Modulo_2/soda.png"), Color.RED);
        Accion cafe = new Accion("Cafe", new ImageIcon("src/JSE_Modulo_2/cafe.png"), Color.BLACK);
        //Adicion
        add(new JButton(agua));
        add(new JButton(soda));
        add(new JButton(cafe));
        //Declaraciones extra
        InputMap mp = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); 
        mp.put(KeyStroke.getKeyStroke("A"), "Agua Aux");
        mp.put(KeyStroke.getKeyStroke("S"), "Soda Aux");
        mp.put(KeyStroke.getKeyStroke("C"), "Cafe Aux");
        //ActionMap
        ActionMap actM = getActionMap();
        actM.put("Agua Aux", agua);
        actM.put("Soda Aux", soda);
        actM.put("Cafe Aux", cafe);
    }

    private class Accion extends AbstractAction {

        public Accion(String nm, Icon icon, Color color) {
            //Acciones asociadas
            putValue(Action.NAME, nm);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "Colorear fondo del color de " + nm);
            putValue("Background_Color", color);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //Acciones asociadas
            Color color = (Color) getValue("Background_Color");
            setBackground(color);
            //Impresion
            System.out.println("Bebida: " + getValue(NAME));
            
            
            
        }
    }
    
    
}
