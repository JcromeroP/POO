public class Persona {

    // Atributos (estado/características de un objeto)
    public String nombre;
    public String apellido;
    public int edad;
    Carrera carrera;
    // Métodos (comportamiento de un objeto)

    // Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrera, boolean estaEnCurso) {
        carrera = new Carrera(nombreCarrera, duracionCarrera, estaEnCurso);
        //this: se va a referiir a nuestros atributos de clase Persona
        //public String nombre //Esta info me la manda desde el main
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera.nombre = nombreCarrera;
    }
    // Sobrecarga del Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera) {
        carrera = new Carrera(nombreCarrera);
        //this: se va a referiir a nuestros atributos de clase Persona
        //public String nombre //Esta info me la manda desde el main
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera.nombre = nombreCarrera;
    }

    public String darNombreCompleto() {
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludado) {
        if (edad > 40)
            return "Buenos días, querido " + saludado;
        return "Hola, ¿cómo estás " + saludado + "?";
    }

}
