/**
 * Exercise: 8
 * 
 * @version: 06/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que declare 5 variables de tipo char. A continuación,
 * crea otra variable como cadena de caracteres y asígnale como valor la
 * concatenación de las anteriores 5 variables. Por último, muestra la cadena de
 * caracteres por pantalla ¿Qué problemas te encuentras? ¿cómo lo has
 * solucionado?
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        // Var declarations
        char a;
        char b;
        char c;
        char d;
        char e;
        String cadena;

        // Var init
        a = 'a';
        b = 'b';
        c = 'c';
        d = 'd';
        e = 'e';
        cadena = "" + a + b + c + d + e;

        // Output results
        System.out.print(cadena);
    }
}
