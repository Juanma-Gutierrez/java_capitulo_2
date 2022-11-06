/**
 * Exercise: 5
 *
 * @version: 06/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        // Var declarations
        int pesetas;
        float conver;

        // Var init
        conver = 166.386f;
        pesetas = 1000;

        // Output results
        System.out.print(
                pesetas + " pesetas son: " + (int) (pesetas * conver) + " euros");
    }
}
