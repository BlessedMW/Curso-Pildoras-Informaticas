/*
Archivo: Ejercicio6Video185.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 6 - Video 185.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 4>.
 */

package JSE_Modulo_4;

import java.util.*;

public class Ejercicio6Video185 {
    public static void main(String[] args) {
        //Declaracion
        LinkedList<String> cosas = new LinkedList<>();
        LinkedList<String> tipo = new LinkedList<>();
        //Adicion de las cosas en estilo horizontal
        cosas.add("Lionel Messi"); cosas.add("Jarra"); cosas.add("Can"); cosas.add("Zapato");
        //Adicion del tipo en estilo horizontal
        tipo.add("Humano"); tipo.add("Objeto"); tipo.add("Animal"); tipo.add("Objeto");
        //Iterators
        ListIterator<String> It = cosas.listIterator();
        ListIterator<String> ItAux = tipo.listIterator();
        //Ciclo While
        while(It.hasNext()) {
            It.next();
            It.add(ItAux.next());
        }
        System.out.println(cosas);
        ItAux = tipo.listIterator();
        //Ciclo While Auxiliar
        while(ItAux.hasNext()) {
            ItAux.next();
            ItAux.next();
            ItAux.remove();
        }
        System.out.println(tipo);        
    };
}