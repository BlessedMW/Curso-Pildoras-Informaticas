/*
Archivo: Ejercicio1Video153.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 1 - Video 153.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.io.*;

public class Ejercicio1Video153 {
    public static void main(String[] args) {
        escribirArchivo.escribir();
        leerArchivo.leer();
    }
}

class leerArchivo {
    public static void leer() {
        //Excepcion
        try {
            //Declaracion
            FileReader lectorArchivo = new FileReader("src/JSE_Modulo_4/archivo.txt");
            int codigoLetra = lectorArchivo.read();
            //Ciclo While
            while(codigoLetra!=-1) {               
                System.out.println("COD" + codigoLetra + " => Letra: " + (char) codigoLetra);
                codigoLetra = lectorArchivo.read();
            }
            lectorArchivo.close();
        } catch (IOException excepcion) { 
            System.out.println("Error al intentar leer el archivo.");
        }
    }
}

class escribirArchivo {
    public static void escribir() {
        //Declaracion
        String parrafo = "En la tumba de mahoma estan los huesos de mahoma.\nEn la tumba de buda están los huesos de buda.\nNo hay idolo que haya resucitado todavia.\nSolo Cristo, al tercer dia dejó la tumba vacia.";
        //Excepcion
        try {
            FileWriter escritorEnArchivo = new FileWriter("src/JSE_Modulo_4/archivo.txt");
            //Ciclo For
            for(int i = 0; i < parrafo.length(); i++) {
                escritorEnArchivo.write(parrafo.charAt(i));
            }
            escritorEnArchivo.close();
        } catch (IOException excepcion) { // Es el tipo de excepcion que lanza el metodo leer
            System.out.println("Error al intentar escribir en el archivo.");  
        }
    }
}