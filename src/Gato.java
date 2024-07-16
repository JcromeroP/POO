//Con extends especificamos que gato hereda de animal
public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        // Con la palabra super estamos asignado la información heredada
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }

}
