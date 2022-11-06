/**
 * Exercise: 4
 *
 * @version: 06/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        // Var declarations
        float euros;
        float conver;

        // Var init
        conver = 166.386f;
        euros = 1000f;

        // Output results
        System.out.print(
                euros + " euros son: " + (int) (euros * conver) + " pesetas");
    }
}
