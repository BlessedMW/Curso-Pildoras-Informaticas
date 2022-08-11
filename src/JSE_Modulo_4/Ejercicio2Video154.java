/*
Archivo: Ejercicio2Video154.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 2 - Video 154.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.io.*;

public class Ejercicio2Video154 {
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
            FileReader lectorArchivo = new FileReader("src/JSE_Modulo_4/archivo2.txt"); 
            BufferedReader br = new BufferedReader(lectorArchivo);
            String line = br.readLine();
            //Ciclo While
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            lectorArchivo.close();
        } catch (IOException excepcion) {
            System.out.println("Error al intentar leer el archivo.");
        }
    }
}

class escribirArchivo {
    public static void escribir() {
        String[] sentences = {
            "En la tumba de mahoma estan los huesos de mahoma.\nEn la tumba de buda están los huesos de buda.\nNo hay idolo que haya resucitado todavia.\nSolo Cristo, al tercer dia dejó la tumba vacia.",
            "\nTe Amo Cristo."
        };
        try {
            FileWriter escritorEnArchivo = new FileWriter("src/JSE_Modulo_4/archivo2.txt");
            BufferedWriter bw = new BufferedWriter(escritorEnArchivo);
            //Ciclo For Each
            for(String line:sentences) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }          
            escritorEnArchivo.close();
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo.");  
        }
    }
}