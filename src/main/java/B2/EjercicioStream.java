package B2;

import javax.swing.*;
import java.util.stream.IntStream;
public class EjercicioStream {
    public static void main(String[] args) {
        // Pedir al usuario el rango inicial y final
        int inicio = 1;
        int fin = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número final:", "Ejercicio Stream", JOptionPane.QUESTION_MESSAGE));

        // Verificar si el inicio es menor o igual que el fin
        if (inicio <= fin) {
            // Mostrar números pares en el rango
            System.out.println("Números pares en el rango [" + inicio + ", " + fin + "]:");
            IntStream.rangeClosed(inicio, fin)
                    .filter(num -> num % 2 == 0)
                    .forEach(System.out::print);
            System.out.println(); // Salto de línea

            // Mostrar números impares en el rango
            System.out.println("Números impares en el rango [" + inicio + ", " + fin + "]:");
            IntStream.rangeClosed(inicio, fin)
                    .filter(num -> num % 2 != 0)
                    .forEach(System.out::print);
            System.out.println(); // Salto de línea
        } else {
            JOptionPane.showMessageDialog(null, "Error: El número inicial debe ser menor o igual que el número final.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}