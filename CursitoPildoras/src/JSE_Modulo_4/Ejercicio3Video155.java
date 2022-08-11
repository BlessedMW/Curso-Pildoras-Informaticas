/*
Archivo: Ejercicio3Video155.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 3 - Video 155.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio3Video155 {
    public static void main(String[] args) {
        escribirBytesArchivo.escribirArchivo(leerBytesArchivo.leerArchivo());
    }
}

class leerBytesArchivo {
    //Declaracion
    static ArrayList<Integer> bytesImagen = new ArrayList();
    //Metodo para leer archivo
    public static ArrayList<Integer> leerArchivo() {
        //Excepcion
        try {
            //Declaracion
            FileInputStream entrada = new FileInputStream("src/Yeshua.jpg");
            int inputByte = entrada.read(); // Mientras lee avanza
            //Ciclo While
            while(inputByte!=-1) {
                bytesImagen.add(inputByte);
                inputByte = entrada.read();
            }
            System.out.println(bytesImagen.size());
        } catch(IOException excepcion) {
            System.out.println("Error al intentar leer la imagen.");
        }
        return bytesImagen;        
    }
}

class escribirBytesArchivo {
    public static void escribirArchivo(ArrayList<Integer> imageBytes) {
        //Excepcion
        try {
            FileOutputStream salida = new FileOutputStream("src/JSE_Modulo_4/Yeshua_ImagenCopiada.jpg");
            //Ciclo For Each
            for(int imageByte:imageBytes) {
                salida.write(imageByte);
            }
            salida.close();
        } catch(IOException excepcion) {
            System.out.println("Error al intentar copiar la imagen.");
        }
         
    }
}