/*
Archivo: Ejercicio7Video147.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 7 - Video 147.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import javax.swing.JOptionPane;

public class Ejercicio7Video147 {
    public static void main(String[] args) {
        //Declaracion
        String email = JOptionPane.showInputDialog("Email");
        //Excepcion
        try {
           checkEmail(email); 
        } catch(leEmail excp) {
            System.out.println("No se ha introducido un email valido.");
            excp.printStackTrace();
        }
            
    }
    
    static void checkEmail(String email) throws leEmail {
        boolean Arr = false; 
        boolean Pnt = false; 
        int longitudEmail = email.length();
        //Metodo de verificacion
        if(longitudEmail<=3) {
            throw new leEmail("El email ingresado es demasiado corto");
        } else {
            for(int i=0;i<longitudEmail;i++) {
                char ltr = email.charAt(i);
                if(ltr=='@') {
                    if(!Arr) {
                        Arr = true;
                    } else {
                        Arr = false;
                        break;
                    } 
                } else if(ltr == '.') {
                    if(!Pnt) {
                        Pnt = true;        
                    }               
                }
            }                    
        }    
        //Impresion
        System.out.println("Email " + email + " registrado correctamente.");
    }
}

class leEmail extends Exception {   
    public leEmail() {
    }    
    
    public leEmail(String message) {
        super(message);
    }  
}