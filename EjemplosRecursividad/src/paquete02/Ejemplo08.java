/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio

        Scanner entrada = new Scanner(System.in);

        int tamañoArreglo;

        System.out.println("Ingrese el tamaño del arreglo");
        tamañoArreglo = entrada.nextInt();

        int[] valorArreglo = new int[tamañoArreglo];

        for (int i = 0; i < tamañoArreglo; i++) {
            System.out.println("Ingrese el valor:");
            valorArreglo[i] = entrada.nextInt();

            System.out.printf("\nEl total es: %d\n", misterio(valorArreglo,
                    valorArreglo.length));
        }
    }

    public static int misterio(int[] arreglo, int tamaño) {

        if (tamaño == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamaño - 1] + misterio(arreglo, tamaño - 1);
        }
    }

}
