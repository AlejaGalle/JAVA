package B1;

public class trabajoenclaseB1 {


    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 5;
        int menor;

        if (numero1 < numero2) {
            menor = numero1;
        } else {
            menor = numero2;
        }

        System.out.println("El número menor es: " + menor);

        //  Calcule su edad a partir del año de nacimiento

        int añonacimiento = 1993;
        int añoactual = 2023;
        int edad = añoactual - añonacimiento;
        System.out.println("Tu edad es: " + edad + " años.");

    }
}
