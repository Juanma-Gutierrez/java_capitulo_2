/**
 * Exercise: 1
 *
 * @version: 06/10/2022 13:16
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asígnales los valores 144 y 999 respectivamente. A continuación, muestra por
 * pantalla el valor de cada variable, la suma, la resta, la división y la
 * multiplicación.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        int x;
        int y;
        x = 144;
        y = 999;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + ((float) x / (float) y));
    }
}
