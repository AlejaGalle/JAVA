package B3;

abstract class Figura {
    // Método abstracto sin implementación
    abstract double calcularArea();

    // Método concreto con implementación
    void mostrarInformacion() {
        System.out.println("Esta es una figura.");
    }
}