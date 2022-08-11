/*
Archivo: Ejercicio20Video100.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 20 - Video 100.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import java.awt.Image;
import javax.swing.*;

public class Ejercicio20Video100 {
    public static void main(String[] args) {
        //Ventana
        VentMen bM = new VentMen();        
    }
}

class VentMen extends JFrame {
    public VentMen() {
        //Ajustes
        setTitle("Barra Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        //Declaracion
        ContenedorM myPanel = new ContenedorM();       
        add(myPanel);
        setVisible(true);
    }
}

class ContenedorM extends JPanel {
    //Declaraciones
    JMenuBar barraMenu = new JMenuBar();
    JMenu archivo = new JMenu("Archivo");
    JMenu editar = new JMenu("Edicion");
    JMenu herramientas = new JMenu("Herramientas");
    JMenu opciones = new JMenu("Opciones");
    JMenuItem guardar = new JMenuItem("Guardar");
    JMenuItem guardarComo = new JMenuItem("Guardar como");
    JMenuItem cortar = new JMenuItem("Cortar");
    JMenuItem copiar = new JMenuItem("Copiar");
    JMenuItem pegar = new JMenuItem("Pegar");
    JMenuItem general = new JMenuItem("Generales");
    JMenuItem opcion1 = new JMenuItem("Diseño");
    JMenuItem opcion2 = new JMenuItem("Plantilla");
    //Constructor
    public ContenedorM() {
        //Declaraciones en estilo horizontal
        barraMenu.add(archivo); barraMenu.add(editar); barraMenu.add(herramientas);
        opciones.add(opcion1); opciones.add(opcion2);
        archivo.add(guardar); archivo.add(guardarComo);
        editar.add(cortar); editar.add(copiar); editar.add(pegar); editar.addSeparator(); editar.add(opciones);       
        herramientas.add(general);
        add(barraMenu);          
    }
}