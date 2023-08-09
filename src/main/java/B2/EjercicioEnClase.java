package B2;

import B3.Persona;

import javax.swing.*;

public class EjercicioEnClase {

    public static void main(String[] args) {
        String inputFin = JOptionPane.showInputDialog(null, "Ingrese el número final:", "Ejercicio For-If", JOptionPane.QUESTION_MESSAGE);
        Persona persona=new Persona();

        int inicio = 1;
        int fin = Integer.parseInt(inputFin);


        if (inicio <= fin) {
            // Mostrar números pares en el rango
            JOptionPane.showMessageDialog(null, "Números pares en el rango [" + inicio + ", " + fin + "]:");
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0) {
                    System.out.print( i+ " ");


                }
            }
            System.out.println(); // Salto de línea

            // Mostrar números impares en el rango
            JOptionPane.showMessageDialog(null, "Números impares en el rango [" + inicio + ", " + fin + "]:");
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Salto de línea
        } else {
            JOptionPane.showMessageDialog(null, "Error: El numero debe ser mayor a 1", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}