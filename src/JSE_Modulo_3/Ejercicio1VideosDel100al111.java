/*
Archivo: Ejercicio1VideosDel100al111.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 1 - Videos del 100 al 111.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.Action.NAME;


public class Ejercicio1VideosDel100al111 {
    public static void main(String[] args) {
        //Ventana
        VentTB vtb = new VentTB();
    }
}

class VentTB extends JFrame {
    public VentTB() {
        //Ajustes
        setTitle("Cristo Te Ama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
        getContentPane().setBackground(Color.orange);
        setLocationRelativeTo(null);
        //Declaracion
        acEv Cristo = new acEv("Cristo", new ImageIcon("src/JSE_Modulo_3/Cristo.jpg"));
        acEv Biblia = new acEv("Biblia", new ImageIcon("src/JSE_Modulo_3/Biblia.png"));
        acEv Israel = new acEv("Israel", new ImageIcon("src/JSE_Modulo_3/Israel.png"));
        Action Salir = new AbstractAction("Salir", new ImageIcon("src/JSE_Modulo_3/Salir.png")) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        //Menu
        JMenu menu = new JMenu("Cristo Te Ama");
        menu.add(Cristo);
        menu.add(Biblia);
        menu.add(Israel);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);
        //Tool Bar
        JToolBar toolBar = new JToolBar();
        toolBar.add(Cristo);
        toolBar.add(Biblia);
        toolBar.add(Israel);
        toolBar.addSeparator();
        toolBar.add(Salir);
        toolBar.setBackground(Color.orange);
        add(toolBar, BorderLayout.NORTH);
        setVisible(true);
    }
    
    private class acEv extends AbstractAction {
        public acEv(String name, Icon icon) {
            //putValues en estilo horizontal
            putValue(Action.NAME, name); putValue(Action.SMALL_ICON, icon); putValue(Action.SHORT_DESCRIPTION, "¡Cristo Viene Pronto!");
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            if(getValue(NAME)=="Cristo"){
                System.out.println("Cristo Es La Verdad Y La Vida");
            }
            else if(getValue(NAME)=="Biblia"){
                System.out.println("Porque la palabra de Dios es viva y eficaz, y más cortante que toda espada de dos filos; y penetra hasta partir el alma y el espíritu, las coyunturas y los tuétanos, y discierne los pensamientos y las intenciones del corazón");
            }
            else if(getValue(NAME)=="Israel"){
                System.out.println("Dios Bendiga a Israel");
            }
        }     
    }    
}