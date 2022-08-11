/*
Archivo: Ejercicio6Video142.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 6 - Video 142.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 3>.
 */

package JSE_Modulo_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6Video142 {
    public static void main(String[] args) {
        //Impresiones iniciales
        System.out.println("Menu Concurso App");
        System.out.println("1. Registrarse");
        System.out.println("2. Salir");
        //Declaraciones
        Scanner teclado = new Scanner(System.in);
        int tec = teclado.nextInt();
        
        if(tec==1) {
            //Excepcion
            try {
                askData();
            } catch(Exception e) { 
            System.out.println("Se ingresaron datos erroneos, comience el registro nuevamente.");
        }
        } else if(tec==2){
            System.out.println("Concurso App 2022");
            System.exit(0);
        }else {
            System.out.println("Se ingresó una opcion erronea, reinicie nuevamente el programa.");
            System.exit(0);
        }      
        teclado.close();      
    }
    
    static void askData(){
        //Scanner
        Scanner entTeclado = new Scanner(System.in);
        //Recopilacion de datos
        System.out.println("Introduzca su nombre");       
        String nombre = entTeclado.nextLine();
        System.out.println("Introduzca su telefono");       
        String telefono = entTeclado.nextLine();
        System.out.println("Introduzca su documento de identidad");       
        int id = entTeclado.nextInt();     
        System.out.println("Introduce tu edad, por favor");
        int edad = entTeclado.nextInt();
        
        System.out.println("--Registro Completado--");
        entTeclado.close();        
        System.out.println("\n------------------\nParticipante #"+ (int)(Math.random()*10+1) + "\n------------------\nNombre: " + nombre + "\nTelefono: " + telefono + "\nID: " + id + "\nEdad: " + edad + "\n------------------");
    }
}