package B3;
import java.util.Scanner;
public class trabajoenclase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opciones;

        boolean loginExitoso = false;
        int intentosFallidos = 0;
        int intentosMaximos = 33;

        while (!loginExitoso && intentosFallidos < intentosMaximos) {

            System.out.println("Bienvenido a la pagína ComprasLocos ");
            System.out.println("Menu:");
            System.out.println("1. Comprar boleta");
            System.out.println("2. Vender boleta");
            System.out.println("3. Iniciar sesión");
            System.out.print("Seleccione una opción: ");
            opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Se dirigirá a la página para comprar boletas");
                    break;
                case 2:
                    System.out.println("Se dirigirá a la página para vender boletas");
                    break;
                case 3:
                    loginExitoso = hacerLogin();
                    if (loginExitoso) {
                        System.out.println("Inicio de sesión exitoso.");
                    } else {
                        intentosFallidos++;
                        System.out.println("Inicio de sesión fallido. Intentos restantes: " + (intentosMaximos - intentosFallidos));
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        if (intentosFallidos >= intentosMaximos) {
            System.out.println("Usuario bloqueado. Demasiados intentos fallidos.");
        }


    }

    public static boolean hacerLogin() {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorrecto = "aleja";
        String contraseñaCorrecta = "123";

        System.out.print("Usuario: ");
        String inputUsuario = scanner.next();
        System.out.print("Contraseña: ");
        String inputContraseña = scanner.next();

        return inputUsuario.equals(usuarioCorrecto) && inputContraseña.equals(contraseñaCorrecta);
    }


    }

