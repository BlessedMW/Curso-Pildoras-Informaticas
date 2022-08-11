/*
Archivo: Ejercicio4Video120.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 4 - Video 120.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.*;

public class Ejercicio4Video120 {
    public static void main(String[] args) {
        VentLa vtn = new VentLa();
    }
}

class VentLa extends JFrame {
    //Constructor
    public VentLa() {   
        //Ajustes
        setTitle("Ejercicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        //Declaracion
        ContenedorLa myPanel = new ContenedorLa();       
        add(myPanel);
        setVisible(true);
    }
}

class layoutManager implements LayoutManager {
    private int x, y;
    
    @Override
    public void addLayoutComponent(String name, Component comp) {
        //Metodo Abstracto
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        //Metodo Abstracto
    }

    @Override
    public Dimension preferredLayoutSize(Container contenedor) {        
        return null;       
    }

    @Override
    public Dimension minimumLayoutSize(Container contenedor) {      
        return null;
    }

    @Override
    public void layoutContainer(Container contenedor) {
        //Declaracion en estilo horizontal
        int ancho = contenedor.getWidth(); x = ancho / 2;
        //Ciclo For
        for(int i = 0;i < contenedor.getComponentCount();i++) {
            //Declaracion y ajuste de componente
            Component componente = contenedor.getComponent(i); componente.setBounds(x - 100, y, 100, 20); x += 100;
            //Condicional para ordenar
            if(((i+1)%2)== 0) {
                x = ancho / 2; y += 40;
            }
        }
    }
    
}

class ContenedorLa extends JPanel {
    
    public ContenedorLa() {
        //Layout Personalizado
        setLayout(new layoutManager());
        setBackground(Color.green);
        //Declaraciones
        JLabel nombre = new JLabel("Nombre:");
        JTextField nombreIngresado = new JTextField();
        JLabel edad = new JLabel("Edad:");
        JTextField edadIngresada = new JTextField();
        JLabel nacionalidad = new JLabel("Nacionalidad:");
        JTextField nacionalidadIngresada = new JTextField();
        JLabel empresa = new JLabel("Empresa:");
        JTextField empresaIngresada = new JTextField();
        
        //Adiciones en estilo horizontal
        add(nombre); add(nombreIngresado); add(edad); add(edadIngresada); add(nacionalidad); add(nacionalidadIngresada); add(empresa); add(empresaIngresada);
    }
}