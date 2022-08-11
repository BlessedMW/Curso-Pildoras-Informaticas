/*
Archivo: Ejercicio9Video73.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 9 - Video 73.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio9Video73 {
    public static void main(String[] args) {
        VentEM VEM = new VentEM();
        VEM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Detener al cerrar ventana
    }
}

class VentEM extends JFrame {
    public VentEM() {
        //Ajuste de Ventana
        setSize(500,500);
        setTitle("Eventos con el raton");
        setVisible(true); 
        setResizable(false);
        //Eventos
        addMouseListener(new eventosMouse());
        //addMouseMotionListener(new MyMouseMotionListener()); //Puede trabar la PC
    }
}

class eventosMouse extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent raton) { 
        int ratonEvento = raton.getModifiersEx();
        //Eventos de raton
        switch (ratonEvento) {
            case MouseEvent.BUTTON1_DOWN_MASK ->
                System.out.println("Click Izquierdo");
                
            case MouseEvent.BUTTON2_DOWN_MASK -> System.out.println("Rueda de Ratón");
            
            case MouseEvent.BUTTON3_DOWN_MASK -> System.out.println("Click Derecho");
            
            default -> System.out.println("Error, informacion de evento no disponible o no existe.");
        }
    }
}

//La siguiente clase queda documentada porque los metodos incluidos en la misma pueden trabar la PC.

/*
class MyMouseMotionListener implements MouseMotionListener { // Para el movimiento
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("El ratón se esta arrastrando"); //Puede trabar la PC
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("El ratón se esta moviendo"); //Puede trabar la PC
    }
}
*/