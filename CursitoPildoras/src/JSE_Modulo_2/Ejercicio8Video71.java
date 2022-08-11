/*
Archivo: Ejercicio8Video71.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 8 - Video 71.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.event.*;


public class Ejercicio8Video71 {
    public static void main(String[] args) {
        VentTecEv VTE = new VentTecEv();
        VTE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VTE.setResizable(false);
    }
}

class VentTecEv extends JFrame {
    public VentTecEv() {
        setTitle("Events with the keyboard");
        setVisible(true); 
        setSize(500,500);
        addKeyListener(new EventoTeclado());  
    }
}

class EventoTeclado implements KeyListener {
    
    //Eventos
    
    @Override
    public void keyTyped(KeyEvent tecla) {
        char teclado = tecla.getKeyChar();
        System.out.println(teclado);
    }
    
    @Override
    public void keyPressed(KeyEvent tecla) {
        int teclado = tecla.getKeyCode();
        System.out.println(teclado); // Mostramos en consola el código de la tecla presionada
    }

    @Override
    public void keyReleased(KeyEvent tecla) {
        //Metodo abstracto
    }

}
