/**
 * Exercise: 6
 *
 * @version: 06/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 */

public class Ejercicio6 {

    public static void main(String[] args) {
        float base;
        base = 12.5f;
        System.out.println(
                base +
                        " de base + 21% de IVA: " +
                        base *
                                0.21
                        +
                        "\tTotal factura: " +
                        base *
                                1.21);
    }
}
