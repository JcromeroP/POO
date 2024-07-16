public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Pedro", "Pascal", 48, "Mandaloriano");

        System.out.println(persona1.darNombreCompleto() + " tine " + persona1.edad + " años y está recibido de "
                + persona1.carrera.nombre);
        // System.out.println(persona1.enviarSaludo("Sergie code"));

    } 
}
