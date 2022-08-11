/*
Archivo: Ejercicio16Video89.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 16 - Video 89.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 2>.
 */

package JSE_Modulo_2;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

public class Ejercicio16Video89 {
    public static void main(String[] args) {
        //Checker
        VentPswdCheck pswdChecker = new VentPswdCheck();
        pswdChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Detener al cerrar la ventana
    }
}

class VentPswdCheck extends JFrame {
    public VentPswdCheck() {
        //Declaracion y ajuste
        setTitle("Password Format Checker");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(300,130);
        ContPswdCheck contCh = new ContPswdCheck();       
        add(contCh);
        setVisible(true);
    }
}

class ContPswdCheck extends JPanel {
    //Declaraciones
    private JLabel lblContraseña = new JLabel("Contraseña");
    private JPasswordField pfContraseña = new JPasswordField(15);
    private JButton estado = new JButton("Estado:");
    //Constructor
    public ContPswdCheck() {
        //Declaraciones y ajustes
        setLayout(new BorderLayout());
        JPanel top = new JPanel(new GridLayout(20, 2));
        Document doc = pfContraseña.getDocument();
        doc.addDocumentListener(new documentListener());  
        estado.setEnabled(false);
        top.setBackground(Color.ORANGE);
        top.add(lblContraseña);
        top.add(pfContraseña);
        add(top, BorderLayout.NORTH);
        top.add(estado);
    }
    
    //Verificar longitud de la contraseña
    private void verificarLongitud(char[] contraseña) {
        int longitud = contraseña.length;
        if(longitud < 8 || longitud > 20) {
            pfContraseña.setBackground(Color.RED);
            estado.setText("Estado: invalida");
        } else if(longitud>=8 || longitud <= 20){
            pfContraseña.setBackground(Color.GREEN);
            estado.setText("Estado: valida");
        } else if(longitud==0){
            pfContraseña.setBackground(Color.WHITE);
            estado.setText("Estado:");
        }     
    }
    
    //Document Listener
    private class documentListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent evento) { // Cuando se ingresa texto 
            verificarLongitud(pfContraseña.getPassword());
        }

        @Override
        public void removeUpdate(DocumentEvent evento) { // Cuando se borra texto
            verificarLongitud(pfContraseña.getPassword());
        }

        @Override
        public void changedUpdate(DocumentEvent evento) {
            //Metodo abstracto sin uso
        }
        
    }
}