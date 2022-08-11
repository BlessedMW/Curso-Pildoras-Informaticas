/*
Archivo: Ejercicio11Video75.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 11 - Video 75.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.event.*;


public class Ejercicio11Video75 extends JFrame implements WindowFocusListener{
    
    public static void main(String[] args) {
        Ejercicio11Video75 VE = new Ejercicio11Video75();
        VE.start();
    }
    
    //Ventanas
    Ejercicio11Video75 vtn1;
    Ejercicio11Video75 vtn2;
    
    public void start() {
        
        //Declaracion Vtn 1
        vtn1 = new Ejercicio11Video75();
        vtn1.setVisible(true);
        vtn1.setBounds(300,100, 300, 200);
        vtn1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vtn1.addWindowFocusListener(this);
        //Declaracion Vtn 2
        vtn2 = new Ejercicio11Video75();
        vtn2.setVisible(true);
        vtn2.setBounds(600,100, 300, 200);
        vtn2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vtn2.addWindowFocusListener(this);
    }
    
    //Focos
    
    @Override
    public void windowGainedFocus(WindowEvent vtne) {
        Ejercicio11Video75 vtnAux1 = (Ejercicio11Video75) vtne.getSource();
        vtnAux1.setTitle("Ventana Activa");
    }

    @Override
    public void windowLostFocus(WindowEvent vtne) {
        Ejercicio11Video75 vtnAux2 = (Ejercicio11Video75) vtne.getSource();
        vtnAux2.setTitle("-----");
    }
}