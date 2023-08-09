package B2;
import javax.swing.JOptionPane;

public class CalculadoraConJOptionPane {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese dos números
        String input1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);

        // Convertir los inputs a números enteros
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Realizar operaciones matemáticas básicas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;

        // Mostrar resultados en cuadros de diálogo
        JOptionPane.showMessageDialog(null, "Resultado de la suma: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Resultado de la resta: " + resta, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + multiplicacion, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Resultado de la división: " + division, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}