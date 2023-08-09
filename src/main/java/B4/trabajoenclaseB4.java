package B4;
import java.util.Scanner;
public class trabajoenclaseB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Ingresa el primer número: ");
                String input1 = scanner.nextLine();
                if (input1.isEmpty()) {
                    System.out.println("No ingresaste un numero. Por favor Ingresa un número.");
                    continue;
                }
                double numero1 = Double.parseDouble(input1);

                System.out.print("Ingresa el segundo número: ");
                String input2 = scanner.nextLine();
                if (input2.isEmpty()) {
                    System.out.println("Error: Ingresa un número.");
                    continue;
                }
                double numero2 = Double.parseDouble(input2);

                if (numero2 == 0) {
                    if (numero1 == 0) {
                        System.out.println("Indeterminación: 0 dividido entre 0.");
                    } else {
                        System.out.println("División por cero.");
                    }
                } else {
                    double resultado = numero1 / numero2;
                    if (Double.isInfinite(resultado) || Double.isNaN(resultado)) {
                        System.out.println("La división tiene indeterminación (ejemplo: 0 / 0).");
                    } else {
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }

            System.out.print("¿Deseas continuar? (s/n): ");
            String continuar = scanner.nextLine().toLowerCase();
            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Se ha finalizado el programa");
        System.out.println("Gracias por su visita");
    }
}