/*
Archivo: Ejercicio5Video60_61_62.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 5 - Video 60,61 y 62.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Ejercicio5Video60_61_62 {
        public static void main(String[] args) {
        VentanaPnV vtn = new VentanaPnV();
        vtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentanaPnV extends JFrame {
    public VentanaPnV() {
        //Ajuste de ventana
        setTitle("Draw");
        setVisible(true); 
        setResizable(false);
        setSize(320, 320);
        ContenedorPnV contenedorPpal = new ContenedorPnV();
        add(contenedorPpal);
    }
}

class ContenedorPnV extends JPanel {
    @Override
    public void paintComponent(Graphics dr) {
        //Declaracion
        Graphics2D str = (Graphics2D) dr;
        str.drawString("UV",0,0);
        str.setColor(Color.GREEN);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        super.paintComponents(dr);
        Graphics2D dr2 = (Graphics2D) dr; //Casting
        dr2.drawString("UV",40,20);
        dr2.setColor(Color.YELLOW);
        dr2.setFont(fuente);
        Rectangle2D fig = new Rectangle2D.Double(150 - 25, 160 - 25, 50, 50);
        dr2.draw(fig); // Metodo draw
        Ellipse2D elps = new Ellipse2D.Double(); // También hay dos elipses
        elps.setFrame(fig);
        //Draw pt1
        dr2.draw(elps);
        dr2.draw(new Line2D.Double(150, 0, 150, 320));
        dr2.draw(new Line2D.Double(0, 160, 320, 160));
        dr2.draw(new Line2D.Double(25, 0, 25, 320));
        dr2.draw(new Line2D.Double(0, 50, 320, 50));
        dr2.setColor(Color.red);
        //Coordenadas
        double X = fig.getCenterX();
        double Y = fig.getCenterY();
        //Draw pt 2
        Ellipse2D cl = new Ellipse2D.Double();
        cl.setFrameFromCenter(X, Y, 25, 50 );//XCenter + radio, YCenter + radio);
        dr2.draw(cl);
        //Impresion de coordenadas
        System.out.println("(" + X + ", " + Y + ")");
    }
}