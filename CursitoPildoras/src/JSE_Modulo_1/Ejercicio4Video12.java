/*
Archivo: Ejercicio4Video12.java.
Profesor: Luis Yovany Romo Portilla.
Ejercicio 4 - Video 12.
Autor:  
- Jean Steven Martinez Morcillo <jean.morcillo@correounivalle.edu.co>.
- <Curso Java SE Pildoras Informaticas Modulo 1>.
*/

package JSE_Modulo_1;

public class Ejercicio4Video12
{
    public static void main(String[] args)
    {
        //Inicializacion de variables
        String nombre1 = "Jean";
        String nombre2 = "Steven";
        String nombres = nombre1 + " " + nombre2;
        String apodo = "Blessed";
        String frase = "Hola Amigo";
        String subFrase = frase.substring(0, 5);
        String frase2 = subFrase + "Mundo";
        int posicionUltimaLetra = nombre1.length()-1;
        Boolean sonIguales = frase2.equals("Hola mundo"); //Teniendo en cuenta minusculas y mayusculas
        Boolean sonIgualesSCM = frase2.equalsIgnoreCase("Hola mundo"); //Sin tener en cuenta minisculas y mayusculas
        
        //Impresion en consola
            //Nombres
        System.out.println("------------------------");
        System.out.println("Mi primer nombre es " + nombre1);
        System.out.println("Mi segundo nombre es " + nombre2);
        System.out.println("Mi nombre completo es " + nombres);
        System.out.println("Mi nombre " + nombres + " tiene " + (nombre1+nombre2).length() + " letras");
        System.out.println("La ultima letra de mi nombre" + nombre2 + " es " + nombre2.charAt(posicionUltimaLetra));
            //Apodo
        System.out.println("------------------------");
        System.out.println("Mi apodo es " + apodo);    
        System.out.println("La primera letra de mi apodo " + apodo + " es " + apodo.charAt(0));
            //Verificar igualdad de cadenas
        System.out.println("------------------------");
        System.out.println("La frase a revisar es: " + frase2);
        System.out.println("La frase " + frase2 + " es igual a la frase " + "Hola mundo teniendo en cuenta minusculas y mayusculas: " + sonIguales);
        System.out.println("La frase " + frase2 + " es igual a la frase " + "Hola mundo sin tener en cuenta minusculas y mayusculas: " + sonIgualesSCM);
    }
}
