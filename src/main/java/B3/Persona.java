package B3;

public class Persona {

    String identificacion;
    String nombre;
    String edad;
    private String genero;
    public Persona() {

    }

    public Persona(String identificacion, String nombre, String edad, String genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }


}