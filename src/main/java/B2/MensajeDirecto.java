package B2;

import java.util.Scanner;

public class MensajeDirecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar el número máximo al usuario
        System.out.print("Ingrese el número máximo: ");
        int numeroMaximo = scanner.nextInt();

        // Paso 2 y 3: Calcular y mostrar los números pares e impares en grupos ordenados
        System.out.println("Números pares:");
        for (int i = 1; i <= numeroMaximo; i++) {
            if (esPar(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmeros impares:");
        for (int i = 1; i <= numeroMaximo; i++) {
            if (!esPar(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Paso 2: Función para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}