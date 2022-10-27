/**
 * Exercise: 7
 *
 * @version: 06/10/2022 14:14
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que declare variables de tipo char y de tipo String.
 * Intenta mostrarlas por pantalla todas juntas en la misma línea y con una sola
 * sentencia de Java (con un solo println) ¿es posible?
 */

public class Ejercicio7 {

    public static void main(String[] args) {
        char a;
        char b;
        String s1;
        String s2;
        a = 'a';
        b = 'b';
        s1 = "String 1";
        s2 = "String 2";
        System.out.println(a + "" + b + s1 + s2);
    }
}
