package B3;

public class Registraduria {

    public static void main(String[] args) {
        consultarInformacion("1144162764");
    }

    public static Persona consultarInformacion(String cedula){
        Persona persona = new Persona(cedula,"Mauricio","35","Masculino");



        System.out.println(persona.identificacion);
        System.out.println(persona.edad);
        System.out.println(persona.nombre);
        System.out.println(persona.getGenero());
        return persona;
    }

}