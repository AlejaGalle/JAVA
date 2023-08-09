package B3;

public class Main2 {

    public static void main(String[] args) {
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 3.0);

        System.out.println("Área del círculo: " + figura1.calcularArea());
        System.out.println("Área del rectángulo: " + figura2.calcularArea());

        figura1.mostrarInformacion();
        figura2.mostrarInformacion();
    }
}