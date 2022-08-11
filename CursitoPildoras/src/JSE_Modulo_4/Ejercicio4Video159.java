/*
Archivo: Ejercicio4Video159.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 4 - Video 159.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio4Video159 {
    static File archivo = new File("src" + File.separator);
    public static void main(String[] args) {
        CrearNuevoArchivoODirectorio("Te_Amo_Jesucristo", 1);
    }
    public static void showFileList(String[] listaArchivos) {       
        for(String archivoActual:listaArchivos) {
            System.out.println(archivoActual);
            File archivo2 = new File(archivo,archivoActual);
            if(archivo2.isDirectory()) {
                String[] listaArchivosAux = archivo2.list();
                showFileList(listaArchivosAux);
            }
        }
    }
    
    public static void CrearNuevoArchivoODirectorio(String elemento,int modo) {
        archivo = new File(archivo, "JSE_Modulo_4/" + elemento);
        if(modo==0){    
            //Excepcion
            try {
                archivo.createNewFile();
            } catch(IOException excepcion) {
                System.out.println("Error al intentar crear el archivo.");
            }
        } else {
            archivo.mkdir();
        }
        JOptionPane.showMessageDialog(null, "Al cerrar la ventana se eliminará el archivo o directorio.");
        
        archivo.delete();             
    }
}