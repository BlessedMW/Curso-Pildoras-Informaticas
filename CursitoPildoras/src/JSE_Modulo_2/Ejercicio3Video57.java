/*
Archivo: Ejercicio3Video57.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 3 - Video 57.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import java.awt.*;
import javax.swing.*;

public class Ejercicio3Video57 {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true); //Hacer visible la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Detener programa al cerrar la ventana
        ventana.setResizable(false); //Establecer que la ventana no se pueda redimensionar
    }
}

class Ventana extends JFrame {
    public Ventana() {
        //Titulo de ventana
        this.setTitle("Ventanita"); // Para darle un titulo a la ventana
        //Declaracion
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension pantallaDim = pantalla.getScreenSize();
        int altura = pantallaDim.height;
        int ancho = pantallaDim.width;
        //Ajustes de ventana
        this.setSize(ancho / 2, altura / 2);
        this.setLocation(ancho / 4, altura / 4);
        Image myIcon = pantalla.getImage("src/JSE_Modulo_2/icono.png");
        this.setIconImage(myIcon);
    }
}