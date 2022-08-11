/*
Archivo: Ejercicio6Video63.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 6 - Video 63.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
*/

package JSE_Modulo_2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Ejercicio6Video63 {
    public static void main(String[] args) {
        //Inicio
        Ventana ventana = new Ventana();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Detener al cerrar ventana
    }
}

class Ventana extends JFrame {
    public Ventana() {
        setTitle("Testing");
                
        setBounds(1920 / 2 - 150, 1080 / 2 - 100, 300, 200);
        
        ContenedorPn contenedorPpal = new ContenedorPn();
        contenedorPpal.setForeground(Color.BLUE);
        add(contenedorPpal);
        setVisible(true);
    }
}

class ContenedorPn extends JPanel {
    private Image imagen;
    
    public ContenedorPn() {
        //Imagen Set
        File img = new File("src/JSE_Modulo_2/icono2.png");
        //Excepcion
        try {
        imagen = ImageIO.read(img); //Catch Exception
        } catch(IOException excepcion) {
            System.out.println("Imagen no encontrada...");
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        
        if(imagen!= null) {
            int imgAltura = imagen.getHeight(this); //Getter de altura
            int imgAncho = imagen.getWidth(this); //Getter de Ancho
        
            g.drawImage(imagen,0,0,null); //Draw -> Image
        
            //Ciclo for
            for(int a = 0;a < 300;a += imgAncho){ //AEX
                for(int b = 0;b < 200;b += imgAltura){ //AEY
                    g.copyArea(0,0,imgAncho,imgAltura,a,b);
                }    
            }            
        } else {
            g.drawString("Imagen no encontrada...",10,10); //Mensaje de error en caso de excepcion
        }
        g.drawLine(0,0,0,200);
    }
}

